/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logIn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import database.MedicalCenterDataBase;
import home.HomeForm;
import javax.swing.JOptionPane;
import logIn.LogInForm;

/**
 *
 * @author Achinthya Dulshan
 */
public class UserDao {

    //create a database object
    private MedicalCenterDataBase database;

    //initialize database object when callin constructor
    public UserDao() {
        database = new MedicalCenterDataBase();
    }

    //create method to validate user
    public boolean checkUser(User user) {
        //get entered username data from database
        final String GET_USER = "SELECT userName,password FROM user WHERE userName=?";

        //create connection object
        Connection con = database.getDataBaseConnection();
        //create resultset to catch data from DB
        ResultSet rs = null;

        //try to execute query
        try {

            PreparedStatement ps = con.prepareStatement(GET_USER);
            ps.setString(1, user.getUserName());
            //execute query and assign result to ResultSet obj
            rs = ps.executeQuery();

            //check whether database have entered user name
            if (rs.next()) {

                if (user.getPassword().equals(rs.getString(2))) { //extract resultset data

                    // if password is correct load homeForm
                    new HomeForm().setVisible(true);
                    ps.close();
                    con.close();
                    return true;
                } else {
                    // if password doesn't match with database it will give an error
                    JOptionPane.showMessageDialog(new LogInForm(), "Entered Password is invalid.\nPlease check again", "Invalid password",
                            JOptionPane.ERROR_MESSAGE);
                    ps.close();
                    con.close();
                    return false;
                }

            } else {
                // if database doesn't have entered username it will give an error
                JOptionPane.showMessageDialog(new LogInForm(), "Entered user name is invalid.\nPlease check again", "Invalid UserName",
                        JOptionPane.ERROR_MESSAGE);
                ps.close();
                con.close();
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}
