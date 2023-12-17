/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appoinment;

import database.MedicalCenterDataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Achinthya Dulshan
 */
public class AppoinmentDao {

    private MedicalCenterDataBase dataBase;

    public AppoinmentDao() {
        dataBase = new MedicalCenterDataBase();

    }

    public ArrayList getDoctorsByType(String specialization) {
        final String GET_DOCTOR_DETAILS = "SELECT staffId ,firstName,lastName FROM medicalcenterdb.medical_staff where Specialization=?";

        ArrayList<ArrayList<String>> doctorList = new ArrayList<>();

        // Get a database connection
        try (Connection con = dataBase.getDataBaseConnection()) {
            // Get the last patientId
            PreparedStatement getDoctorDetails = con.prepareStatement(GET_DOCTOR_DETAILS);
            getDoctorDetails.setString(1, specialization.trim());
            ResultSet rs = getDoctorDetails.executeQuery();

            if (rs.next()) {
                doctorList.add(new ArrayList<>(Arrays.asList(rs.getString(1), rs.getString(2), rs.getString(3))));
            } else {
                return null;
            }

            getDoctorDetails.close();
            con.close();

            return doctorList;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void addAppoinment(Appoinment appoinment) {
        // Define SQL statement for insertion
        final String INSERT_RECORD = "INSERT INTO appoinment (appoinmentId, status, notes, patient_id, medical_staff_id, availableAppoinments_id) VALUES (?,?,?,?,?,?);";
        // SQL for get last patient Id
        final String GET_LAST_APPOINMENT_ID = "SELECT max(appoinmentId) FROM appoinment;";

        final String GET_SELECTED_PATIENT_ID = "SELECT id FROM patient WHERE patientId=?;";

        final String GET_SELECTED_DOCTOR_ID = "SELECT id FROM medical_staff WHERE staffId=?;";

        final String GET_SELECTED_APPOINMENT_ID = "SELECT id FROM availableappoinments WHERE availableAppoinmentId=?;";

        final String UPDATE_AVAILABLE_APPOINMENTS = "UPDATE availableappoinments SET status = 1 where id=?";

        // Get a database connection
        try (Connection con = dataBase.getDataBaseConnection()) {

            // Get the selected patientId
            PreparedStatement getSelectedPatientIdStatement = con.prepareStatement(GET_SELECTED_PATIENT_ID);
            getSelectedPatientIdStatement.setString(1, appoinment.getPatient_id());
            ResultSet rs = getSelectedPatientIdStatement.executeQuery();

            int patientId = 0;

            if (rs.next()) {
                patientId = rs.getInt(1);
            } else {
                JOptionPane.showMessageDialog(new AddAppoinment(), "Patient Id Not Found.Please Recheck");
            }

            // Get the selected doctorId
            PreparedStatement getSelectedDoctorIdStatement = con.prepareStatement(GET_SELECTED_DOCTOR_ID);
            getSelectedDoctorIdStatement.setString(1, appoinment.getMedical_staff_id());
            rs = getSelectedDoctorIdStatement.executeQuery();

            int doctorId = 0;

            if (rs.next()) {
                doctorId = rs.getInt(1);
            }

            // Get the selected doctorId
            PreparedStatement getPrescriptionIdStatement = con.prepareStatement(GET_SELECTED_APPOINMENT_ID);
            getPrescriptionIdStatement.setString(1, appoinment.getAvailable_appoinment_id());
            rs = getPrescriptionIdStatement.executeQuery();

            int availableAppoinmentId = 0;

            if (rs.next()) {
                availableAppoinmentId = rs.getInt(1);
            }

            // Get the selected doctorId
            PreparedStatement getMaxAppoinmentIdStatement = con.prepareStatement(GET_LAST_APPOINMENT_ID);
            rs = getMaxAppoinmentIdStatement.executeQuery();

            String appoinmentId = "";

            if (rs.next()) {
                appoinmentId = rs.getString(1);
            }

            // Increment the last patientId to get a new one
            int appoinmentNumber = Integer.parseInt(appoinmentId.substring(2)) + 1;

            String newAppoinmentId = "AP" + padWithZeros(Integer.toString(appoinmentNumber), 13);

            // appoinmentId, status, notes, patient_id, medical_staff_id, availableAppoinments_id
            // Insert new patient
            PreparedStatement addAppoinment = con.prepareStatement(INSERT_RECORD);
            addAppoinment.setString(1, newAppoinmentId);
            addAppoinment.setString(2, appoinment.getStatus());
            addAppoinment.setString(3, appoinment.getNotes());
            addAppoinment.setInt(4, patientId);
            addAppoinment.setInt(5, doctorId);
            addAppoinment.setInt(6, availableAppoinmentId);

            // execute patient insertion
            addAppoinment.executeUpdate();

            PreparedStatement updateAvailableAppoinments = con.prepareStatement(UPDATE_AVAILABLE_APPOINMENTS);
            updateAvailableAppoinments.setInt(1,availableAppoinmentId);
            updateAvailableAppoinments.executeUpdate();
            
            //close resources
            getMaxAppoinmentIdStatement.close();
            getPrescriptionIdStatement.close();
            getSelectedDoctorIdStatement.close();
            getSelectedPatientIdStatement.close();
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
        
        final String SELECT_APPOINMENT_DETAILS = "SELECT a.appoinmentId,a.status,a.notes,v.availableAppoinmentId,v.date,v.startTime,v.endTime,s.firstName,s.lastName,p.firstName,p.lastName FROM medicalcenterdb.appoinment a,medicalcenterdb.availableappoinments v,medicalcenterdb.medical_staff s, medicalcenterdb.patient p where a.patient_id=p.id AND a.medical_staff_id=s.id AND a.availableAppoinments_id=v.id;";

        Connection con = dataBase.getDataBaseConnection();
        PreparedStatement ps;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement(SELECT_APPOINMENT_DETAILS);
            rs = ps.executeQuery();


        } catch (SQLException e) {

            e.printStackTrace();
        } 

        return rs;
    }
}
