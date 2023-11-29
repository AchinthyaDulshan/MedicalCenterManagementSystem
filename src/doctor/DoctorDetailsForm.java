/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package doctor;

import home.HomeForm;


/**
 *
 * @author Achinthya Dulshan
 */
public class DoctorDetailsForm extends javax.swing.JFrame {

    /**
     * Creates new form PatientDetailsForm
     */
    public DoctorDetailsForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        headerText = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        footerText = new javax.swing.JLabel();
        navPanel = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        btnDoctorRegistration = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReturnToHome = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        mainDataPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

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
        btnSearch.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        navPanel.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 90, 30));

        btnDoctorRegistration.setBackground(new java.awt.Color(70, 73, 75));
        btnDoctorRegistration.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDoctorRegistration.setForeground(new java.awt.Color(255, 255, 255));
        btnDoctorRegistration.setText("Doctor Registration");
        btnDoctorRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorRegistrationActionPerformed(evt);
            }
        });
        navPanel.add(btnDoctorRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 250, 40));

        btnUpdate.setBackground(new java.awt.Color(70, 73, 75));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("EDIT");
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
        btnReturnToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnToHomeActionPerformed(evt);
            }
        });
        navPanel.add(btnReturnToHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 250, 40));

        btnClear.setBackground(new java.awt.Color(255, 51, 51));
        btnClear.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("CLEAR");
        navPanel.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 90, 30));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        navPanel.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 22, 200, 30));

        getContentPane().add(navPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 280, 530));

        mainDataPanel.setBackground(new java.awt.Color(78, 80, 82));
        mainDataPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Doctor Details");
        mainDataPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 140, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        mainDataPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 700, 440));

        getContentPane().add(mainDataPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 720, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void btnDoctorRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorRegistrationActionPerformed
        new DoctorRegForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDoctorRegistrationActionPerformed

    private void btnReturnToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnToHomeActionPerformed
        new HomeForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReturnToHomeActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(DoctorDetailsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorDetailsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorDetailsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorDetailsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorDetailsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDoctorRegistration;
    private javax.swing.JButton btnReturnToHome;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel footer;
    private javax.swing.JLabel footerText;
    private javax.swing.JPanel header;
    private javax.swing.JLabel headerText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel mainDataPanel;
    private javax.swing.JPanel navPanel;
    // End of variables declaration//GEN-END:variables
}
