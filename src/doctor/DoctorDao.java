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
    public void insertMedicalStaff(Doctor doctor) {
        
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
            doctorStatement.setString(5, doctor.getNIC());
            doctorStatement.setString(6, doctor.getLicenseNumber());

            doctorStatement.setString(7, doctor.getSpecialization());
            doctorStatement.setString(8, doctor.getDateOfBirth());
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
        
        final String SELECT_PATIENT_DETAILS = "select m.staffId ,m.firstName ,m.lastName ,m.address ,m.nic ,m.licenseNumber ,m.Specialization ,m.dob ,m.gender, c.contact_no_1, c.contact_no_2 from medical_staff m, staff_contact c where m.id = c.medical_staff_id AND delete_status = 0";

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
    public void deleteDoctor(Doctor doctor) {

        //define SQL Delete statement
        final String DELETE_DOCTOR = "UPDATE medical_staff SET delete_status = 1 WHERE staffId=?";

        //create connection 
        Connection con = database.getDataBaseConnection();

        try {

            PreparedStatement deleteDoctor = con.prepareStatement(DELETE_DOCTOR);
            deleteDoctor.setString(1, doctor.getStaffId());

            deleteDoctor.executeUpdate();

//            JOptionPane.showMessageDialog(patientDetailsJOptionPane, "Patient Deleted successfully");
            //close resources
            deleteDoctor.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void updateDoctor(Doctor doctor) {

        final String UPDATE_DOCTOR = "UPDATE medical_staff SET firstname=? ,lastName=? ,address=? ,nic=? , licenseNumber=?, Specialization=?,gender=? ,dob=? WHERE staffId=?";

        final String GET_SELECTED_STAFF_ID = "SELECT id FROM medical_staff WHERE staffId=?";

        final String UPDATE_STAFF_CONTACTS = "UPDATE staff_contact SET contact_no_1=? ,contact_no_2=? WHERE staffId=?";

        try (Connection con = database.getDataBaseConnection()) {
            // Update patient information
            try (PreparedStatement updateDoctor = con.prepareStatement(UPDATE_DOCTOR)) {
                updateDoctor.setString(1, doctor.getFirstName());
                updateDoctor.setString(2, doctor.getLastName());
                updateDoctor.setString(3, doctor.getAddress());
                updateDoctor.setString(4, doctor.getNIC());
                updateDoctor.setString(5, doctor.getLicenseNumber());
                updateDoctor.setString(6, doctor.getSpecialization());
                updateDoctor.setString(7, doctor.getGender());
                updateDoctor.setString(8, doctor.getDateOfBirth());
                updateDoctor.setString(9, doctor.getStaffId());

                // Execute patient update
                updateDoctor.executeUpdate();
                updateDoctor.close();
            }

            // Get patient ID
            int staffId = -1;
            try (PreparedStatement getStaffId = con.prepareStatement(GET_SELECTED_STAFF_ID)) {
                getStaffId.setString(1, doctor.getStaffId());

                // Execute query and retrieve the result set
                try (ResultSet rs = getStaffId.executeQuery()) {
                    // Check if there is a result
                    if (rs.next()) {
                        staffId = rs.getInt(1);
                    }
                }
                getStaffId.close();
            }

            // Update patient contacts
            try (PreparedStatement doctorContactUpdate = con.prepareStatement(UPDATE_STAFF_CONTACTS)) {
                doctorContactUpdate.setString(1, doctor.getContactNo_1());
                doctorContactUpdate.setString(2, doctor.getContactNo_2());
                doctorContactUpdate.setInt(3, staffId);

                // Execute contacts update
                doctorContactUpdate.executeUpdate();
                doctorContactUpdate.close();
            }

            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
