/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalRecords;

/**
 *
 * @author Achinthya Dulshan
 */
public class MedicalRecord {
    
    private int id;
    private String medicalRecordId;
    private String dateOfRecord;
    private String diagnosis;
    private String tratmentPlan; 
    private String testResult;
    private String patient_id;
    private String medical_staff_id;
    private String prescriptionId;

    public String getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public MedicalRecord() {
    }

    public MedicalRecord(int id, String medicalRecordId, String dateOfRecord, String diagnosis, String tratmentPlan, String testResult, String patient_id, String medical_staff_id) {
        this.id = id;
        this.medicalRecordId = medicalRecordId;
        this.dateOfRecord = dateOfRecord;
        this.diagnosis = diagnosis;
        this.tratmentPlan = tratmentPlan;
        this.testResult = testResult;
        this.patient_id = patient_id;
        this.medical_staff_id = medical_staff_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMedicalRecordId() {
        return medicalRecordId;
    }

    public void setMedicalRecordId(String medicalRecordId) {
        this.medicalRecordId = medicalRecordId;
    }

    public String getDateOfRecord() {
        return dateOfRecord;
    }

    public void setDateOfRecord(String dateOfRecord) {
        this.dateOfRecord = dateOfRecord;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTratmentPlan() {
        return tratmentPlan;
    }

    public void setTratmentPlan(String tratmentPlan) {
        this.tratmentPlan = tratmentPlan;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public String getMedical_staff_id() {
        return medical_staff_id;
    }

    public void setMedical_staff_id(String medical_staff_id) {
        this.medical_staff_id = medical_staff_id;
    }
    
    
    
}
