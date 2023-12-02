/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package patient;

import home.HomeForm;
import net.proteanit.sql.DbUtils;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Achinthya Dulshan
 */
public class PatientDetailsForm extends javax.swing.JFrame {

    PatientDao patientDBObj;

    /**
     * Creates new form PatientDetailsForm
     */
    public PatientDetailsForm() {
        initComponents();
        patientDBObj = new PatientDao();
        loadTable();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        headerText = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        footerText = new javax.swing.JLabel();
        navPanel = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        btnPatientRegister = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReturnToHome = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        mainDataPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();

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

        navPanel.setBackground(new java.awt.Color(78, 80, 82));
        navPanel.setForeground(new java.awt.Color(255, 255, 255));
        navPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSearch.setBackground(new java.awt.Color(0, 153, 153));
        btnSearch.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("SEARCH");
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        navPanel.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 90, 30));

        btnPatientRegister.setBackground(new java.awt.Color(70, 73, 75));
        btnPatientRegister.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPatientRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnPatientRegister.setText("Register Patient");
        btnPatientRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPatientRegisterMouseClicked(evt);
            }
        });
        navPanel.add(btnPatientRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 250, 40));

        btnUpdate.setBackground(new java.awt.Color(70, 73, 75));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });
        navPanel.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 200, 40));

        btnDelete.setBackground(new java.awt.Color(70, 73, 75));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        navPanel.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 200, 40));

        btnReturnToHome.setBackground(new java.awt.Color(255, 197, 62));
        btnReturnToHome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnReturnToHome.setForeground(new java.awt.Color(255, 255, 255));
        btnReturnToHome.setText("Return to Home");
        btnReturnToHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnToHomeMouseClicked(evt);
            }
        });
        navPanel.add(btnReturnToHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 250, 40));

        btnClear.setBackground(new java.awt.Color(255, 51, 51));
        btnClear.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("CLEAR");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });
        navPanel.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 90, 30));

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        navPanel.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 22, 200, 30));

        getContentPane().add(navPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 280, 530));

        mainDataPanel.setBackground(new java.awt.Color(78, 80, 82));
        mainDataPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Patient Details");
        mainDataPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 120, -1));

        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        patientTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(patientTable);

        mainDataPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 710, 440));

        getContentPane().add(mainDataPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 720, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    //view Patient Register form when patient registration is called
    private void btnPatientRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPatientRegisterMouseClicked
        new PatientRegForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPatientRegisterMouseClicked

    private void patientTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientTableMouseClicked

    }//GEN-LAST:event_patientTableMouseClicked

    //when update button clicked this will load a patient update form
    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        int selectedRow = patientTable.getSelectedRow();
        generateUpdateFormValues(selectedRow);
    }//GEN-LAST:event_btnUpdateMouseClicked

    //clear search textField when btnClear clicked
    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        txtSearch.setText("");
    }//GEN-LAST:event_btnClearMouseClicked

    //create method to search a patient
    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked

        //create patient object and set patientId for object in order to search
        Patient searchingPatient = new Patient();
        searchingPatient.setIdFromDB(Integer.parseInt(txtSearch.getText()));

        //invoke method in patientDao and return resultset
//        ResultSet rs = patientDBObj.searchPatient(searchingPatient);
//        patientTable.setModel(DbUtils.resultSetToTableModel(rs));
        
    }//GEN-LAST:event_btnSearchMouseClicked

    private void btnReturnToHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnToHomeMouseClicked
        new HomeForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReturnToHomeMouseClicked

//    ========================================== Need to Check Again doesn't work > bind data to patient object Passed ==================================================================================
    //create method to generate update patient details form
    private void generateUpdateFormValues(int selectedRow) {

        DefaultTableModel model = (DefaultTableModel) patientTable.getModel();

        Patient updatingPatient = new Patient();

        updatingPatient.setIdFromDB(Integer.parseInt(model.getValueAt(selectedRow, 0).toString()));
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
        patientForm.updatePatientDetails(updatingPatient);
        this.dispose();
    }

    
    //create method to load patient details to JTable
    private void loadTable() {
        ResultSet rs = patientDBObj.fillTableData();
        patientTable.setModel(DbUtils.resultSetToTableModel(rs));
    }

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PatientDetailsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientDetailsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientDetailsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientDetailsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientDetailsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPatientRegister;
    private javax.swing.JButton btnReturnToHome;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel footer;
    private javax.swing.JLabel footerText;
    private javax.swing.JPanel header;
    private javax.swing.JLabel headerText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainDataPanel;
    private javax.swing.JPanel navPanel;
    private javax.swing.JTable patientTable;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
