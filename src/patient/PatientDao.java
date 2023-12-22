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
    public void insertPatient(Patient patient) {

        // Define SQL statement for insertion
        final String INSERT_PATIENT = "INSERT INTO patient (patientId, firstName, lastName, address, nic, gender, dob, bloodGroup) VALUES (?,?,?,?,?,?,?,?)";
        // SQL for get last patient Id
        final String GET_LAST_PATIENT_ID = "SELECT max(patientId) FROM patient";
        // SQL for insert patient contacts
        final String INSERT_PATIENT_CONTACTS = "INSERT INTO patient_contact (contact_no_1 ,contact_no_2 ,patient_id) VALUES (?,?,?)";

        // Get a database connection
        try (Connection con = database.getDataBaseConnection()) {
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
            patientStatement.setString(7, patient.getDateOfBirth());
            patientStatement.setString(8, patient.getBloodGroup());

            // execute patient insertion
            patientStatement.executeUpdate();

            // Get the auto-generated key (parent_id)
            int parentId;
            try (var generatedKeys = patientStatement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    parentId = generatedKeys.getInt(1);
                    System.out.println("id" + parentId);
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

            //close resources
            getLastPatientIdStatement.close();
            patientStatement.close();
            patientContactStatement.close();
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

        final String SELECT_PATIENT_DETAILS = "select p.patientId, p.firstName, p.lastName, p.address, p.nic, p.gender, p.dob, p.bloodGroup, c.contact_no_1, c.contact_no_2 from patient p, patient_contact c where p.id = c.patient_id AND delete_status = 0";

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

    // define methods for delete patient
    public void deletePatient(Patient patient) {

        //define SQL Delete statement
        final String DELETE_PATIENT = "UPDATE patient SET delete_status = 1 WHERE patientId=?";

        //create connection 
        Connection con = database.getDataBaseConnection();

        try {

            PreparedStatement deletePatient = con.prepareStatement(DELETE_PATIENT);
            deletePatient.setString(1, patient.getPatientId());

            deletePatient.executeUpdate();

            JOptionPane.showMessageDialog(null, "Patient Deleted successfully");
            //close resources
            deletePatient.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void updatePatient(Patient patient) {

        final String UPDATE_PATIENT = "UPDATE patient SET firstname=? ,lastName=? ,address=? ,nic=? ,gender=? ,dob=? ,bloodGroup=? WHERE patientId=?";

        final String GET_SELECTED_PATIENT_ID = "SELECT id FROM patient WHERE patientId=?";

        final String UPDATE_PATIENT_CONTACTS = "UPDATE patient_contact SET contact_no_1=? ,contact_no_2=? WHERE patient_id=?";

        try (Connection con = database.getDataBaseConnection()) {
            // Update patient information
            try (PreparedStatement updatePatient = con.prepareStatement(UPDATE_PATIENT)) {
                updatePatient.setString(1, patient.getFirstName());
                updatePatient.setString(2, patient.getLastName());
                updatePatient.setString(3, patient.getAddress());
                updatePatient.setString(4, patient.getNIC());
                updatePatient.setString(5, patient.getGender());
                updatePatient.setString(6, patient.getDateOfBirth());
                updatePatient.setString(7, patient.getBloodGroup());
                updatePatient.setString(8, patient.getPatientId());

                // Execute patient update
                updatePatient.executeUpdate();
                updatePatient.close();
            }

            // Get patient ID
            int patientId = -1;
            try (PreparedStatement getPatientId = con.prepareStatement(GET_SELECTED_PATIENT_ID)) {
                getPatientId.setString(1, patient.getPatientId());

                // Execute query and retrieve the result set
                try (ResultSet rs = getPatientId.executeQuery()) {
                    // Check if there is a result
                    if (rs.next()) {
                        patientId = rs.getInt(1);
                    }
                }
                getPatientId.close();
            }

            // Update patient contacts
            try (PreparedStatement patientContactUpdate = con.prepareStatement(UPDATE_PATIENT_CONTACTS)) {
                patientContactUpdate.setString(1, patient.getContactNo_1());
                patientContactUpdate.setString(2, patient.getContactNo_2());
                patientContactUpdate.setInt(3, patientId);

                // Execute contacts update
                patientContactUpdate.executeUpdate();
                patientContactUpdate.close();
            }

            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
