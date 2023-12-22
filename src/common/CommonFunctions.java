/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Achinthya Dulshan
 */
public class CommonFunctions {
    
     //format entered date 
    public static String getSelectedBirthDate(JDateChooser dateChooser) {
        if (dateChooser.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Please Select Birth date");
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
        String strMinDate = "01/01/1950";
        Date minDate = new SimpleDateFormat("dd/MM/yyyy").parse(strMinDate);
        return minDate;
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
