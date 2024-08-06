
package Controllers;


import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Login extends javax.swing.JFrame {


    public Login() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel jPanel1 = new JPanel();
        JPanel right = new JPanel();
        JLabel jLabel5 = new JLabel();
        JLabel jLabel6 = new JLabel();
        JLabel jLabel7 = new JLabel();
        // Variables declaration - do not modify//GEN-BEGIN:variables
        JPanel left = new JPanel();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel2 = new JLabel();
        JTextField ipTextField = new JTextField();
        JLabel jLabel3 = new JLabel();
        JTextField jPortField = new JTextField();
        JButton jButton1 = new JButton();
        JLabel jLabel4 = new JLabel();
        JButton jButton2 = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RFID CVENT");
        setResizable(false);
        setPreferredSize(new java.awt.Dimension(800, 500));

        java.net.URL iconURL = Login.class.getResource("/Icon/NECO_logo.png");
        if (iconURL != null) {
            ImageIcon icon = new ImageIcon(iconURL);
            setIconImage(icon.getImage());
        } else {
            System.err.println("Icon image not found!");
        }

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        right.setBackground(new java.awt.Color(0, 102, 102));
        right.setPreferredSize(new java.awt.Dimension(400, 500));

       // jLabel5.setIcon(new ImageIcon(Login.class.getResource("/Icon/logo.png"))); // NOI18N
        jLabel5.setIcon(new ImageIcon(Objects.requireNonNull(Login.class.getResource("/Icon/ADC_bg1.png"))));
        jLabel6.setFont(new java.awt.Font("Showcased Gothic", Font.BOLD, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("   RFID CVENT");

        jLabel7.setFont(new java.awt.Font("Segue UI Light", Font.PLAIN, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("copyright © CVENT All rights reserved");

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(right);
        right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
                RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                                .addGap(0, 81, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(40, 40, 40))
                        .addGroup(RightLayout.createSequentialGroup()
                                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(RightLayout.createSequentialGroup()
                                                .addGap(103, 103, 103)
                                                .addComponent(jLabel6))
                                        .addGroup(RightLayout.createSequentialGroup()
                                               // .addGap(145, 145, 145)
                                                .addComponent(jLabel5)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
                RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(RightLayout.createSequentialGroup()
                                //.addGap(136, 136, 136)
                                .addComponent(jLabel5)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(78, 78, 78))
        );

        jPanel1.add(right);
        right.setBounds(0, 0, 400, 500);

        left.setBackground(new java.awt.Color(255, 255, 255));
        left.setMinimumSize(new java.awt.Dimension(400, 500));

        jLabel1.setFont(new java.awt.Font("Segue UI", Font.BOLD, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("192.168.1.88");

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segue UI", Font.PLAIN, 16)); // NOI18N
        jLabel2.setText("IP Address");

        ipTextField.setFont(new java.awt.Font("Segue UI", Font.PLAIN, 16)); // NOI18N
        // ipTextField.setForeground(new java.awt.Color(102, 102, 102));
        ipTextField.setText("192.168.1.88");
        ipTextField.setEditable(false);
        //jTextField1.setEnabled(false);

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segue UI", Font.PLAIN, 16)); // NOI18N
        jLabel3.setText("Port");

        jPortField.setText("443");
        jPortField.setFont(new java.awt.Font("Segue UI", Font.PLAIN, 16));
        jPortField.setEditable(false);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Segue UI", Font.PLAIN, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Connect");
        jButton1.addActionListener(this::jButton2ActionPerformed);

        jLabel4.setText("I don't have an account");

        jButton2.setFont(new java.awt.Font("Segue UI", Font.PLAIN, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Sign Up");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(left);
        left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
                LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LeftLayout.createSequentialGroup()
                                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(LeftLayout.createSequentialGroup()
                                                .addGap(138, 138, 138)
                                                .addComponent(jLabel1))
                                        .addGroup(LeftLayout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jLabel2)
                                                                .addComponent(ipTextField)
                                                                .addComponent(jLabel3)
                                                                .addComponent(jPortField, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(LeftLayout.createSequentialGroup()

                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        ))))
                                .addContainerGap(27, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
                LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LeftLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel1)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ipTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPortField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                                )
                                .addContainerGap(77, Short.MAX_VALUE))
        );

        jPanel1.add(left);
        left.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 149, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("LOGIN");

        pack();
    }// </editor-fold>//GEN-END:initComponents



    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        RFID_Starter RFIDStarterFrame = new RFID_Starter();
        RFIDStarterFrame.setVisible(true);
        RFIDStarterFrame.pack();
        RFIDStarterFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // End of variables declaration//GEN-END:variables
}
