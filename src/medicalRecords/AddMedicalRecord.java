/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package medicalRecords;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.toedter.calendar.JDateChooser;
import home.HomeForm;
import home.HomeFormDoctor;
import home.HomeFormReceptionist;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logIn.LogInForm;
import prescription.Prescription;
import prescription.PrescriptionController;
import prescription.PrescriptionDao;

/**
 *
 * @author Achinthya Dulshan
 */
public class AddMedicalRecord extends javax.swing.JFrame {

    private static String nowStatus="";
    private MedicalRecordDao recordDao;
    private PrescriptionDao prescriptionDao;
    private Prescription newPrescription;
    private MedicalRecord newRecord;
    File newPrescriptionFile;
    ArrayList<ArrayList<String>> medicationsArray;
    private static String dataText = "********* PRESCRIPTION *********\nDate and Time : " + new AddMedicalRecord().getDateAndTime() + "\n" + "Doctor Name : " + "name of doctor" + "\n\n" + "====================================\n" + "| Medication | Dosage | Start date | End date |\n";

    /**
     * Creates new form AddMedicalRecord
     */
    public AddMedicalRecord() {
        initComponents();
        newRecord = new MedicalRecord();
        recordDao = new MedicalRecordDao();
        prescriptionDao = new PrescriptionDao();
        newPrescription = new Prescription();
        medicationsArray = new ArrayList<ArrayList<String>>();
        newPrescriptionFile = new PrescriptionController().createPrescription();
        newRecord.setPrescriptionId(prescriptionDao.getPrescriptionId());
        newPrescription.setLink(newPrescriptionFile.getAbsolutePath());
//        prescrptionDataEnterPanel.setVisible(false);
        prescrptionDataEnterPanel.setBackground(new Color(0, 0, 0, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        btnSubmit = new javax.swing.JButton();
        prescrptionDataEnterPanel = new javax.swing.JPanel();
        endDate = new com.toedter.calendar.JDateChooser();
        startDate = new com.toedter.calendar.JDateChooser();
        txtMedicationName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDosage = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        checkPrescriptionRequired = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTestResults = new javax.swing.JTextArea();
        txtDoctorId = new javax.swing.JTextField();
        txtPatientId = new javax.swing.JTextField();
        txtDiagnosis = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTreatmentPlan = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        headerPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtPrescriptionsData = new javax.swing.JTextArea();
        btnHome = new javax.swing.JButton();
        bgImage = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSubmit.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        mainPanel.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 630, 120, 50));

        prescrptionDataEnterPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        prescrptionDataEnterPanel.add(endDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 190, -1));
        prescrptionDataEnterPanel.add(startDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 190, -1));

        txtMedicationName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMedicationName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicationNameActionPerformed(evt);
            }
        });
        prescrptionDataEnterPanel.add(txtMedicationName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 300, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Medication Name :");
        prescrptionDataEnterPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        txtDosage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prescrptionDataEnterPanel.add(txtDosage, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 300, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("End Date :");
        prescrptionDataEnterPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Dosage :");
        prescrptionDataEnterPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Start Date :");
        prescrptionDataEnterPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        btnAdd.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        btnAdd.setText("Add to Prescription");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        prescrptionDataEnterPanel.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, -1, 50));

        mainPanel.add(prescrptionDataEnterPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 690, 210));

        checkPrescriptionRequired.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        checkPrescriptionRequired.setForeground(new java.awt.Color(255, 255, 255));
        checkPrescriptionRequired.setText("Is Prescription Required ?");
        checkPrescriptionRequired.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPrescriptionRequiredActionPerformed(evt);
            }
        });
        mainPanel.add(checkPrescriptionRequired, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 320, 30));

        txtTestResults.setColumns(20);
        txtTestResults.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTestResults.setRows(5);
        jScrollPane2.setViewportView(txtTestResults);

        mainPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 340, 50));

        txtDoctorId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mainPanel.add(txtDoctorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 340, -1));

        txtPatientId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mainPanel.add(txtPatientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 340, -1));

        txtDiagnosis.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mainPanel.add(txtDiagnosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 340, -1));

        txtTreatmentPlan.setColumns(20);
        txtTreatmentPlan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTreatmentPlan.setRows(5);
        jScrollPane1.setViewportView(txtTreatmentPlan);

        mainPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 340, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Treatment Plan :");
        mainPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 140, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Diagnosis :");
        mainPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 110, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Patient ID :");
        mainPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Doctor ID :");
        mainPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Test Results :");
        mainPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Medical Record");
        mainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 204, 102));
        mainPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 710, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 204, 102));
        mainPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 700, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 204, 102));
        mainPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 700, 10));

        headerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel11.setText("Medical Center Management System");
        headerPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 228, -1));

        btnClose.setBackground(new java.awt.Color(255, 255, 255));
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/close.png"))); // NOI18N
        btnClose.setToolTipText("Close Application");
        btnClose.setBorder(null);
        btnClose.setBorderPainted(false);
        btnClose.setContentAreaFilled(false);
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        headerPanel.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 0, 30, 30));

        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/logout.png"))); // NOI18N
        btnLogOut.setToolTipText("Log out");
        btnLogOut.setBorder(null);
        btnLogOut.setBorderPainted(false);
        btnLogOut.setContentAreaFilled(false);
        btnLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        headerPanel.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 0, 30, 30));

        mainPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txtPrescriptionsData.setColumns(20);
        txtPrescriptionsData.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        txtPrescriptionsData.setRows(5);
        jScrollPane3.setViewportView(txtPrescriptionsData);

        mainPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 130, 460, 490));

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/home.png"))); // NOI18N
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        mainPanel.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 40, -1, -1));

        bgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgrounds/addMedicalRecord.png"))); // NOI18N
        mainPanel.add(bgImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 750));

        btnPrint.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        mainPanel.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 640, 120, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void setStatus(String status) {
        this.nowStatus = status;
        if (status.equals("reception")) {
//            btn.setVisible(false);
        }
    }
    
    private void txtMedicationNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicationNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicationNameActionPerformed
    private String checkPrescriptionErrors(Prescription prescription) {

        String errors = "";

        if (prescription.getMedicationName().equals("")) {
            errors += "medication name not entered.\n";
        }
        if (prescription.getDosage().equals("")) {
            errors += "Dosage not entered.\n";
        }
        if (prescription.getStartDate() == "null") {
            errors += "Start date not entered.\n";
        }
        if (prescription.getEndDate() == "null") {
            errors += "End date not entered.\n";
        }
        return errors;
    }

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

//        txtPrescriptionsData.setText("");
        newPrescription.setMedicationName(txtMedicationName.getText());
        newPrescription.setDosage(txtDosage.getText());
        newPrescription.setStartDate(getSelectedDate(startDate));
        newPrescription.setEndDate(getSelectedDate(endDate));

        String errors = checkPrescriptionErrors(newPrescription);

        if (errors.equals("")) {
            medicationsArray.add(new ArrayList<>(Arrays.asList(txtMedicationName.getText(), txtDosage.getText(), getSelectedDate(startDate), getSelectedDate(endDate))));

            JOptionPane.showMessageDialog(this, "medication " + txtMedicationName.getText() + " added Successfully");

            dataText += " - " + newPrescription.getMedicationName() + " | " + newPrescription.getDosage() + " | " + newPrescription.getStartDate() + " | " + newPrescription.getEndDate()+"\n";
            
            txtPrescriptionsData.setText(dataText);
            
            // reset field values
            txtMedicationName.setText("");
            txtDosage.setText("");

            Date date = new Date();
            startDate.setDate(date);
            endDate.setDate(date);

        } else {
            JOptionPane.showMessageDialog(this, "You have following errors.\n" + errors);
        }


    }//GEN-LAST:event_btnAddActionPerformed

//    private void viewFileContent() throws FileNotFoundException, IOException {
//
//        BufferedReader br = new BufferedReader(new FileReader(newPrescriptionFile));
//
//        // Declaring a string variable
//        String st;
//        // Condition holds true till
//        // there is character in a string
//        while ((st = br.readLine()) != null) {
//            txtPrescriptionsData.setText(st);
//        }
//
//    }
    // TO append string into a file
//    public static void appendStrToFile(File file, String str) {
//        // Try block to check for exceptions
//        try {
//
//            // Open given file in append mode by creating an
//            // object of BufferedWriter class
//            BufferedWriter out = new BufferedWriter(new FileWriter(file, true));
//
//            // Writing on output stream
//            out.write(str);
//            // Closing the connection
//            out.close();
//        } // Catch block to handle the exceptions
//        catch (IOException e) {
//
//            // Display message when exception occurs
//            System.out.println("exception occurred" + e);
//        }
//    }
    //format entered date 
    private String getSelectedDate(JDateChooser datachooser) {
        Date date = datachooser.getDate();
        if (date == null) {
            return "null";
        } else {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String strDate = formatter.format(date);
            return strDate;
        }
    }
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        newRecord.setPatient_id(txtPatientId.getText());
        newRecord.setMedical_staff_id(txtDoctorId.getText());
        newRecord.setDiagnosis(txtDiagnosis.getText());
        newRecord.setTratmentPlan(txtTreatmentPlan.getText());
        newRecord.setTestResult(txtTestResults.getText());

        writePrescriptionFile();

        prescriptionDao.insertPrescription(newPrescription);
        recordDao.insertMedicalRecord(newRecord);


    }//GEN-LAST:event_btnSubmitActionPerformed

    private void checkPrescriptionRequiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPrescriptionRequiredActionPerformed

        if (checkPrescriptionRequired.isSelected()) {
            prescrptionDataEnterPanel.setVisible(true);
            txtPrescriptionsData.setText(dataText);

        } else {
            prescrptionDataEnterPanel.setVisible(false);
            System.out.println("not selected");
        }
    }//GEN-LAST:event_checkPrescriptionRequiredActionPerformed

    private void writePrescriptionFile() {
        String text = "";
        try {
            FileWriter newWriter = new FileWriter(newPrescriptionFile);
            newWriter.write("********* PRESCRIPTION *********\n");
            newWriter.write("Date and Time : " + getDateAndTime() + "\n");
            newWriter.write("Doctor Name : " + "name of doctor" + "\n\n");
            newWriter.write("====================================\n");
            newWriter.write("| Medication | Dosage | Start date | End date |\n");

            for (ArrayList<String> arrayList : medicationsArray) {
                text += " - ";
                for (String string : arrayList) {
                    text += string + " | ";
                }

                newWriter.write(text);
                newWriter.write("\n");
            }

            newWriter.write("\n");
            newWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(AddMedicalRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        ImageIcon icon = new ImageIcon("D:\\Projects\\COST Project\\MedicalCenterManagementSystem\\src\\images\\icons\\warning.png");
        //        int res = JOptionPane.showConfirmDialog(null, "Are you sure to exit ?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
        int res = JOptionPane.showConfirmDialog(null, "Are you sure to exit ?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, icon);
        if (res == 0) {
            System.exit(res);
        } else if (res == 1) {
            //         System.out.println("Pressed NO");
        }
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        ImageIcon icon = new ImageIcon("D:\\Projects\\COST Project\\MedicalCenterManagementSystem\\src\\images\\icons\\logout 50.png");
        //        int res = JOptionPane.showConfirmDialog(null, "Are you sure to exit ?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
        int res = JOptionPane.showConfirmDialog(null, "Are you sure to Log Out ?", "Log Out", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, icon);
        if (res == 0) {
            new LogInForm().setVisible(true);
            this.dispose();
        } else if (res == 1) {
            //         System.out.println("Pressed NO");
        }
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        if (nowStatus.equals("reception")) {

            new HomeFormReceptionist().setVisible(true);
            this.dispose();
            
        } else if (nowStatus.equals("doctor")) {
            
            new HomeFormDoctor().setVisible(true);
            this.dispose();
            
        } else if (nowStatus.equals("admin")) {
            
            new HomeForm().setVisible(true);
            this.dispose();
            
        }
    }//GEN-LAST:event_btnHomeActionPerformed

    private String getDateAndTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        return dtf.format(now);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        FlatIntelliJLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMedicalRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgImage;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JCheckBox checkPrescriptionRequired;
    private com.toedter.calendar.JDateChooser endDate;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel prescrptionDataEnterPanel;
    private com.toedter.calendar.JDateChooser startDate;
    private javax.swing.JTextField txtDiagnosis;
    private javax.swing.JTextField txtDoctorId;
    private javax.swing.JTextField txtDosage;
    private javax.swing.JTextField txtMedicationName;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextArea txtPrescriptionsData;
    private javax.swing.JTextArea txtTestResults;
    private javax.swing.JTextArea txtTreatmentPlan;
    // End of variables declaration//GEN-END:variables
}
