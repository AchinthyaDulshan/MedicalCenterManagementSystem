/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doctor;

import java.time.LocalDate;

/**
 *
 * @author Achinthya Dulshan
 */
public class Doctor {
    
    private Integer id;
    private String staffId;
    private String firstName;
    private String lastName;
    private String address;
    private String nic;
    private String licenseNumber;
    private String Specialization;
    private String dob;
    private String gender;
    private String contactNo_1;
    private String contactNo_2;

    public Doctor() {
    }

    public Doctor(Integer id, String staffId, String firstName, String lastName, String address, String nic, String licenseNumber, String Specialization, String dob, String gender, String contactNo_1, String contactNo_2) {
        this.id = id;
        this.staffId = staffId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.nic = nic;
        this.licenseNumber = licenseNumber;
        this.Specialization = Specialization;
        this.dob = dob;
        this.gender = gender;
        this.contactNo_1 = contactNo_1;
        this.contactNo_2 = contactNo_2;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContactNo_1() {
        return contactNo_1;
    }

    public void setContactNo_1(String contactNo_1) {
        this.contactNo_1 = contactNo_1;
    }

    public String getContactNo_2() {
        return contactNo_2;
    }

    public void setContactNo_2(String contactNo_2) {
        this.contactNo_2 = contactNo_2;
    }
    
    
}
