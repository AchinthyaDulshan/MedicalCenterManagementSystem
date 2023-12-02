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
    private String hospitalContactNo_1;
    private String hospitalContactNo_2;

    public Hospital(String hospitalId, String hospitalName, String hospitalContactNo_1, String hospitalContactNo_2) {
        this.hospitalId = hospitalId;
        this.hospitalName = hospitalName;
        this.hospitalContactNo_1 = hospitalContactNo_1;
        this.hospitalContactNo_2 = hospitalContactNo_2;
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

    public String getHospitalContactNo_1() {
        return hospitalContactNo_1;
    }

    public void setHospitalContactNo_1(String hospitalContactNo_1) {
        this.hospitalContactNo_1 = hospitalContactNo_1;
    }

    public String getHospitalContactNo_2() {
        return hospitalContactNo_2;
    }

    public void setHospitalContactNo_2(String hospitalContactNo_2) {
        this.hospitalContactNo_2 = hospitalContactNo_2;
    }
    
    
}
