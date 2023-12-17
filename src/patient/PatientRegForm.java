/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package patient;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.toedter.calendar.JCalendar;
import static common.CommonFunctions.getMinDate;
import home.HomeForm;
import java.awt.Color;
import static java.awt.Color.GREEN;
import static java.awt.Color.green;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import javax.swing.JTextField;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import logIn.LogInForm;
import static validation.Validation.selectFieldValidation;
import static validation.Validation.txtAreaValidation;
import static validation.Validation.txtFieldValidation;
import static common.CommonFunctions.getSelectedBirthDate;

/**
 *
 * @author Achinthya Dulshan
 */
public class PatientRegForm extends javax.swing.JFrame {

    PatientDao patientDao;

    //define static variables for future refrence
    private static PatientRegForm updatingPatientForm;
    private static Patient updatingPatient;
    private static Patient patient;
    private static Patient newPatient= new Patient();

    //define validation borders
    public static Border invalidBorder = new LineBorder(Color.red, 2, true);
    public static Border validBorder = new LineBorder(Color.GREEN, 2, true);

    //default constructor
    public PatientRegForm() {

        initComponents();
        // init dao object
        patientDao = new PatientDao();

        //init patient object
//        newPatient ;

        // set update button invisible
        btnUpdate.setVisible(false);

        // try to set min,max date on date of birth date picker
        // max date --> Today
        // min date --> set by getMinDate()
        try {
            txtDateofBirth.setSelectableDateRange(getMinDate(), new java.util.Date());
        } catch (ParseException ex) {
            Logger.getLogger(PatientRegForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFirstName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        txtNIC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        selectGender = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtDateofBirth = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        selectBloodGroup = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtContact_1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnShowPatientDetails = new javax.swing.JButton();
        btnReturnToHome = new javax.swing.JButton();
        txtContact_2 = new javax.swing.JTextField();
        formHeading = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        headerPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        bgImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFirstName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        txtFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFirstNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 210, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("First Name  :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 100, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Last Name  :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 300, 100, -1));

        txtLastName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLastNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 300, 230, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Address  :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 80, -1));

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtAddress.setRows(5);
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtAddress);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 650, 60));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NIC  :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 50, -1));

        txtNIC.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNICKeyReleased(evt);
            }
        });
        getContentPane().add(txtNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, 210, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gender  :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 430, 80, -1));

        selectGender.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        selectGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender", "Male", "Female" }));
        selectGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectGenderActionPerformed(evt);
            }
        });
        getContentPane().add(selectGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 430, 210, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date of Birth  :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 480, 110, -1));

        txtDateofBirth.setBackground(new java.awt.Color(40, 40, 40));
        txtDateofBirth.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        getContentPane().add(txtDateofBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, 220, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Blood Group  :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 480, 110, -1));

        selectBloodGroup.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        selectBloodGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Blood Group", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        selectBloodGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBloodGroupActionPerformed(evt);
            }
        });
        getContentPane().add(selectBloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 480, 210, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contact No  :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 540, 100, -1));

        txtContact_1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtContact_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContact_1KeyReleased(evt);
            }
        });
        getContentPane().add(txtContact_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 530, 210, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contact No  :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 530, 100, -1));

        btnAdd.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/add.png"))); // NOI18N
        btnAdd.setText(" REGISTER");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 200, 50));

        btnUpdate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/update.png"))); // NOI18N
        btnUpdate.setText(" UPDATE");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 200, 50));

        btnShowPatientDetails.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnShowPatientDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/patient.png"))); // NOI18N
        btnShowPatientDetails.setText(" Show Patient Details");
        btnShowPatientDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnShowPatientDetailsMouseClicked(evt);
            }
        });
        getContentPane().add(btnShowPatientDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, 250, 50));

        btnReturnToHome.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnReturnToHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/home.png"))); // NOI18N
        btnReturnToHome.setText(" Return to Home");
        btnReturnToHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnToHomeMouseClicked(evt);
            }
        });
        getContentPane().add(btnReturnToHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, 250, 50));

        txtContact_2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtContact_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContact_2KeyReleased(evt);
            }
        });
        getContentPane().add(txtContact_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 530, 210, 30));

        formHeading.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        formHeading.setForeground(new java.awt.Color(255, 255, 255));
        formHeading.setText("Register Patient");
        getContentPane().add(formHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(204, 102, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 860, 10));

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

        bgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgrounds/patientRegister.png"))); // NOI18N
        bgImage.setText("jLabel19");
        getContentPane().add(bgImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    

    // when click on Show Patient Details button
    private void btnShowPatientDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowPatientDetailsMouseClicked
        new PatientDetailsForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnShowPatientDetailsMouseClicked

    // define method to btnAdd --> register patient
    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked

        // setAddress in patient
//        patient.setAddress(txtAddress.getText());
        // setDateOfBirth in patient
        newPatient.setDateOfBirth(getSelectedBirthDate(txtDateofBirth));

        /* when the txtContact_2(optional) field is empty it will store NULL in database, 
        in update this will be an error therefore it set to empty String*/
        if (txtContact_2.getText().equals("")) {
            newPatient.setContactNo_2("");
        }

        // checking form has empty fields
        String errors = checkErrors(newPatient);

        if (errors.equals("")) {

            // if it doesn't have empty field 
            // insert to database and give message
            patientDao.insertPatient(newPatient);
            JOptionPane.showMessageDialog(null, "Patient Registered Successfully.");

            // close form and open table
            new PatientDetailsForm().setVisible(true);
            this.dispose();

        } else {
            // if it have empty fields indicate using message
            JOptionPane.showMessageDialog(null, "You have following errors.\n" + errors);
        }

    }//GEN-LAST:event_btnAddMouseClicked

    private void btnReturnToHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnToHomeMouseClicked

        //show Home page and close this one
        new HomeForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReturnToHomeMouseClicked

   

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked

        // get patientId to future refrences
//        patient.setPatientId(updatingPatient.getPatientId());

        //set values to object
//        newPatient.setAddress(txtAddress.getText());
        newPatient.setDateOfBirth(getSelectedBirthDate(txtDateofBirth));

        if (txtContact_2.getText().equals("")) {
            newPatient.setContactNo_2("");
        }
//        System.out.println("in upt  " + patient.getFirstName() + " " + patient.getLastName());

        // check what values were updated
        String updates = checkUpdates(newPatient);

        // check whether reqiured fields have empty values
        String errors = checkErrors(newPatient);

        if (errors.equals("")) {

            // if required fields are filled
//            System.out.println("in upt normal " + patient.getFirstName() + " " + patient.getLastName());
//            System.out.println("in upt updating " + updatingPatient.getFirstName() + " " + updatingPatient.getLastName());
            if (updates.equals("")) {

                // if it doesn't update any value --> show message
                JOptionPane.showMessageDialog(this, "No updates have been done.");

            } else {

                // if it update any value --> show message with updated fields
                int result = JOptionPane.showConfirmDialog(this, updates);

                // Check the user's choice
                if (result == JOptionPane.YES_OPTION) {

                    //perform update & load patient table
                    patientDao.updatePatient(newPatient);
                    new PatientDetailsForm().setVisible(true);
                    this.dispose();

                } else if (result == JOptionPane.NO_OPTION) {

                } else if (result == JOptionPane.CANCEL_OPTION) {

                    //reload Patient details form and abort action
                    new PatientDetailsForm().setVisible(true);
                    this.dispose();

                } else if (result == JOptionPane.CLOSED_OPTION) {

                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "You have following errors.\n" + errors);
        }


    }//GEN-LAST:event_btnUpdateMouseClicked

    // first name validation
    private void txtFirstNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFirstNameKeyReleased
        String pattern = "^([A-Z][a-z]{3,25})$";
        txtFieldValidation(txtFirstName, pattern, newPatient, "setFirstName");
    }//GEN-LAST:event_txtFirstNameKeyReleased

    // last name validation
    private void txtLastNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameKeyReleased
        String pattern = "^([A-Z][a-z]{3,25})$";
        txtFieldValidation(txtLastName, pattern, newPatient, "setLastName");
    }//GEN-LAST:event_txtLastNameKeyReleased

    // nic validation
    private void txtNICKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNICKeyReleased
        String pattern = "^([12][09][01789][0-9]{9})|([789][0-9]{8}[V|v])$";
        txtFieldValidation(txtNIC, pattern, newPatient, "setNIC");
    }//GEN-LAST:event_txtNICKeyReleased

    // contact_no_1 validation 
    private void txtContact_1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContact_1KeyReleased
        String pattern = "^([0][7][01245678][0-9]{7})|([0][012345689][0-9]{8})$";
        txtFieldValidation(txtContact_1, pattern, newPatient, "setContactNo_1");
    }//GEN-LAST:event_txtContact_1KeyReleased

    // contact_no_2 validation 
    private void txtContact_2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContact_2KeyReleased
        String pattern = "^([0][7][01245678][0-9]{7})|([0][012345689][0-9]{8})$";
        txtFieldValidation(txtContact_2, pattern, newPatient, "setContactNo_2");
    }//GEN-LAST:event_txtContact_2KeyReleased

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
        String pattern = "^(.*)$";
        txtAreaValidation(txtAddress, pattern, newPatient, "setAddress");
    }//GEN-LAST:event_txtAddressKeyReleased

    // gender validation
    private void selectGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectGenderActionPerformed
        try {
            selectFieldValidation(selectGender, "Select Gender", newPatient, "setGender");

//            System.out.println("Gender-- "+patient.getGender());
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(PatientRegForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(PatientRegForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(PatientRegForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(PatientRegForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_selectGenderActionPerformed

    // blodgroup validation
    private void selectBloodGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBloodGroupActionPerformed
        try {
            selectFieldValidation(selectBloodGroup, "Select Blood Group", newPatient, "setBloodGroup");
//            System.out.println("Blood-- "+patient.getBloodGroup());
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(PatientRegForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(PatientRegForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(PatientRegForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(PatientRegForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_selectBloodGroupActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        String pattern = "^([A-Z][a-z]{3,25})$";
        txtFieldValidation(txtFirstName, pattern, newPatient, "setFirstName");
        System.out.println("Action --- ");
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        ImageIcon icon = new ImageIcon("D:\\Projects\\COST Project\\MedicalCenterManagementSystem\\src\\images\\icons\\warning res.png");
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

    
    

    

    // define method to track updates
    private String checkUpdates(Patient existingPatient) {

        String updates = "";

        if (!updatingPatient.getFirstName().equals(existingPatient.getFirstName())) {
            updates += "First name Changed. \n";
        }
        if (!updatingPatient.getLastName().equals(existingPatient.getLastName())) {
            updates += "Last name Changed. \n";
        }
        if (!updatingPatient.getAddress().equals(existingPatient.getAddress())) {
            updates += "Address Changed. \n";
        }
        if (!updatingPatient.getNIC().equals(existingPatient.getNIC())) {
            updates += "NIC Changed. \n";
        }
        if (!updatingPatient.getDateOfBirth().equals(existingPatient.getDateOfBirth())) {
            updates += "Date of Birth Changed. \n";
        }
        if (!updatingPatient.getGender().equals(existingPatient.getGender())) {
            updates += "Gender Changed. \n";
        }
        if (!updatingPatient.getBloodGroup().equals(existingPatient.getBloodGroup())) {
            updates += "Blood group Changed. \n";
        }
        if (!updatingPatient.getContactNo_1().equals(existingPatient.getContactNo_1())) {
            updates += "Contact No:1 Changed. \n";
        }
        if (!updatingPatient.getContactNo_2().equals(existingPatient.getContactNo_2())) {
            updates += "Contact No:2 Changed. \n";
        }

        return updates;
    }

    // this method also a validator for mobile no
    private void validateMobileNo(java.awt.event.KeyEvent evt, JTextField textField) {

//        String contactNoLength = txtContact_1.getText().length();
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }

    // define method for check empty values in required fields
    private String checkErrors(Patient patient) {

        String errors = "";

        if (patient.getFirstName() == null) {
            errors += "First name not entered.\n";
        }
        if (patient.getLastName() == null) {
            errors += "Last name not entered.\n";
        }
        if (patient.getAddress() == null || patient.getAddress().equals("")) {
            errors += "Address not entered.\n";
        }
        if (patient.getNIC() == null) {
            errors += "NIC not entered.\n";
        }
        if (patient.getGender() == null) {
            errors += "Gender not selected.\n";
        }
        if (patient.getDateOfBirth() == null) {
            errors += "Date of birth not selected.\n";
        }
        if (patient.getBloodGroup() == null) {
            errors += "Blood group not selected..\n";
        }
        if (patient.getContactNo_1() == null) {
            errors += "Contact No:1 not entered.\n";
        }

        return errors;
    }

    // define method for update patient details
    public void updatePatientDetails(Patient selectedPatient) throws ParseException {

//        updatingPatient = selectedPatient;

//        newPatient = new Patient(selectedPatient);
//String patientId, String firstName, String lastName, String address, String NIC, String dateOfBirth, String gender, String bloodGroup, String contactNo_1, String contactNo_2
        newPatient = new Patient(selectedPatient.getPatientId(), selectedPatient.getFirstName(), selectedPatient.getLastName(), selectedPatient.getAddress(), selectedPatient.getNIC(), selectedPatient.getDateOfBirth(), selectedPatient.getGender(),selectedPatient.getBloodGroup(),selectedPatient.getContactNo_1(),selectedPatient.getContactNo_2());
        updatingPatient = new Patient(selectedPatient.getPatientId(), selectedPatient.getFirstName(), selectedPatient.getLastName(), selectedPatient.getAddress(), selectedPatient.getNIC(), selectedPatient.getDateOfBirth(), selectedPatient.getGender(),selectedPatient.getBloodGroup(),selectedPatient.getContactNo_1(),selectedPatient.getContactNo_2());

        patient = selectedPatient;
        System.out.println("ss" + patient.getFirstName());

        if (updatingPatientForm == null) {
            updatingPatientForm = new PatientRegForm();
        }

        System.out.println("name: " + selectedPatient.getFirstName() + " " + selectedPatient.getLastName());

        updatingPatientForm.formHeading.setText("Update Patient Details");

        updatingPatientForm.txtFirstName.setText(selectedPatient.getFirstName());
        updatingPatientForm.txtLastName.setText(selectedPatient.getLastName());
        updatingPatientForm.txtAddress.setText(selectedPatient.getAddress());
        updatingPatientForm.txtNIC.setText(selectedPatient.getNIC());
        updatingPatientForm.selectGender.setSelectedItem(selectedPatient.getGender());

        updatingPatientForm.txtDateofBirth.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(selectedPatient.getDateOfBirth()));
        updatingPatientForm.selectBloodGroup.setSelectedItem(selectedPatient.getBloodGroup());
        updatingPatientForm.txtContact_1.setText(selectedPatient.getContactNo_1());
        updatingPatientForm.txtContact_2.setText(selectedPatient.getContactNo_2());

        updatingPatientForm.btnUpdate.setVisible(true);
        updatingPatientForm.btnAdd.setVisible(false);

        updatingPatientForm.setVisible(true);

    }

    // main method
    public static void main(String args[]) {

        FlatIntelliJLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientRegForm().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgImage;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnReturnToHome;
    private javax.swing.JButton btnShowPatientDetails;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel formHeading;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> selectBloodGroup;
    private javax.swing.JComboBox<String> selectGender;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtContact_1;
    private javax.swing.JTextField txtContact_2;
    private com.toedter.calendar.JDateChooser txtDateofBirth;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtNIC;
    // End of variables declaration//GEN-END:variables
}
