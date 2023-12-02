/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package logIn;

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

        imagePanel = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        mainLogInPanel = new javax.swing.JPanel();
        logInMainText = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        btnLogIn = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logInImg_3.png"))); // NOI18N
        imagePanel.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 500));

        getContentPane().add(imagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 500));

        mainLogInPanel.setBackground(new java.awt.Color(25, 123, 48));
        mainLogInPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logInMainText.setBackground(new java.awt.Color(25, 123, 48));
        logInMainText.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        logInMainText.setForeground(new java.awt.Color(255, 255, 255));
        logInMainText.setText("Log In");
        mainLogInPanel.add(logInMainText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 120, -1));

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Username :");
        mainLogInPanel.add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 110, -1));

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password :");
        mainLogInPanel.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 120, -1));

        btnLogIn.setBackground(new java.awt.Color(0, 102, 51));
        btnLogIn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogIn.setForeground(new java.awt.Color(255, 255, 255));
        btnLogIn.setText("Log In");
        btnLogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogInMouseClicked(evt);
            }
        });
        mainLogInPanel.add(btnLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 200, 40));

        btnClear.setBackground(new java.awt.Color(255, 204, 0));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        mainLogInPanel.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 200, 40));

        txtUsername.setBackground(new java.awt.Color(255, 255, 255));
        txtUsername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(0, 0, 0));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        mainLogInPanel.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 190, -1));

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 0, 0));
        mainLogInPanel.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 190, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("I haven't accout, Please register here");
        mainLogInPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        getContentPane().add(mainLogInPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 400, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearActionPerformed

    //define method -> when Log In button was clicked
    private void btnLogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogInMouseClicked

        //create user object & assign entered values
        User user = new User(txtUsername.getText(), txtPassword.getText());
        
        //create new user database object 
        UserDao userDao = new UserDao();
        
        //pass entered data for checking with database
        boolean status = userDao.checkUser(user);
        
        //if credentials are correct login form will be closed
        if (status) {
            windowClose(this);
        }
    }//GEN-LAST:event_btnLogInMouseClicked

    //clear text field when reset button was clicked
    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        txtUsername.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnClearMouseClicked

    //create method to close loginForm
    private static void windowClose(LogInForm obj) {
        obj.dispose();
    }

    public static void main(String args[]) {
        //create loginform object and set it visible
        LogInForm logInObj = new LogInForm();
        logInObj.setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnLogIn;
    private javax.swing.JLabel image;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logInMainText;
    private javax.swing.JPanel mainLogInPanel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
