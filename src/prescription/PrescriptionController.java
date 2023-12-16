/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prescription;

import database.MedicalCenterDataBase;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Achinthya Dulshan
 */
public class PrescriptionController {
    private PrescriptionDao dao;

    public PrescriptionController() {
        dao = new PrescriptionDao();
    }
    
    
    
    public File createPrescription() {
        
        String fileName = dao.getPrescriptionId();
        System.out.println("pre"+fileName);
        
        try {
            File myObj = new File("D:\\Projects\\COST Project\\MedicalCenterManagementSystem\\src\\generatedPrescriptions\\"+fileName+".txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
            return myObj;
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        return null;
    }
}
