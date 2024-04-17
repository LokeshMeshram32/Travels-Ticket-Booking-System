/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.management;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


public class AddBusDetails extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddBusDetails
     */
    public AddBusDetails() {
        initComponents();
          departDateDP.setDateFormatString("yyyy/MM/dd");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bus_noTF = new javax.swing.JTextField();
        bus_sourceTF = new javax.swing.JTextField();
        bus_destTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        deratTimeTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        seatTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        moveCB = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        priceTF = new javax.swing.JTextField();
        departDateDP = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bus/management/cool-background (12).png"))); // NOI18N

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Bus Details");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Add Bus Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 137, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Bus No");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 87, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Source");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 133, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Destination");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 133, -1, -1));

        bus_noTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(bus_noTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 84, 188, -1));

        bus_sourceTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(bus_sourceTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 130, 188, -1));

        bus_destTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(bus_destTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 130, 188, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 310, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Reset");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 182, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Time");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 182, -1, -1));

        deratTimeTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(deratTimeTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 176, 188, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Seat");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 230, -1, -1));

        seatTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(seatTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 227, 188, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Movement");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 87, -1, -1));

        moveCB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        moveCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UP", "DOWN" }));
        getContentPane().add(moveCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 84, 188, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Price");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 230, -1, -1));

        priceTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(priceTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 227, 188, -1));

        departDateDP.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(departDateDP, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 180, 30));

        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bus/management/cool-background (12).png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -20, 870, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void infoMessage(String message, String tittle) {
        JOptionPane.showMessageDialog(null, message, tittle, JOptionPane.INFORMATION_MESSAGE);
    }
 public void clearFieldValue()
 {
     bus_noTF.setText("");
     bus_sourceTF.setText("");
     bus_destTF.setText("");
 }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          
       String busnoD=bus_noTF.getText();
       String busMoveD=(String)moveCB.getSelectedItem();
       String bussourceD=bus_sourceTF.getText();
       String busdestD=bus_destTF.getText();
              java.util.Date departDateD= departDateDP.getDate();
              java.sql.Date sqlDate = new java.sql.Date(departDateD.getTime());
             SimpleDateFormat oDateFormat = new SimpleDateFormat("yyyy/MM/dd");
             String departDate = oDateFormat.format(sqlDate);
//         String departDate = departDateDP.getDate();
       String departTimeD=deratTimeTF.getText();
       String priceD=priceTF.getText();
       String seatD=seatTF.getText();
        
        try
        {
        
             Class.forName("oracle.jdbc.driver.OracleDriver");
            String databaseURL = "jdbc:oracle:thin:@localhost:1521:ORCL";
            Connection con = DriverManager.getConnection(databaseURL, "system", "LOkesh+93");
            Statement stat = con.createStatement();    
            String selectQuery = "select * from bus_details where bus_no='"+busnoD+"'";
            
            ResultSet rs=stat.executeQuery(selectQuery);
         
           if(rs.next()==true)
           {
             infoMessage("Already Bus Details is Added", "Create Fresh Entry !!");
             clearFieldValue();
           }
           else
           {
          String insertQuery = "insert into bus_details values(bus_details_seq.nextval,'" + busnoD + "','" + busMoveD + "','" + bussourceD + "','" + busdestD + "','"+ departDate +"','" + departTimeD + "','" + priceD + "','" + seatD + "')";
           
          stat.executeUpdate(insertQuery);
          infoMessage("Bus Details is Added", "Great work !!");
          clearFieldValue();
            
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void departDateDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departDateDPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departDateDPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bus_destTF;
    private javax.swing.JTextField bus_noTF;
    private javax.swing.JTextField bus_sourceTF;
    private com.toedter.calendar.JDateChooser departDateDP;
    private javax.swing.JTextField deratTimeTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> moveCB;
    private javax.swing.JTextField priceTF;
    private javax.swing.JTextField seatTF;
    // End of variables declaration//GEN-END:variables
}