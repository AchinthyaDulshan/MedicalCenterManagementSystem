/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prescription;

/**
 *
 * @author Achinthya Dulshan
 */
public class Prescription {
    
    private String prescriptionId;
    private String medicationName;
    private String dosage; 
    private String startDate;
    private String endDate;
    private int medical_staff_id; 
    private int medicalRecord_id;
    private String link;
    

    public Prescription() {
    }

    public Prescription(String prescriptionId, String medicationName, String dosage, String startDate, String endDate, int medical_staff_id, int medicalRecord_id) {
        this.prescriptionId = prescriptionId;
        this.medicationName = medicationName;
        this.dosage = dosage;
        this.startDate = startDate;
        this.endDate = endDate;
        this.medical_staff_id = medical_staff_id;
        this.medicalRecord_id = medicalRecord_id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    

    public String getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getMedical_staff_id() {
        return medical_staff_id;
    }

    public void setMedical_staff_id(int medical_staff_id) {
        this.medical_staff_id = medical_staff_id;
    }

    public int getMedicalRecord_id() {
        return medicalRecord_id;
    }

    public void setMedicalRecord_id(int medicalRecord_id) {
        this.medicalRecord_id = medicalRecord_id;
    }
    
    
}
