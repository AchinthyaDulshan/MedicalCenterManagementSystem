/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospital;

import com.formdev.flatlaf.FlatIntelliJLaf;
import home.HomeForm;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logIn.LogInForm;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Achinthya Dulshan
 */
public class HospitalDetailsForm extends javax.swing.JFrame {

    HospitalDao dao;
    
    public HospitalDetailsForm() {
        initComponents();
        dao = new HospitalDao();
        loadTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        hospitalTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        btnRegisterHospital = new javax.swing.JButton();
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

        hospitalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        hospitalTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(hospitalTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 860, 480));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hospital Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 100, 270, 60));

        btnUpdate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/edit.png"))); // NOI18N
        btnUpdate.setText(" EDIT");
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 200, 50));

        btnDelete.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/delete.png"))); // NOI18N
        btnDelete.setText(" DELETE");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 200, 50));

        btnAdd.setBackground(new java.awt.Color(0, 153, 153));
        btnAdd.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("SEARCH");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 90, 30));

        btnClear.setBackground(new java.awt.Color(255, 51, 51));
        btnClear.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("CLEAR");
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 90, 30));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 200, 30));

        btnRegisterHospital.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnRegisterHospital.setText("Register Hospital");
        btnRegisterHospital.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegisterHospital.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegisterHospitalMouseClicked(evt);
            }
        });
        getContentPane().add(btnRegisterHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, 250, 50));

        btnReturnToHome.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnReturnToHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/home.png"))); // NOI18N
        btnReturnToHome.setText(" Return to Home");
        btnReturnToHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReturnToHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnToHomeMouseClicked(evt);
            }
        });
        getContentPane().add(btnReturnToHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 610, 250, 50));

        jSeparator1.setForeground(new java.awt.Color(204, 153, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 880, 10));

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

        bgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgrounds/hospitalDetails.png"))); // NOI18N
        getContentPane().add(bgImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void btnRegisterHospitalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterHospitalMouseClicked
        new HospitalRegForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegisterHospitalMouseClicked

    private void btnReturnToHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnToHomeMouseClicked
        new HomeForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReturnToHomeMouseClicked

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        ImageIcon icon = new ImageIcon("D:\\Projects\\COST Project\\MedicalCenterManagementSystem\\src\\images\\icons\\warning.png");
        //        int res = JOptionPane.showConfirmDialog(null, "Are you sure to exit ?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
        int res = JOptionPane.showConfirmDialog(null, "Are you sure to exit ?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, icon);
        if(res == 0) {
            System.exit(res);
        } else if (res == 1) {
            //         System.out.println("Pressed NO");
        }
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        ImageIcon icon = new ImageIcon("D:\\Projects\\COST Project\\MedicalCenterManagementSystem\\src\\images\\icons\\logout 50.png");
        //        int res = JOptionPane.showConfirmDialog(null, "Are you sure to exit ?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
        int res = JOptionPane.showConfirmDialog(null, "Are you sure to Log Out ?", "Log Out", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, icon);
        if(res == 0) {
            new LogInForm().setVisible(true);
            this.dispose();
        } else if (res == 1) {
            //         System.out.println("Pressed NO");
        }
    }//GEN-LAST:event_btnLogOutActionPerformed

    
    //create method to load patient details to JTable
    private void loadTable() {
        ResultSet rs = dao.fillTableData();
        hospitalTable.setModel(DbUtils.resultSetToTableModel(rs));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        FlatIntelliJLaf.setup();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HospitalDetailsForm().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgImage;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnRegisterHospital;
    private javax.swing.JButton btnReturnToHome;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JTable hospitalTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
