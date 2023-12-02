/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospital;

import home.HomeForm;

/**
 *
 * @author Achinthya Dulshan
 */
public class HospitalRegForm extends javax.swing.JFrame {

   
    HospitalDao dao;
    
    public HospitalRegForm() {
        initComponents();
        dao = new HospitalDao();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtHospitalName = new javax.swing.JTextField();
        txtContactNo_1 = new javax.swing.JTextField();
        txtContactNo_2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHospitalAddress = new javax.swing.JTextArea();
        formHeading = new javax.swing.JLabel();
        navPanel = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnShowHospitalDetails = new javax.swing.JButton();
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
        jLabel1.setText("Hospital Name :");
        mainDataPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 130, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Address :");
        mainDataPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contact No :");
        mainDataPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contact No :");
        mainDataPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));
        mainDataPanel.add(txtHospitalName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 340, -1));
        mainDataPanel.add(txtContactNo_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 180, -1));
        mainDataPanel.add(txtContactNo_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 180, -1));

        txtHospitalAddress.setColumns(20);
        txtHospitalAddress.setRows(5);
        jScrollPane1.setViewportView(txtHospitalAddress);

        mainDataPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 340, 50));

        formHeading.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        formHeading.setForeground(new java.awt.Color(255, 255, 255));
        formHeading.setText("Register Hospital");
        mainDataPanel.add(formHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 160, -1));

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

        btnShowHospitalDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnShowHospitalDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnShowHospitalDetails.setText("Show Hospital Details");
        btnShowHospitalDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnShowHospitalDetailsMouseClicked(evt);
            }
        });
        navPanel.add(btnShowHospitalDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 250, 40));

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
        btnReturnToHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnToHomeMouseClicked(evt);
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

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        Hospital insertingHospital = new Hospital();
   
        insertingHospital.setHospitalName(txtHospitalName.getText());
        insertingHospital.setHospitalAddress(txtHospitalAddress.getText());
        insertingHospital.setContactNo_1(txtContactNo_1.getText());
        insertingHospital.setContactNo_2(txtContactNo_2.getText());

        
        dao.insertHospital(insertingHospital, this);
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnShowHospitalDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowHospitalDetailsMouseClicked
        new HospitalDetailsForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnShowHospitalDetailsMouseClicked

    private void btnReturnToHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnToHomeMouseClicked
        new HomeForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReturnToHomeMouseClicked

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
            java.util.logging.Logger.getLogger(HospitalRegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospitalRegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospitalRegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospitalRegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HospitalRegForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReturnToHome;
    private javax.swing.JButton btnShowHospitalDetails;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel footer;
    private javax.swing.JLabel footerText;
    private javax.swing.JLabel formHeading;
    private javax.swing.JPanel header;
    private javax.swing.JLabel headerText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainDataPanel;
    private javax.swing.JPanel navPanel;
    private javax.swing.JTextField txtContactNo_1;
    private javax.swing.JTextField txtContactNo_2;
    private javax.swing.JTextArea txtHospitalAddress;
    private javax.swing.JTextField txtHospitalName;
    // End of variables declaration//GEN-END:variables
}
