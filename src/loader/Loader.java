/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loader;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Color;
import logIn.LogInForm;

/**
 *
 * @author Achinthya Dulshan
 */
public class Loader extends javax.swing.JFrame {

    /**
     * Creates new form Loader
     */
    public Loader() {
        initComponents();
        loaderProgress.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loaderHeader = new javax.swing.JLabel();
        loaderProgress = new javax.swing.JProgressBar();
        loaderPercentage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        loaderBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loaderHeader.setFont(new java.awt.Font("Segoe UI Semibold", 1, 48)); // NOI18N
        loaderHeader.setForeground(new java.awt.Color(255, 255, 255));
        loaderHeader.setText("Medical Center ");
        jPanel1.add(loaderHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 350, 80));

        loaderProgress.setForeground(new java.awt.Color(255, 255, 255));
        loaderProgress.setBorder(null);
        loaderProgress.setBorderPainted(false);
        loaderProgress.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(loaderProgress, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 600, 10));

        loaderPercentage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loaderPercentage.setForeground(new java.awt.Color(255, 255, 255));
        loaderPercentage.setText("%");
        jPanel1.add(loaderPercentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Management System");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 220, 40));

        loaderBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgrounds/loader.png"))); // NOI18N
        jPanel1.add(loaderBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 340));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatIntelliJLaf.setup();

        Loader loaderObj = new Loader();
        loaderObj.setVisible(true);
        try {

            for (int i = 0; i <= 100; i += 2) {
                Thread.sleep(100);
                loaderObj.loaderProgress.setValue(i);
                loaderObj.loaderPercentage.setText(i + " %");
            }
        } catch (Exception e) {
        }
        new LogInForm().setVisible(true);
        loaderObj.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loaderBg;
    private javax.swing.JLabel loaderHeader;
    private javax.swing.JLabel loaderPercentage;
    private javax.swing.JProgressBar loaderProgress;
    // End of variables declaration//GEN-END:variables
}
