/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appoinment;

/**
 *
 * @author Achinthya Dulshan
 */
public class Appoinment {
    private String appoinmentId;
    private String purpose;
    private String status; 
    private String notes;
    private String patient_id;
    private String medical_staff_id;
    private String available_appoinment_id;

    public Appoinment() {
    }

    public Appoinment(String appoinmentId, String purpose, String status, String Date, String Time, String notes, String patient_id, String medical_staff_id) {
        this.appoinmentId = appoinmentId;
        this.purpose = purpose;
        this.status = status;
        this.notes = notes;
        this.patient_id = patient_id;
        this.medical_staff_id = medical_staff_id;
    }

    public String getAppoinmentId() {
        return appoinmentId;
    }

    public void setAppoinmentId(String appoinmentId) {
        this.appoinmentId = appoinmentId;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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

    public String getAvailable_appoinment_id() {
        return available_appoinment_id;
    }

    public void setAvailable_appoinment_id(String available_appoinment_id) {
        this.available_appoinment_id = available_appoinment_id;
    }
    
    
}
