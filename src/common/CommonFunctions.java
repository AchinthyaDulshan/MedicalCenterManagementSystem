/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Achinthya Dulshan
 */
public class CommonFunctions {
    
     //format entered date 
    public static String getSelectedBirthDate(JDateChooser dateChooser) {
        if (dateChooser.getDate() == null) {
//            JOptionPane.showMessageDialog(null, "Please Select Birth date");
        } else {
            Date birthDate = dateChooser.getDate();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String strBirthDate = formatter.format(birthDate);
            return strBirthDate;
        }

        return null;
    }
    
    // define method to get minimum date as a Date
    public static Date getMinDate() throws ParseException {
        String strMinDate = "01/01/1970";
        Date minDate = new SimpleDateFormat("dd/MM/yyyy").parse(strMinDate);
        return minDate;
    }
}
