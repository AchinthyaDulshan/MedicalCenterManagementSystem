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

        final String GET_SELECTED_DOCTOR_ID = "SELECT id FROM medical_staff WHERE staffId=?";

        final String GET_AVAILABLE_APPOINMENTS = "SELECT * FROM availableappoinments WHERE medical_staff_id=? AND status=0 AND date";

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
        
        try (Connection con = dataBase.getDataBaseConnection()) {
            // Get the selected doctorId
            PreparedStatement getSelectedDoctorIdStatement = con.prepareStatement(GET_SELECTED_DOCTOR_ID);
            getSelectedDoctorIdStatement.setString(1, appoinment.getMedical_staff_id());
            ResultSet rs = getSelectedDoctorIdStatement.executeQuery();

            int doctorId = 0;

            if (rs.next()) {
                doctorId = rs.getInt(1);
            }

            PreparedStatement getAppoinments = con.prepareStatement(GET_AVAILABLE_APPOINMENTS);
            getAppoinments.setInt(1, doctorId);
            rs = getAppoinments.executeQuery();


            System.out.println("appoinments " + appoinmentList);

            getSelectedDoctorIdStatement.close();
            getAppoinments.close();
            con.close();


        } catch (Exception e) {

        }
    }
}
