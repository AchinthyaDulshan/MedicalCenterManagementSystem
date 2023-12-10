/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package patient;

import com.toedter.calendar.JCalendar;
import home.HomeForm;
import java.awt.Color;
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
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

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

    //define validation borders
    public static Border invalidBorder = new LineBorder(Color.red, 2, true);
    public static Border validBorder = new LineBorder(Color.GREEN, 2, true);

    //default constructor
    public PatientRegForm() {

        initComponents();
        // init dao object
        patientDao = new PatientDao();
        // init patient object
        patient = new Patient();
        
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

        header = new javax.swing.JPanel();
        headerText = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        footerText = new javax.swing.JLabel();
        mainDataPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtNIC = new javax.swing.JTextField();
        selectGender = new javax.swing.JComboBox<>();
        selectBloodGroup = new javax.swing.JComboBox<>();
        txtContact_1 = new javax.swing.JTextField();
        txtContact_2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        formHeading = new javax.swing.JLabel();
        txtDateofBirth = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        navPanel = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnShowPatientDetails = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnReturnToHome = new javax.swing.JButton();

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
        jLabel1.setText("First Name  :");
        mainDataPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 89, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Last Name  :");
        mainDataPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Address  :");
        mainDataPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NIC  :");
        mainDataPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gender  :");
        mainDataPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date of Birth  :");
        mainDataPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contact No  :");
        mainDataPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contact No  :");
        mainDataPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Blood Group  :");
        mainDataPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, -1, -1));

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
        mainDataPanel.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 210, 30));

        txtLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLastNameKeyReleased(evt);
            }
        });
        mainDataPanel.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 210, 30));

        txtNIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNICKeyReleased(evt);
            }
        });
        mainDataPanel.add(txtNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 210, 30));

        selectGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender", "Male", "Female" }));
        selectGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectGenderActionPerformed(evt);
            }
        });
        mainDataPanel.add(selectGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 210, 30));

        selectBloodGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Blood Group", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        selectBloodGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBloodGroupActionPerformed(evt);
            }
        });
        mainDataPanel.add(selectBloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 210, 30));

        txtContact_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContact_1KeyReleased(evt);
            }
        });
        mainDataPanel.add(txtContact_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 210, 30));

        txtContact_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContact_2KeyReleased(evt);
            }
        });
        mainDataPanel.add(txtContact_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 210, 30));

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtAddress);

        mainDataPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 550, 60));

        formHeading.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        formHeading.setForeground(new java.awt.Color(255, 255, 255));
        formHeading.setText("Register Patient");
        mainDataPanel.add(formHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        txtDateofBirth.setBackground(new java.awt.Color(40, 40, 40));
        mainDataPanel.add(txtDateofBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 210, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("*  Required");
        mainDataPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("*");
        mainDataPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 10, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("*");
        mainDataPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 10, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("*");
        mainDataPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 10, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("*");
        mainDataPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 10, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("*");
        mainDataPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 10, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("*");
        mainDataPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 10, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("*");
        mainDataPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 10, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("*");
        mainDataPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 10, -1));

        getContentPane().add(mainDataPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 720, 530));

        navPanel.setBackground(new java.awt.Color(78, 80, 82));
        navPanel.setForeground(new java.awt.Color(255, 255, 255));
        navPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdd.setBackground(new java.awt.Color(0, 255, 51));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("REGISTER");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        navPanel.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 200, 40));

        btnShowPatientDetails.setBackground(new java.awt.Color(70, 73, 75));
        btnShowPatientDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnShowPatientDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnShowPatientDetails.setText("Show Patient Details");
        btnShowPatientDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnShowPatientDetailsMouseClicked(evt);
            }
        });
        navPanel.add(btnShowPatientDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 250, 40));

        btnUpdate.setBackground(new java.awt.Color(102, 102, 255));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });
        navPanel.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 200, 40));

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

        getContentPane().add(navPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 280, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // define method to get minimum date as a Date
    private Date getMinDate() throws ParseException {
        String strMinDate = "31/12/1998";
        Date minDate = new SimpleDateFormat("dd/MM/yyyy").parse(strMinDate);
        return minDate;
    }

    // when click on Show Patient Details button
    private void btnShowPatientDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowPatientDetailsMouseClicked
        new PatientDetailsForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnShowPatientDetailsMouseClicked

    // define method to btnAdd --> register patient
    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked

        // setAddress in patient
        patient.setAddress(txtAddress.getText());
        // setDateOfBirth in patient
        patient.setDateOfBirth(getSelectedBirthDate());

        /* when the txtContact_2(optional) field is empty it will store NULL in database, 
        in update this will be an error therefore it set to empty String*/
        
        if (txtContact_2.getText().equals("")) {
            patient.setContactNo_2("");
        }
        
        // checking form has empty fields
        String errors = checkErrors();

        if (errors.equals("")) {

            // if it doesn't have empty field 
            // insert to database and give message
            patientDao.insertPatient(patient);
            JOptionPane.showMessageDialog(this, "Patient Registered Successfully.");

            // close form and open table
            new PatientDetailsForm().setVisible(true);
            this.dispose();

        } else {
            // if it have empty fields indicate using message
            JOptionPane.showMessageDialog(this, "You have following errors.\n" + errors);
        }

    }//GEN-LAST:event_btnAddMouseClicked

    private void btnReturnToHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnToHomeMouseClicked

        //show Home page and close this one
        new HomeForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReturnToHomeMouseClicked

    //format entered date 
    private String getSelectedBirthDate() {
        Date birthDate = txtDateofBirth.getDate();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String strBirthDate = formatter.format(birthDate);
        return strBirthDate;
    }
    
    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked

        // get patientId to future refrences
        patient.setPatientId(updatingPatient.getPatientId());

        //set values to object
        patient.setAddress(txtAddress.getText());
        patient.setDateOfBirth(getSelectedBirthDate());

        // check what values were updated
        String updates = checkUpdates(patient);


        // check whether reqiured fields have empty values
      String errors = checkErrors();

      if (errors.equals("")) {

            // if required fields are filled
            
            if (updates.equals("")) {
                
                // if it doesn't update any value --> show message
                JOptionPane.showMessageDialog(this, "No updates have been done.");

            } else {

                // if it update any value --> show message with updated fields
                int result = JOptionPane.showConfirmDialog(this, updates);

                // Check the user's choice
                if (result == JOptionPane.YES_OPTION) {

                    //perform update & load patient table
                    patientDao.updatePatient(patient);
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
        txtFieldValidation(txtFirstName, pattern, patient, "setFirstName");
    }//GEN-LAST:event_txtFirstNameKeyReleased

    // last name validation
    private void txtLastNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameKeyReleased
        String pattern = "^([A-Z][a-z]{3,25})$";
        txtFieldValidation(txtLastName, pattern, patient, "setLastName");
    }//GEN-LAST:event_txtLastNameKeyReleased

    // nic validation
    private void txtNICKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNICKeyReleased
        String pattern = "^([12][09][01789][0-9]{9})|([789][0-9]{8}[V|v])$";
        txtFieldValidation(txtNIC, pattern, patient, "setNIC");
    }//GEN-LAST:event_txtNICKeyReleased

    // contact_no_1 validation 
    private void txtContact_1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContact_1KeyReleased
        String pattern = "^([0][7][01245678][0-9]{7})|([0][012345689][0-9]{8})$";
        txtFieldValidation(txtContact_1, pattern, patient, "setContactNo_1");
    }//GEN-LAST:event_txtContact_1KeyReleased

    // contact_no_2 validation 
    private void txtContact_2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContact_2KeyReleased
        String pattern = "^([0][7][01245678][0-9]{7})|([0][012345689][0-9]{8})$";
        txtFieldValidation(txtContact_2, pattern, patient, "setContactNo_2");
    }//GEN-LAST:event_txtContact_2KeyReleased

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
//        String pattern = "^([0][7][01245678][0-9]{7})|([0][012345689][0-9]{8})$";
//        txtFieldValidation(txtAddress, pattern, patient,"setAddress");
    }//GEN-LAST:event_txtAddressKeyReleased

    // gender validation
    private void selectGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectGenderActionPerformed
        try {
            selectFieldValidation(selectGender, "Select Gender", patient, "setGender");

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
            selectFieldValidation(selectBloodGroup, "Select Blood Group", patient, "setBloodGroup");
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
        txtFieldValidation(txtFirstName, pattern, patient, "setFirstName");
        System.out.println("Action --- ");
    }//GEN-LAST:event_txtFirstNameActionPerformed

    // define method for select field validation
    public static void selectFieldValidation(JComboBox comboBox, String defaultSelectedOption, Object object, String method) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String selectedOption = comboBox.getSelectedItem().toString();

        if (selectedOption.equals(defaultSelectedOption)) {
            comboBox.setBorder(invalidBorder);
            // Get the method with the specified name
            Method executingMethod = object.getClass().getDeclaredMethod(method, String.class);

            // Invoke the method on the instance
            executingMethod.invoke(object, null);
        } else {

            comboBox.setBorder(validBorder);

            // Get the method with the specified name
            Method executingMethod = object.getClass().getDeclaredMethod(method, String.class);

            // Invoke the method on the instance
            executingMethod.invoke(object, selectedOption);

        }
    }

    // define method for text field validation
    public static void txtFieldValidation(JTextField textField, String matchingPattern, Object object, String method) {
        Pattern pattern;
        Matcher isMatching;

        pattern = Pattern.compile(matchingPattern);
        isMatching = pattern.matcher(textField.getText());

        if (isMatching.matches()) {
            textField.setBorder(validBorder);
            try {
                // Method name to be invoked
                String methodName = method;

                // Get the method with the specified name
                Method executingMethod = object.getClass().getDeclaredMethod(methodName, String.class);

                // Invoke the method on the instance
                executingMethod.invoke(object, textField.getText());

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            textField.setBorder(invalidBorder);
        }

    }

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
    private String checkErrors() {

        String errors = "";

        if (patient.getFirstName() == null) {
            errors += "First name not entered.\n";
        }
        if (patient.getLastName() == null) {
            errors += "Last name not entered.\n";
        }
        if (patient.getAddress() == null) {
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

        updatingPatient = new Patient();
        updatingPatient = selectedPatient;
        
        patient = selectedPatient;

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

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PatientRegForm().setVisible(true);
//            }
//        });
        new PatientRegForm().setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnReturnToHome;
    private javax.swing.JButton btnShowPatientDetails;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel footer;
    private javax.swing.JLabel footerText;
    private javax.swing.JLabel formHeading;
    private javax.swing.JPanel header;
    private javax.swing.JLabel headerText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainDataPanel;
    private javax.swing.JPanel navPanel;
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
