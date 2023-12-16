/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalRecords;

import database.MedicalCenterDataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import patient.Patient;

/**
 *
 * @author Achinthya Dulshan
 */
public class MedicalRecordDao {
    private MedicalCenterDataBase database;

    public MedicalRecordDao() {
        database = new MedicalCenterDataBase();
    }
    
    public void insertMedicalRecord(MedicalRecord medicalRecord){
            // define method for insert patient to database
    // parameter --> Patient object
   

        // Define SQL statement for insertion
        final String INSERT_RECORD = "INSERT INTO medicalrecord (medicalRecordId,dateOfRecord,diagnosis,tratmentPlan,testResult,patient_id,medical_staff_id,prescription_id) VALUES (?,?,?,?,?,?,?,?)";
        // SQL for get last patient Id
        final String GET_LAST_Record_ID = "SELECT max(medicalRecordId) FROM medicalrecord";
        
        final String GET_SELECTED_PATIENT_ID = "SELECT id FROM patient WHERE patientId=?";
        
        final String GET_SELECTED_DOCTOR_ID = "SELECT id FROM medical_staff WHERE staffId=?";
        
        final String GET_SELECTED_PRESCRIPTION_ID = "SELECT id FROM prescription WHERE prescriptionId=?";


        // Get a database connection
        try (Connection con = database.getDataBaseConnection()) {
            
            // Get the selected patientId
            PreparedStatement getSelectedPatientIdStatement = con.prepareStatement(GET_SELECTED_PATIENT_ID);
            getSelectedPatientIdStatement.setString(1, medicalRecord.getPatient_id());
            ResultSet rs = getSelectedPatientIdStatement.executeQuery();

            int patientId = 0;

            if (rs.next()) {
                patientId = rs.getInt(1);
            }
            
            // Get the selected doctorId
            PreparedStatement getSelectedDoctorIdStatement = con.prepareStatement(GET_SELECTED_DOCTOR_ID);
            getSelectedDoctorIdStatement.setString(1, medicalRecord.getMedical_staff_id());
            rs = getSelectedDoctorIdStatement.executeQuery();

            int doctorId = 0;

            if (rs.next()) {
                doctorId = rs.getInt(1);
            }

            // Get the selected doctorId
            PreparedStatement getPrescriptionIdStatement = con.prepareStatement(GET_SELECTED_PRESCRIPTION_ID);
            getPrescriptionIdStatement.setString(1, medicalRecord.getPrescriptionId());
            rs = getPrescriptionIdStatement.executeQuery();

            int prescriptionId = 0;

            if (rs.next()) {
                prescriptionId = rs.getInt(1);
            }
            
            // Get the selected doctorId
            PreparedStatement getMaxRecordIdStatement = con.prepareStatement(GET_LAST_Record_ID);
            rs = getMaxRecordIdStatement.executeQuery();

            String recordId = "";

            if (rs.next()) {
                recordId = rs.getString(1);
            }
            
            // Increment the last patientId to get a new one
            int recordNumber = Integer.parseInt(recordId.substring(2)) + 1;

            String newRecordId = "MR" + padWithZeros(Integer.toString(recordNumber), 23);

            // Insert new patient
            PreparedStatement inserRecordStatement = con.prepareStatement(INSERT_RECORD);
            inserRecordStatement.setString(1, newRecordId);
            inserRecordStatement.setString(2, getDate());
            inserRecordStatement.setString(3, medicalRecord.getDiagnosis());
            inserRecordStatement.setString(4, medicalRecord.getTratmentPlan());
            inserRecordStatement.setString(5, medicalRecord.getTestResult());
            inserRecordStatement.setInt(6, patientId);
            inserRecordStatement.setInt(7, doctorId);
            inserRecordStatement.setInt(8, prescriptionId);

            // execute patient insertion
            inserRecordStatement.executeUpdate();



            //close resources
            getMaxRecordIdStatement.close();
            getPrescriptionIdStatement.close();
            getSelectedDoctorIdStatement.close();
            getSelectedPatientIdStatement.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private String getDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();

        return dtf.format(now);
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
    
    
    
    public void viewMedicalRecord(){
    
    }
    
}
