/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author Achinthya Dulshan
 */
public class Hospital {
    private String hospitalId;
    private String hospitalName;
    private String hospitalAddress;
    private String contactNo_1;
    private String contactNo_2;

    public Hospital() {
    }


    public Hospital(String hospitalId, String hospitalName, String hospitalAddress, String hospitalContactNo_1, String hospitalContactNo_2) {
        this.hospitalId = hospitalId;
        this.hospitalName = hospitalName;
        this.hospitalAddress = hospitalAddress;
        this.contactNo_1 = hospitalContactNo_1;
        this.contactNo_2 = hospitalContactNo_2;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
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

    

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }
    
    
    
}
