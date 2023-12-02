/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doctor;

import database.MedicalCenterDataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import patient.Patient;

/**
 *
 * @author Achinthya Dulshan
 */
public class DoctorDao {
    
     // define variable for get database connection
    private MedicalCenterDataBase database;

    // default constructor
    public DoctorDao() {
        database = new MedicalCenterDataBase();
    }

    // define method for insert patient to database
    // parameter --> Patient object
    public void insertMedicalStaff(Doctor doctor,JFrame DoctorRegForm) {
        
        // Define SQL statement for insertion
        final String INSERT_DOCTOR = "INSERT INTO medical_staff (staffId ,firstName ,lastName ,address ,nic ,licenseNumber ,Specialization ,dob ,gender) VALUES (?,?,?,?,?,?,?,?,?)";
        // SQL for get last patient Id
        final String GET_LAST_DOCTOR_ID = "SELECT max(staffId) FROM medical_staff";
        // SQL for insert patient contacts
        final String INSERT_DOCTOR_CONTACTS = "INSERT INTO staff_contact (contact_no_1 ,contact_no_2 ,medical_staff_id) VALUES (?,?,?)";

        // Get a database connection
        Connection con = database.getDataBaseConnection();

        try {
            // Get the last patientId
            PreparedStatement getLastDoctorIdStatement = con.prepareStatement(GET_LAST_DOCTOR_ID);
            ResultSet rs = getLastDoctorIdStatement.executeQuery();

            String lastDoctorId = "";

            if (rs.next()) {
                lastDoctorId = rs.getString(1);
            }

            // Increment the last patientId to get a new one
            int doctorNumber = Integer.parseInt(lastDoctorId.substring(2)) + 1;

            String doctorId = "MS" + padWithZeros(Integer.toString(doctorNumber), 13);

            // Insert new patient
            // staffId ,firstName ,lastName ,address ,nic ,licenseNumber ,Specialization ,dob ,gender
            PreparedStatement doctorStatement = con.prepareStatement(INSERT_DOCTOR, PreparedStatement.RETURN_GENERATED_KEYS);
            doctorStatement.setString(1, doctorId);
            doctorStatement.setString(2, doctor.getFirstName());
            doctorStatement.setString(3, doctor.getLastName());
            doctorStatement.setString(4, doctor.getAddress());
            doctorStatement.setString(5, doctor.getNic());
            doctorStatement.setString(6, doctor.getLicenseNumber());

            doctorStatement.setString(7, doctor.getSpecialization());
            doctorStatement.setString(8, doctor.getDob());
            doctorStatement.setString(9, doctor.getGender());
            
            // execute patient insertion
            doctorStatement.executeUpdate();

            // Get the auto-generated key (parent_id)
            int parentId;
            try (var generatedKeys = doctorStatement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    parentId = generatedKeys.getInt(1);
                    System.out.println("id"+ parentId);
                } else {
                    throw new SQLException("Failed to get Doctor ID, no rows affected.");
                }
            }

            // Insert data into the child table using the obtained parent_id
            PreparedStatement staffContactStatement = con.prepareStatement(INSERT_DOCTOR_CONTACTS);
            staffContactStatement.setString(1, doctor.getContactNo_1());
            staffContactStatement.setString(2, doctor.getContactNo_2());
            staffContactStatement.setInt(3, parentId);

            staffContactStatement.executeUpdate();

            JOptionPane.showMessageDialog(DoctorRegForm, "Data inserted successfully");

            //close resources
            getLastDoctorIdStatement.close();
            doctorStatement.close();
            staffContactStatement.close();
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
        
        final String SELECT_PATIENT_DETAILS = "select staffId ,firstName ,lastName ,address ,nic ,licenseNumber ,Specialization ,dob ,gender, contact_no_1, contact_no_2 from medical_staff m, staff_contact c where m.id = c.medical_staff_id";

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
