/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package patient;

import com.formdev.flatlaf.FlatIntelliJLaf;
import home.HomeForm;
import home.HomeFormDoctor;
import home.HomeFormReceptionist;
import net.proteanit.sql.DbUtils;
import java.sql.ResultSet;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logIn.LogInForm;
import logIn.UserDao;

/**
 *
 * @author Achinthya Dulshan
 */
public class PatientDetailsForm extends javax.swing.JFrame {

    PatientDao patientDBObj;
    private String userRole = UserDao.logInUser.getRole();

    /**
     * Creates new form PatientDetailsForm
     */
    public PatientDetailsForm() {
        initComponents();
        patientDBObj = new PatientDao();
        loadTable();
        btnUpdate.setVisible(false);
        btnDelete.setVisible(false);
        checkPrivillage();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnPatientRegister = new javax.swing.JButton();
        btnReturnToHome = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        headerPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        bgImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Patient Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 100, 260, -1));

        patientTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        patientTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        patientTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(patientTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 870, 510));

        btnUpdate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/edit.png"))); // NOI18N
        btnUpdate.setText(" EDIT");
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 200, 50));

        btnDelete.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/delete.png"))); // NOI18N
        btnDelete.setText(" DELETE");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 200, 50));

        btnPatientRegister.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnPatientRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/patient.png"))); // NOI18N
        btnPatientRegister.setText(" Register Patient");
        btnPatientRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPatientRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPatientRegisterMouseClicked(evt);
            }
        });
        getContentPane().add(btnPatientRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 250, 50));

        btnReturnToHome.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnReturnToHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/home.png"))); // NOI18N
        btnReturnToHome.setText(" Return to Home");
        btnReturnToHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReturnToHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnToHomeMouseClicked(evt);
            }
        });
        getContentPane().add(btnReturnToHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 600, 250, 50));

        jSeparator1.setForeground(new java.awt.Color(102, 255, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 880, 10));

        headerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel3.setText("Medical Center Management System");
        headerPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 228, -1));

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

        bgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgrounds/patientDetails.png"))); // NOI18N
        bgImage.setText("jLabel2");
        getContentPane().add(bgImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -4, 1410, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void checkPrivillage() {
        if (userRole.equals("reception")) {
            
        }
    }
    
    //view Patient Register form when patient registration is called
    private void btnPatientRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPatientRegisterMouseClicked
        new PatientRegForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPatientRegisterMouseClicked

    private void patientTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientTableMouseClicked
        btnUpdate.setVisible(true);
        btnDelete.setVisible(true);
    }//GEN-LAST:event_patientTableMouseClicked

    //when update button clicked this will load a patient update form
    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        int selectedRow = patientTable.getSelectedRow();
        generateUpdateFormValues(selectedRow);
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnReturnToHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnToHomeMouseClicked
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
    }//GEN-LAST:event_btnReturnToHomeMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked

        int res = JOptionPane.showConfirmDialog(null, "Are you sure to delete ?", "Delete Message", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (res == 0) {
            int selectedRow = patientTable.getSelectedRow();

            DefaultTableModel model = (DefaultTableModel) patientTable.getModel();

            Patient deletingPatient = new Patient();

            deletingPatient.setPatientId(model.getValueAt(selectedRow, 0).toString());

            patientDBObj.deletePatient(deletingPatient);

            loadTable();
        } else if (res == 1) {
            //         System.out.println("Pressed NO");
        }


    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

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
        int res = JOptionPane.showConfirmDialog(null, "Are you sure to Log Out ?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, icon);
        if (res == 0) {
            new LogInForm().setVisible(true);
            this.dispose();
        } else if (res == 1) {
            //         System.out.println("Pressed NO");
        }
    }//GEN-LAST:event_btnLogOutActionPerformed

//    ========================================== Need to Check Again doesn't work > bind data to patient object Passed ==================================================================================
    //create method to generate update patient details form
    private void generateUpdateFormValues(int selectedRow) {

        DefaultTableModel model = (DefaultTableModel) patientTable.getModel();

        Patient updatingPatient = new Patient();

        updatingPatient.setPatientId(model.getValueAt(selectedRow, 0).toString());
        updatingPatient.setFirstName(model.getValueAt(selectedRow, 1).toString());
        updatingPatient.setLastName(model.getValueAt(selectedRow, 2).toString());
        updatingPatient.setAddress(model.getValueAt(selectedRow, 3).toString());
        updatingPatient.setNIC(model.getValueAt(selectedRow, 4).toString());
        updatingPatient.setGender(model.getValueAt(selectedRow, 5).toString());
        updatingPatient.setDateOfBirth(model.getValueAt(selectedRow, 6).toString());
        updatingPatient.setBloodGroup(model.getValueAt(selectedRow, 7).toString());
        updatingPatient.setContactNo_1(model.getValueAt(selectedRow, 8).toString());
        updatingPatient.setContactNo_2(model.getValueAt(selectedRow, 9).toString());

        PatientRegForm patientForm = new PatientRegForm();
        try {
            patientForm.updatePatientDetails(updatingPatient);
        } catch (ParseException ex) {
            Logger.getLogger(PatientDetailsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }

    //create method to load patient details to JTable
    private void loadTable() {
        ResultSet rs = patientDBObj.fillTableData();
        patientTable.setModel(DbUtils.resultSetToTableModel(rs));
    }

    public static void main(String args[]) {

        FlatIntelliJLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientDetailsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgImage;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnPatientRegister;
    private javax.swing.JButton btnReturnToHome;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable patientTable;
    // End of variables declaration//GEN-END:variables
}
