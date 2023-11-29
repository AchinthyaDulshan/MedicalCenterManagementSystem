/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patient;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import database.MedicalCenterDataBase;

/**
 *
 * @author Achinthya Dulshan
 */
public class PatientDao {

    private MedicalCenterDataBase database;

    public PatientDao() {
        database = new MedicalCenterDataBase();
    }

    public void insertPatient(Patient patient) {
        final String INSERT_PATIENT = "INSERT INTO patient " + "() VALUES " + "()";

        Connection con = database.getDataBaseConnection();

        try {
            PreparedStatement ps = con.prepareStatement(INSERT_PATIENT);
            ps.execute();
            ps.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet fillTableData() {
        final String SELECT_PATIENT_DETAILS = "select * from patient";

        Connection con = database.getDataBaseConnection();
        PreparedStatement ps;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement(SELECT_PATIENT_DETAILS);
            rs = ps.executeQuery();
            
//            ps.close();
//            con.close();
            
        } catch (SQLException e) {

            e.printStackTrace();
//            System.out.println("patient.PatientDao.fillTableData()");
        }finally{
            
        }

        return rs;
    }

    public ResultSet searchPatient(Patient searchingPatient) {
        final String SEARCH_PATIENT = "SELECT * FROM patient WHERE patientId=?";

        Connection con = database.getDataBaseConnection();
        PreparedStatement ps;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement(SEARCH_PATIENT);
            ps.setInt(1, searchingPatient.getIdFromDB());
            rs = ps.executeQuery();
            
            ps.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
}
