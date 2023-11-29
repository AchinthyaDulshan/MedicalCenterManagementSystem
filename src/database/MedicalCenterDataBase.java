/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Achinthya Dulshan
 */
public class MedicalCenterDataBase {

    private String jdbcURL = "jdbc:mysql://localhost:3306/medicalcenterdb?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private String jdbcUserName = "root";
    private String jdbcPassword = "1234";
    private String jdbcDriver = "com.mysql.cj.jdbc.Driver";

    public MedicalCenterDataBase() {
    }

    public Connection getDataBaseConnection() {
        Connection con = null;
        
        try {
            Class.forName(jdbcDriver);
            try {
                con = DriverManager.getConnection(jdbcURL, jdbcUserName, jdbcPassword);
            } catch (SQLException e) {

                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }
//        } finally {
//        if (con != null) {
//            try {
//                con.close();
//            } catch (SQLException ex) {
//                System.out.println(ex);
//            }
//        }
//    }
        return con;
    }
    
    public void closeConnection(Connection con){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(MedicalCenterDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
