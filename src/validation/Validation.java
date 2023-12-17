/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validation;

import static java.awt.Color.GREEN;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Achinthya Dulshan
 */
public class Validation {

    // define method for select field validation
    public static void selectFieldValidation(JComboBox comboBox, String defaultSelectedOption, Object object, String method) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String selectedOption = comboBox.getSelectedItem().toString();

        System.out.println("s- " + selectedOption);

        if (selectedOption.equals(defaultSelectedOption)) {
//            comboBox.setBorder(invalidBorder);
            comboBox.putClientProperty("JComponent.outline", "error");
            // Get the method with the specified name
            Method executingMethod = object.getClass().getDeclaredMethod(method, String.class);

            // Invoke the method on the instance
            executingMethod.invoke(object, (Object) null);
        } else {

            comboBox.putClientProperty("JComponent.outline", GREEN);
//            comboBox.setBorder(validBorder);

            // Get the method with the specified name
            Method executingMethod = object.getClass().getDeclaredMethod(method, String.class);

            // Invoke the method on the instance
            executingMethod.invoke(object, selectedOption);

        }
    }
    
    // define method for text field validation
    public static void txtFieldValidation(JTextField textField, String matchingPattern, Object object, String method) {
        Pattern pattern;
        Matcher isMatching;

        pattern = Pattern.compile(matchingPattern);
        isMatching = pattern.matcher(textField.getText());

        if (isMatching.matches()) {
            textField.putClientProperty("JComponent.outline", GREEN);
//            textField.setBorder(validBorder);
            try {
                // Method name to be invoked
                String methodName = method;

                // Get the method with the specified name
                Method executingMethod = object.getClass().getDeclaredMethod(methodName, String.class);

                // Invoke the method on the instance
                executingMethod.invoke(object, textField.getText());

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            textField.putClientProperty("JComponent.outline", "error");
//            textField.setBorder(invalidBorder);
            try {
                // Method name to be invoked
                String methodName = method;

                // Get the method with the specified name
                Method executingMethod = object.getClass().getDeclaredMethod(methodName, String.class);

                // Invoke the method on the instance
                executingMethod.invoke(object, (Object) null);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    // define method for text field validation
    public static void txtAreaValidation(JTextArea textArea, String matchingPattern, Object object, String method) {
        Pattern pattern;
        Matcher isMatching;

        pattern = Pattern.compile(matchingPattern);
        isMatching = pattern.matcher(textArea.getText());

        if (isMatching.matches()) {
//            textArea.setBorder(validBorder);
            textArea.putClientProperty("JComponent.outline", GREEN);
            try {
                // Method name to be invoked
                String methodName = method;

                // Get the method with the specified name
                Method executingMethod = object.getClass().getDeclaredMethod(methodName, String.class);

                // Invoke the method on the instance
                executingMethod.invoke(object, textArea.getText());

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            textArea.putClientProperty("JComponent.outline", "error");
//            textArea.setBorder(invalidBorder);
            try {
                // Method name to be invoked
                String methodName = method;

                // Get the method with the specified name
                Method executingMethod = object.getClass().getDeclaredMethod(methodName, String.class);

                // Invoke the method on the instance
                executingMethod.invoke(object, (Object) null);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
