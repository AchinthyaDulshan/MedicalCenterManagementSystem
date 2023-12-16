/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prescription;

import database.MedicalCenterDataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Achinthya Dulshan
 */
public class PrescriptionDao {

    private MedicalCenterDataBase database;
    public String prescriptId;

    public PrescriptionDao() {
        database = new MedicalCenterDataBase();
        prescriptId = getPrescriptionId();
    }

    // define method for get last prescription Id
    public String getPrescriptionId() {

        // SQL for get last prescription Id
        final String GET_LAST_PATIENT_ID = "SELECT max(prescriptionId) FROM prescription;";

        try (Connection con = database.getDataBaseConnection()) {
            // Get the last prescriptionId
            PreparedStatement getLastPrescriptionIdStatement = con.prepareStatement(GET_LAST_PATIENT_ID);
            ResultSet rs = getLastPrescriptionIdStatement.executeQuery();

            String lastPrescriptionId = "";

            if (rs.next()) {
                lastPrescriptionId = rs.getString(1);
            }

            // Increment the last prescriptionId to get a new one
            int prescriptionNumber = Integer.parseInt(lastPrescriptionId.substring(2)) + 1;

            String prescriptionId = "PR" + padWithZeros(Integer.toString(prescriptionNumber), 23);

            //close resources
            getLastPrescriptionIdStatement.close();
            con.close();

            return prescriptionId;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "";
    }

    // padding prescriptionId with 0
    private static String padWithZeros(String original, int targetLength) {

        int originalLength = original.length();

        if (originalLength >= targetLength) {
            return original; // No need to pad
        }

        int numberOfZerosToAdd = targetLength - originalLength;
        String zeros = "0".repeat(numberOfZerosToAdd);

        return zeros + original;
    }

    public void insertPrescription(Prescription prescription) {
             // Define SQL statement for insertion
        final String INSERT_PRESCRIPTION = "INSERT INTO prescription (prescriptionId,link) VALUES (?,?)";


        // Get a database connection
        try (Connection con = database.getDataBaseConnection()) {
            
            // Insert new patient
            PreparedStatement prescriptionStatement = con.prepareStatement(INSERT_PRESCRIPTION);
            prescriptionStatement.setString(1, getPrescriptionId());
            prescriptionStatement.setString(2, prescription.getLink());


            // execute patient insertion
            prescriptionStatement.executeUpdate();

         

            //close resources
            prescriptionStatement.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
