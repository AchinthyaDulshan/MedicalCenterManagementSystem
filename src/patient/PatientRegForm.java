/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package patient;

import home.HomeForm;
import javax.swing.JTextField;

/**
 *
 * @author Achinthya Dulshan
 */
public class PatientRegForm extends javax.swing.JFrame {
    
    PatientDao dao;

    public PatientRegForm() {
        initComponents();
        dao = new PatientDao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        headerText = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        footerText = new javax.swing.JLabel();
        mainDataPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtNIC = new javax.swing.JTextField();
        selectGender = new javax.swing.JComboBox<>();
        selectBloodGroup = new javax.swing.JComboBox<>();
        txtContact_1 = new javax.swing.JTextField();
        txtContact_2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        txtDateofBirth = new javax.swing.JTextField();
        formHeading = new javax.swing.JLabel();
        navPanel = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnShowPatientDetails = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReturnToHome = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(25, 123, 48));

        headerText.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        headerText.setForeground(new java.awt.Color(255, 255, 255));
        headerText.setText("Medical Center Management System (MCMS)");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(headerText, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(207, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(headerText)
                .addGap(33, 33, 33))
        );

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 100));

        footer.setBackground(new java.awt.Color(0, 0, 102));
        footer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        footerText.setText("Footer text");
        footer.add(footerText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 471, -1));

        getContentPane().add(footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 1000, 20));

        mainDataPanel.setBackground(new java.awt.Color(78, 80, 82));
        mainDataPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("First Name :");
        mainDataPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 89, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Last Name :");
        mainDataPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Address :");
        mainDataPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NIC :");
        mainDataPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gender :");
        mainDataPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date of Birth :");
        mainDataPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contact No :");
        mainDataPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contact No :");
        mainDataPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Blood Group :");
        mainDataPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));
        mainDataPanel.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 210, 30));
        mainDataPanel.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 210, 30));
        mainDataPanel.add(txtNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 210, 30));

        selectGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        mainDataPanel.add(selectGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 210, 30));

        selectBloodGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        selectBloodGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBloodGroupActionPerformed(evt);
            }
        });
        mainDataPanel.add(selectBloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 210, 30));

        txtContact_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContact_1KeyTyped(evt);
            }
        });
        mainDataPanel.add(txtContact_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 210, 30));

        txtContact_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContact_2KeyTyped(evt);
            }
        });
        mainDataPanel.add(txtContact_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 210, 30));

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        mainDataPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 550, 60));

        txtDateofBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateofBirthActionPerformed(evt);
            }
        });
        mainDataPanel.add(txtDateofBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 210, 30));

        formHeading.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        formHeading.setForeground(new java.awt.Color(255, 255, 255));
        formHeading.setText("Register Patient");
        mainDataPanel.add(formHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        getContentPane().add(mainDataPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 720, 530));

        navPanel.setBackground(new java.awt.Color(78, 80, 82));
        navPanel.setForeground(new java.awt.Color(255, 255, 255));
        navPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdd.setBackground(new java.awt.Color(0, 255, 51));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("ADD");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        navPanel.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 200, 40));

        btnShowPatientDetails.setBackground(new java.awt.Color(70, 73, 75));
        btnShowPatientDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnShowPatientDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnShowPatientDetails.setText("Show Patient Details");
        btnShowPatientDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnShowPatientDetailsMouseClicked(evt);
            }
        });
        navPanel.add(btnShowPatientDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 250, 40));

        btnUpdate.setBackground(new java.awt.Color(102, 102, 255));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE");
        navPanel.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 200, 40));

        btnDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        navPanel.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 200, 40));

        btnReturnToHome.setBackground(new java.awt.Color(255, 197, 62));
        btnReturnToHome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnReturnToHome.setForeground(new java.awt.Color(255, 255, 255));
        btnReturnToHome.setText("Return to Home");
        btnReturnToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnToHomeActionPerformed(evt);
            }
        });
        navPanel.add(btnReturnToHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 250, 40));

        btnClear.setBackground(new java.awt.Color(204, 204, 0));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("CLEAR");
        navPanel.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 200, 40));

        getContentPane().add(navPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 280, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void selectBloodGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBloodGroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectBloodGroupActionPerformed

    //when click on Show Patient Details button
    private void btnShowPatientDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowPatientDetailsMouseClicked
        new PatientDetailsForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnShowPatientDetailsMouseClicked

    private void txtDateofBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateofBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateofBirthActionPerformed

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked

        Patient insertingPatient = new Patient();

        insertingPatient.setFirstName(txtFirstName.getText());
        insertingPatient.setLastName(txtLastName.getText());
        insertingPatient.setAddress(txtAddress.getText());
        insertingPatient.setNIC(txtNIC.getText());
        insertingPatient.setDateOfBirth(txtDateofBirth.getText());
        insertingPatient.setGender(selectGender.getSelectedItem().toString());
        insertingPatient.setBloodGroup(selectBloodGroup.getSelectedItem().toString());
        insertingPatient.setContactNo_1(txtContact_1.getText());
        insertingPatient.setContactNo_2(txtContact_2.getText());
        
        dao.insertPatient(insertingPatient, this);
        
    }//GEN-LAST:event_btnAddMouseClicked

    private void txtContact_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContact_1KeyTyped
        validateMobileNo(evt,txtContact_1);
    }//GEN-LAST:event_txtContact_1KeyTyped

    private void txtContact_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContact_2KeyTyped
        validateMobileNo(evt,txtContact_2);
    }//GEN-LAST:event_txtContact_2KeyTyped

    private void btnReturnToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnToHomeActionPerformed
        // TODO add your handling code here:
        new HomeForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReturnToHomeActionPerformed

    private void validateMobileNo(java.awt.event.KeyEvent evt,JTextField textField) {

//        String contactNoLength = txtContact_1.getText().length();
        
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }

    public void updatePatientDetails(Patient updatingPatient) {
//        new PatientRegForm().setVisible(true);

        System.out.println("name: " + updatingPatient.getFirstName() + " " + updatingPatient.getLastName());

        formHeading.setText("Update Patient Details");

        txtFirstName.setText("Hello");
        txtFirstName.setText(updatingPatient.getFirstName());
        txtLastName.setText(updatingPatient.getLastName());
        txtAddress.setText(updatingPatient.getAddress());
        txtNIC.setText(updatingPatient.getNIC());
        selectGender.setSelectedItem(updatingPatient.getGender());
        txtDateofBirth.setText(updatingPatient.getDateOfBirth());
        selectBloodGroup.setSelectedItem(updatingPatient.getBloodGroup());
        txtContact_1.setText(updatingPatient.getContactNo_1());
        txtContact_2.setText(updatingPatient.getContactNo_2());

        new PatientRegForm().setVisible(true);
    }

    public static void main(String args[]) {

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PatientRegForm().setVisible(true);
//            }
//        });
        new PatientRegForm().setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReturnToHome;
    private javax.swing.JButton btnShowPatientDetails;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel footer;
    private javax.swing.JLabel footerText;
    private javax.swing.JLabel formHeading;
    private javax.swing.JPanel header;
    private javax.swing.JLabel headerText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainDataPanel;
    private javax.swing.JPanel navPanel;
    private javax.swing.JComboBox<String> selectBloodGroup;
    private javax.swing.JComboBox<String> selectGender;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtContact_1;
    private javax.swing.JTextField txtContact_2;
    private javax.swing.JTextField txtDateofBirth;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtNIC;
    // End of variables declaration//GEN-END:variables
}
