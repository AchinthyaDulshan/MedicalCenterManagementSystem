/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package availableAppoinments;

import database.MedicalCenterDataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.Arrays;

/**
 *
 * @author Achinthya Dulshan
 */
public class AvailableAppoinmentDao {

    private MedicalCenterDataBase dataBase;

    public AvailableAppoinmentDao() {
        dataBase = new MedicalCenterDataBase();

    }

    public ArrayList getAvailableAppoinmentDetails(String staffId) {

        final String GET_SELECTED_DOCTOR_ID = "SELECT id FROM medical_staff WHERE staffId=?;";


        final String GET_AVAILABLE_APPOINMENTS = "SELECT * FROM availableappoinments WHERE medical_staff_id=? AND status=0";

        ArrayList<ArrayList<String>> appoinmentList = new ArrayList<>();

        try (Connection con = dataBase.getDataBaseConnection()) {
            // Get the selected doctorId
            PreparedStatement getSelectedDoctorIdStatement = con.prepareStatement(GET_SELECTED_DOCTOR_ID);
            getSelectedDoctorIdStatement.setString(1, staffId);
            ResultSet rs = getSelectedDoctorIdStatement.executeQuery();

            int doctorId = 0;

            if (rs.next()) {
                doctorId = rs.getInt(1);
            }

            PreparedStatement getAppoinments = con.prepareStatement(GET_AVAILABLE_APPOINMENTS);
            getAppoinments.setInt(1, doctorId);
            rs = getAppoinments.executeQuery();

            while (rs.next()) {
                appoinmentList.add(new ArrayList<>(Arrays.asList(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5))));
            }

            System.out.println("appoinments " + appoinmentList);

            getSelectedDoctorIdStatement.close();
            getAppoinments.close();
            con.close();
            return appoinmentList;

        } catch (Exception e) {

        }
        return null;
    }
    
    public void addAvailableAppoinment(AvailableAppoinment appoinment){
        
        final String GET_SELECTED_DOCTOR_ID = "SELECT id FROM medical_staff WHERE staffId=?"; 
                
        final String GET_LAST_AV_ID = "SELECT max(availableAppoinmentId) FROM availableappoinments;";
        
        final String INSERT_AVAILABLE_APPOINMENT = "INSERT INTO availableappoinments (availableAppoinmentId,date,startTime,endTime,status,medical_staff_id) VALUES (?,?,?,?,?,?);";
        
        try (Connection con = dataBase.getDataBaseConnection()) {
            // Get the selected doctorId
            PreparedStatement getSelectedDoctorIdStatement = con.prepareStatement(GET_SELECTED_DOCTOR_ID);
            getSelectedDoctorIdStatement.setString(1, appoinment.getMedical_staff_id());
            ResultSet rs = getSelectedDoctorIdStatement.executeQuery();

            int doctorId = 0;

            if (rs.next()) {
                doctorId = rs.getInt(1);
            }
            
            // Get the last patientId
            PreparedStatement getLastAvailableAppoinmentIdStatement = con.prepareStatement(GET_LAST_AV_ID);
            rs = getLastAvailableAppoinmentIdStatement.executeQuery();

            String lastAvailableAppoinmentId = "";

            if (rs.next()) {
                lastAvailableAppoinmentId = rs.getString(1);
            }

            // Increment the last patientId to get a new one
            int appoinmentNumber = Integer.parseInt(lastAvailableAppoinmentId.substring(2)) + 1;

            String availableAppoinmentId = "AV" + padWithZeros(Integer.toString(appoinmentNumber), 13);

            PreparedStatement setAppoinments = con.prepareStatement(INSERT_AVAILABLE_APPOINMENT);
            setAppoinments.setString(1, availableAppoinmentId);
            setAppoinments.setString(2, appoinment.getDate());
            setAppoinments.setString(3, appoinment.getStartTime());
            setAppoinments.setString(4, appoinment.getEndTime());
            setAppoinments.setInt(5, 0);
            setAppoinments.setInt(6, doctorId);
            
            setAppoinments.executeUpdate();


            getLastAvailableAppoinmentIdStatement.close();
            getSelectedDoctorIdStatement.close();
            setAppoinments.close();
            con.close();


        } catch (Exception e) {

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
}
