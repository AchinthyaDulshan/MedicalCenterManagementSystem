/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package logIn;


import com.formdev.flatlaf.FlatIntelliJLaf;


/**
 *
 * @author Achinthya Dulshan
 */
public class LogInForm extends javax.swing.JFrame {

    public LogInForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameLabel = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        btnClear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        btnLogIn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(0, 0, 0));
        usernameLabel.setText("Username :");
        getContentPane().add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 110, -1));

        txtUsername.setBackground(new java.awt.Color(255, 255, 255));
        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 340, -1));

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(0, 0, 0));
        passwordLabel.setText("Password :");
        getContentPane().add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 120, -1));

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 340, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 340, 10));

        btnClear.setBackground(new java.awt.Color(255, 204, 0));
        btnClear.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 200, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Medical Center");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 270, 50));

        jSeparator1.setForeground(new java.awt.Color(0, 153, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 340, 10));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Log In");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 160, 70));

        btnLogIn.setBackground(new java.awt.Color(0, 102, 51));
        btnLogIn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnLogIn.setForeground(new java.awt.Color(255, 255, 255));
        btnLogIn.setText("Log In");
        btnLogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 200, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 51));
        jLabel3.setText("Management System");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 204, 204));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 470, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 204, 204));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 470, 10));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgrounds/logIn.png"))); // NOI18N
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1000, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtUsername.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        
        //create user object & assign entered values
        User user = new User(txtUsername.getText(), txtPassword.getText());
        
        //create new user database object 
        UserDao userDao = new UserDao();
        
        //pass entered data for checking with database
        boolean status = userDao.checkUser(user);
        
        //if credentials are correct login form will be closed
        if (status) {
            this.dispose();
        }
    }//GEN-LAST:event_btnLogInActionPerformed

    public static void main(String args[]) {
        FlatIntelliJLaf.setup();
        //create loginform object and set it visible
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInForm().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnLogIn;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
