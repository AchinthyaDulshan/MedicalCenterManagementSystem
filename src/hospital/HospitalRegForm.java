/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospital;

import com.formdev.flatlaf.FlatIntelliJLaf;
import home.HomeForm;
import home.HomeFormDoctor;
import home.HomeFormReceptionist;
import java.text.ParseException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logIn.LogInForm;
import logIn.UserDao;
import static validation.Validation.txtAreaValidation;
import static validation.Validation.txtFieldValidation;

/**
 *
 * @author Achinthya Dulshan
 */
public class HospitalRegForm extends javax.swing.JFrame {

    HospitalDao dao;
    private static Hospital hospital = new Hospital();
    private String userRole = UserDao.logInUser.getRole();
    private static HospitalRegForm updatingHospitalForm;
    private static Hospital updatingHospital;

    public HospitalRegForm() {
        initComponents();
        dao = new HospitalDao();
        btnUpdate.setVisible(false);
        checkPrivillage();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtContactNo_2 = new javax.swing.JTextField();
        txtContactNo_1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHospitalAddress = new javax.swing.JTextArea();
        txtHospitalName = new javax.swing.JTextField();
        formHeading = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnShowHospitalDetails = new javax.swing.JButton();
        btnReturnToHome = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        headerPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        bgImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setLabelFor(txtHospitalName);
        jLabel1.setText("Hospital Name :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 130, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setLabelFor(txtHospitalAddress);
        jLabel3.setText("Address :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setLabelFor(txtContactNo_1);
        jLabel8.setText("Contact No :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setLabelFor(txtContactNo_2);
        jLabel7.setText("Contact No :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, -1, -1));

        txtContactNo_2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtContactNo_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContactNo_2KeyReleased(evt);
            }
        });
        getContentPane().add(txtContactNo_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 480, 180, -1));

        txtContactNo_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtContactNo_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContactNo_1KeyReleased(evt);
            }
        });
        getContentPane().add(txtContactNo_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 180, -1));

        txtHospitalAddress.setColumns(20);
        txtHospitalAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtHospitalAddress.setRows(5);
        txtHospitalAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHospitalAddressKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtHospitalAddress);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, 340, 50));

        txtHospitalName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtHospitalName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHospitalNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtHospitalName, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 280, 340, -1));

        formHeading.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        formHeading.setForeground(new java.awt.Color(255, 255, 255));
        formHeading.setText("Register Hospital");
        getContentPane().add(formHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 100, 330, 60));

        btnAdd.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/add.png"))); // NOI18N
        btnAdd.setText(" ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 200, 50));

        btnUpdate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 200, 50));

        btnShowHospitalDetails.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnShowHospitalDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/redCross.png"))); // NOI18N
        btnShowHospitalDetails.setText(" Show Hospital Details");
        btnShowHospitalDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowHospitalDetailsActionPerformed(evt);
            }
        });
        getContentPane().add(btnShowHospitalDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, 260, 50));

        btnReturnToHome.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnReturnToHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/home.png"))); // NOI18N
        btnReturnToHome.setText(" Return to Home");
        btnReturnToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnToHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnReturnToHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 590, 260, 50));

        jSeparator1.setForeground(new java.awt.Color(255, 204, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 830, 10));

        headerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel10.setText("Medical Center Management System");
        headerPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 228, -1));

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

        getContentPane().add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 30));

        bgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgrounds/hospitalRegister.png"))); // NOI18N
        getContentPane().add(bgImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        if (txtContactNo_2.getText().equals("")) {
            hospital.setContactNo_2("");
        }

        String errors = checkErrors(hospital);

        if (errors.equals("")) {
            dao.insertHospital(hospital);
            JOptionPane.showMessageDialog(null, "Hospital inserted successfully");

            new HospitalDetailsForm().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "You have following errors.\n" + errors);
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void checkPrivillage() {
        if (userRole.equals("reception")) {

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

    private void btnShowHospitalDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowHospitalDetailsActionPerformed
        new HospitalDetailsForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnShowHospitalDetailsActionPerformed

    private void btnReturnToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnToHomeActionPerformed
        if (userRole.equals("reception")) {

            new HomeFormReceptionist().setVisible(true);
            this.dispose();

        } else if (userRole.equals("doctor")) {

            new HomeFormDoctor().setVisible(true);
            this.dispose();

        } else if (userRole.equals("admin")) {

            new HomeForm().setVisible(true);
            this.dispose();

        }
    }//GEN-LAST:event_btnReturnToHomeActionPerformed

    private void txtHospitalNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHospitalNameKeyReleased
        String pattern = "^(.*)$";
        txtFieldValidation(txtHospitalName, pattern, hospital, "setHospitalName");
    }//GEN-LAST:event_txtHospitalNameKeyReleased

    private void txtHospitalAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHospitalAddressKeyReleased
        String pattern = "^(.*)$";
        txtAreaValidation(txtHospitalAddress, pattern, hospital, "setHospitalAddress");
    }//GEN-LAST:event_txtHospitalAddressKeyReleased

    private void txtContactNo_1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactNo_1KeyReleased
        String pattern = "^([0][7][01245678][0-9]{7})|([0][012345689][0-9]{8})$";
        txtFieldValidation(txtContactNo_1, pattern, hospital, "setContactNo_1");
    }//GEN-LAST:event_txtContactNo_1KeyReleased

    private void txtContactNo_2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactNo_2KeyReleased
        String pattern = "^([0][7][01245678][0-9]{7})|([0][012345689][0-9]{8})$";
        txtFieldValidation(txtContactNo_2, pattern, hospital, "setContactNo_2");
    }//GEN-LAST:event_txtContactNo_2KeyReleased

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        hospital.setHospitalId(updatingHospital.getHospitalId());
        
        
        if (txtContactNo_2.getText().equals("")) {
            hospital.setContactNo_2("");
        }
        
        // check what values were updated
        String updates = checkUpdates(hospital);

        // check whether reqiured fields have empty values
        String errors = checkErrors(hospital);

        if (errors.equals("")) {

            // if required fields are filled
            if (updates == "") {
                // if it doesn't update any value --> show message
                JOptionPane.showMessageDialog(null, "No updates have been done.");

            } else {
                // if it update any value --> show message with updated fields
                int result = JOptionPane.showConfirmDialog(null, updates);

                // Check the user's choice
                if (result == JOptionPane.YES_OPTION) {

                    //perform update & load doctor table
                    dao.updateHospital(hospital);
                    new HospitalDetailsForm().setVisible(true);
                    this.dispose();

                } else if (result == JOptionPane.NO_OPTION) {

                } else if (result == JOptionPane.CANCEL_OPTION) {

                    //reload Patient details form and abort action
                    new HospitalDetailsForm().setVisible(true);
                    this.dispose();

                } else if (result == JOptionPane.CLOSED_OPTION) {

                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "You have following errors.\n" + errors);
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private String checkUpdates(Hospital existingHospital) {

        String updates = "";

        if (!updatingHospital.getHospitalName().equals(existingHospital.getHospitalName())) {
            updates += "Hospital name Changed. \n";
        }
        if (!updatingHospital.getHospitalAddress().equals(existingHospital.getHospitalAddress())) {
            updates += "Hospital address Changed. \n";
        }
        if (!updatingHospital.getContactNo_1().equals(existingHospital.getContactNo_1())) {
            updates += "Hospital contact no.1 Changed. \n";
        }
        if (!updatingHospital.getContactNo_2().equals(existingHospital.getContactNo_2())) {
            updates += "Hospital contact no.2 Changed. \n";
        }

        return updates;
    }
    // define method for check empty values in required fields
    private String checkErrors(Hospital hospital) {

        String errors = "";

        if (hospital.getHospitalName() == null || hospital.getHospitalName().equals("")) {
            errors += "Hospital name not entered.\n";
        }
        if (hospital.getHospitalAddress() == null || hospital.getHospitalAddress().equals("")) {
            errors += "Hospital Address not entered.\n";
        }
        if (hospital.getContactNo_1() == null || hospital.getContactNo_1().equals("")) {
            errors += "Contact No:1 not entered.\n";
        }

        return errors;
    }
    
    public void updateHospitalDetails(Hospital selectedHospital) throws ParseException {

        hospital = new Hospital(selectedHospital.getHospitalId(),selectedHospital.getHospitalName(),selectedHospital.getHospitalAddress(),selectedHospital.getContactNo_1(),selectedHospital.getContactNo_2());
        updatingHospital = new Hospital(selectedHospital.getHospitalId(),selectedHospital.getHospitalName(),selectedHospital.getHospitalAddress(),selectedHospital.getContactNo_1(),selectedHospital.getContactNo_2());

        if (updatingHospitalForm == null) {
            updatingHospitalForm = new HospitalRegForm();
        }

        updatingHospitalForm.formHeading.setText("Update Doctor Details");

        updatingHospitalForm.txtHospitalName.setText(selectedHospital.getHospitalName());
        updatingHospitalForm.txtHospitalAddress.setText(selectedHospital.getHospitalAddress());
        updatingHospitalForm.txtContactNo_1.setText(selectedHospital.getContactNo_1());
        updatingHospitalForm.txtContactNo_2.setText(selectedHospital.getContactNo_2());
        updatingHospitalForm.btnAdd.setVisible(false);
        updatingHospitalForm.btnUpdate.setVisible(true);

        updatingHospitalForm.setVisible(true);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatIntelliJLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HospitalRegForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgImage;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnReturnToHome;
    private javax.swing.JButton btnShowHospitalDetails;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel formHeading;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtContactNo_1;
    private javax.swing.JTextField txtContactNo_2;
    private javax.swing.JTextArea txtHospitalAddress;
    private javax.swing.JTextField txtHospitalName;
    // End of variables declaration//GEN-END:variables
}
