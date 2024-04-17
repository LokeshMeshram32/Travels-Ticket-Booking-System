/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author kamlesh
 */
public class NewUser extends javax.swing.JFrame {

    /**
     * Creates new form NewUser
     */
    public NewUser() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lastnameTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        firstnameTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        usernameTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordPF = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        emailTF = new javax.swing.JTextField();
        registerBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        signinBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("New User Register");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 41, 165, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("First Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 97, -1, -1));

        lastnameTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(lastnameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 94, 161, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Last Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 97, -1, -1));

        firstnameTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(firstnameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 94, 161, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Username");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 153, -1, -1));

        usernameTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(usernameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 161, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 153, -1, -1));

        passwordPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(passwordPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 150, 164, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Email Id");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 199, -1, -1));

        emailTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(emailTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 196, 336, -1));

        registerBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });
        getContentPane().add(registerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, -1, -1));

        resetBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(706, 196, -1, -1));

        signinBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        signinBtn.setText("Already have account ? Sign In");
        signinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinBtnActionPerformed(evt);
            }
        });
        getContentPane().add(signinBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 297, 329, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bus/management/cool-background (15).png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void infoMessage(String message, String tittle) {
        JOptionPane.showMessageDialog(null, message, tittle, JOptionPane.INFORMATION_MESSAGE);
    }

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:

        String firstname = firstnameTF.getText();
        String lastname = lastnameTF.getText();
        String username = usernameTF.getText();
        String password = passwordPF.getText();
        String email = emailTF.getText();

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "system", "LOkesh+93");
            Statement stat = con.createStatement();    
            String selectQuery = "select * from user_details where username='"+username+"' and password='"+password+"'";
            System.out.println(selectQuery);
           ResultSet rs=stat.executeQuery(selectQuery);
           System.out.println(rs.next());
           if(rs.next()==true)
           {
             infoMessage("Already Registered", "Welcome Bro !!");
           }
           else
           {
          String insertQuery = "insert into user_details values(user_details_seq.nextval,'" + firstname + "','" + lastname + "','" + username + "','" + password + "','" + email + "')";
           
          stat.executeUpdate(insertQuery);
           infoMessage("information is inserted", "Welcome Bro !!");
          dispose(); 
          UserLogin ln=new UserLogin();
          ln.setLocationRelativeTo(null);
          ln.setVisible(true);
               
           
           }
          

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }


    }//GEN-LAST:event_registerBtnActionPerformed

    private void signinBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinBtnActionPerformed
        // TODO add your handling code here:
          dispose();
        UserLogin ul = new UserLogin();
        ul.setLocationRelativeTo(null);
        ul.setVisible(true);
    }//GEN-LAST:event_signinBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetBtnActionPerformed

  
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
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        java.awt.EventQueue.invokeLater(() -> {
            new NewUser().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailTF;
    private javax.swing.JTextField firstnameTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField lastnameTF;
    private javax.swing.JPasswordField passwordPF;
    private javax.swing.JButton registerBtn;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton signinBtn;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}
