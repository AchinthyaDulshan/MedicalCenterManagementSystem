/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patient;

/**
 *
 * @author Achinthya Dulshan
 */
public class Patient {
    private int idFromDB;
    private String patientId;
    private String firstName;
    private String lastName;
    private String address;
    private String NIC;
    private String dateOfBirth;
    private String gender;
    private String bloodGroup;
    private String contactNo_1;
    private String contactNo_2;

    public Patient() {
    }

    public Patient(int idFromDB, String firstName, String lastName, String address, String NIC, String dateOfBirth, String gender, String bloodGroup, String contactNo_1, String contactNo_2) {
        this.idFromDB = idFromDB;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.NIC = NIC;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.contactNo_1 = contactNo_1;
        this.contactNo_2 = contactNo_2;
    }

    public int getIdFromDB() {
        return idFromDB;
    }

    public void setIdFromDB(int idFromDB) {
        this.idFromDB = idFromDB;
    }
    
    public String getPatientId() {
        return patientId;
    }

    public void setIdFromDB(String patientId) {
        this.patientId = patientId;
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

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
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
