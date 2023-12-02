/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

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
public class HospitalDao {
    // define variable for get database connection
    private MedicalCenterDataBase database;

    // default constructor
    public HospitalDao() {
        database = new MedicalCenterDataBase();
    }

    // define method for insert hospital to database
    // parameter --> Hospital object
    public void insertHospital(Hospital hospital,JFrame hospitalRegForm) {
        
        // Define SQL statement for insertion
        final String INSERT_HOSPITAL = "INSERT INTO nearbyhospital (hospitalId ,name ,address) VALUES (?,?,?)";
        // SQL for get last hospital Id
        final String GET_LAST_HOSPITAL_ID = "SELECT max(hospitalId) FROM nearbyhospital";
        // SQL for insert hospital contacts
        final String INSERT_HOSPITAL_CONTACTS = "INSERT INTO hospitalcontacts (contact_no_1 ,contact_no_2 ,nearbyhospital_id) VALUES (?,?,?)";

        // Get a database connection
        Connection con = database.getDataBaseConnection();

        try {
            // Get the last hospitalId
            PreparedStatement getLastHospitalIdStatement = con.prepareStatement(GET_LAST_HOSPITAL_ID);
            ResultSet rs = getLastHospitalIdStatement.executeQuery();

            String lastHospitalId = "";

            if (rs.next()) {
                lastHospitalId = rs.getString(1);
            }

            // Increment the last hospitalId to get a new one
            int hospitalNumber = Integer.parseInt(lastHospitalId.substring(2)) + 1;

            String hospitalId = "HP" + padWithZeros(Integer.toString(hospitalNumber), 13);

            // Insert new hospital
            PreparedStatement hospitalStatement = con.prepareStatement(INSERT_HOSPITAL, PreparedStatement.RETURN_GENERATED_KEYS);
            hospitalStatement.setString(1, hospitalId);
            hospitalStatement.setString(2, hospital.getHospitalName());
            hospitalStatement.setString(3, hospital.getHospitalAddress());

            
            // execute patient insertion
            hospitalStatement.executeUpdate();

            // Get the auto-generated key (parent_id)
            int parentId;
            try (var generatedKeys = hospitalStatement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    parentId = generatedKeys.getInt(1);
                    System.out.println("id"+ parentId);
                } else {
                    throw new SQLException("Failed to get hospital ID, no rows affected.");
                }
            }

            // Insert data into the child table using the obtained parent_id
            PreparedStatement hospitalContactStatement = con.prepareStatement(INSERT_HOSPITAL_CONTACTS);
            hospitalContactStatement.setString(1, hospital.getContactNo_1());
            hospitalContactStatement.setString(2, hospital.getContactNo_2());
            hospitalContactStatement.setInt(3, parentId);

            hospitalContactStatement.executeUpdate();

            JOptionPane.showMessageDialog(hospitalRegForm, "Data inserted successfully");

            //close resources
            getLastHospitalIdStatement.close();
            hospitalStatement.close();
            hospitalContactStatement.close();
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
        
        final String SELECT_PATIENT_DETAILS = "select hospitalId, name, address, contact_no_1, contact_no_2 from nearbyhospital h, hospitalcontacts c where h.id = c.nearbyHospital_id";

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
