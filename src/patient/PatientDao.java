/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patient;

import com.mysql.cj.util.StringUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import database.MedicalCenterDataBase;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Achinthya Dulshan
 */
public class PatientDao {

    // define variable for get database connection
    private MedicalCenterDataBase database;

    // default constructor
    public PatientDao() {
        database = new MedicalCenterDataBase();
    }

    // define method for insert patient to database
    // parameter --> Patient object
    public void insertPatient(Patient patient,JFrame PatientRegForm) {
        // Define SQL statement for insertion
        final String INSERT_PATIENT = "INSERT INTO patient (patientId, firstName, lastName, address, nic, gender, dob, bloodGroup) VALUES (?,?,?,?,?,?,?,?)";
        final String GET_LAST_PATIENT_ID = "SELECT max(patientId) FROM patient";
        final String INSERT_PATIENT_CONTACTS = "INSERT INTO patient_contact (contact_no_1 ,contact_no_2 ,patient_id) VALUES (?,?,?)";

        // Get a database connection
        Connection con = database.getDataBaseConnection();

        try {
            // Get the last patientId
            PreparedStatement getLastPatientIdStatement = con.prepareStatement(GET_LAST_PATIENT_ID);
            ResultSet rs = getLastPatientIdStatement.executeQuery();

            String lastPatientId = "";

            if (rs.next()) {
                lastPatientId = rs.getString(1);
            }

            // Increment the last patientId to get a new one
            int patientNumber = Integer.parseInt(lastPatientId.substring(2)) + 1;

            String patientId = "PT" + padWithZeros(Integer.toString(patientNumber), 13);

            // Insert new patient
            PreparedStatement patientStatement = con.prepareStatement(INSERT_PATIENT, PreparedStatement.RETURN_GENERATED_KEYS);
            patientStatement.setString(1, patientId);
            patientStatement.setString(2, patient.getFirstName());
            patientStatement.setString(3, patient.getLastName());
            patientStatement.setString(4, patient.getAddress());
            patientStatement.setString(5, patient.getNIC());
            patientStatement.setString(6, patient.getGender());
//            patientStatement.setDate(8, new java.sql.Date(patient.getDateOfBirth()));
            patientStatement.setString(7, patient.getDateOfBirth());
            patientStatement.setString(8, patient.getBloodGroup());
            
            patientStatement.executeUpdate();
            
            System.out.println("0-- " + patientStatement.getGeneratedKeys());

            // Get the auto-generated key (parent_id)
            int parentId;
            try (var generatedKeys = patientStatement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    parentId = generatedKeys.getInt(1);
                    System.out.println("id"+ parentId);
                } else {
                    throw new SQLException("Failed to get patient ID, no rows affected.");
                }
            }

            // Insert data into the child table using the obtained parent_id
            PreparedStatement patientContactStatement = con.prepareStatement(INSERT_PATIENT_CONTACTS);
            patientContactStatement.setString(1, patient.getContactNo_1());
            patientContactStatement.setString(2, patient.getContactNo_2());
            patientContactStatement.setInt(3, parentId);

            patientContactStatement.executeUpdate();

            JOptionPane.showMessageDialog(PatientRegForm, "Data inserted successfully");

            //close resources
            patientStatement.close();
            getLastPatientIdStatement.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    // padding patientId with 0
    private static String padWithZeros(String original, int targetLength) {

        int originalLength = original.length();

        if (originalLength >= targetLength) {
            return original; // No need to pad
        }

        int numberOfZerosToAdd = targetLength - originalLength;
        String zeros = "0".repeat(numberOfZerosToAdd);

        return zeros + original;
    }

    
    // fill patient table from database values
    public ResultSet fillTableData() {
        
        final String SELECT_PATIENT_DETAILS = "select patientId, firstName, lastName, address, nic, gender, dob, bloodGroup, contact_no_1, contact_no_2 from patient p, patient_contact c where p.id = c.patient_id";

        Connection con = database.getDataBaseConnection();
        PreparedStatement ps;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement(SELECT_PATIENT_DETAILS);
            rs = ps.executeQuery();


        } catch (SQLException e) {

            e.printStackTrace();
        } 

        return rs;
    }
    
    
}
