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

    // define database connection parameters
    private final String jdbcURL = "jdbc:mysql://localhost:3306/medicalcenterdb?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private final String jdbcUserName = "root";
    private final String jdbcPassword = "1234";
    private final String jdbcDriver = "com.mysql.cj.jdbc.Driver";

    // default constructor
    public MedicalCenterDataBase() {
    }

    // create method for get database connection
    // return --> connection
    public Connection getDataBaseConnection() {
        Connection con = null;

        try {
            
            Class.forName(jdbcDriver);
            
            try {
                
                con = DriverManager.getConnection(jdbcURL, jdbcUserName, jdbcPassword);
                
            } catch (SQLException e) {

                e.getMessage();
                
            }

        } catch (ClassNotFoundException e) {

            e.getMessage();
            
        }

        return con;
    }


}
