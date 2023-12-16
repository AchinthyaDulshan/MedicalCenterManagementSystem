/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appoinment;

/**
 *
 * @author Achinthya Dulshan
 */
public class AvailableAppoinment {
    private String id;
    private String date;
    private String startTime; 
    private String endTime;
    private String medical_staff_id;

    public AvailableAppoinment() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getMedical_staff_id() {
        return medical_staff_id;
    }

    public void setMedical_staff_id(String medical_staff_id) {
        this.medical_staff_id = medical_staff_id;
    }
    
    
}
