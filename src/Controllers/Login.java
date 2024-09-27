
package Controllers;


import jdk.nashorn.internal.scripts.JD;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Login extends javax.swing.JFrame {

    private static String[] domainValues = {"eventsdev.adc.coop","events.adc.coop"};
    public static JTextField jPortField;
    public static JComboBox<String> ipComboBox;
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
        JPanel left = new JPanel();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel2 = new JLabel();
        ipComboBox = new JComboBox<>(domainValues);
        JLabel jLabel3 = new JLabel();
        jPortField = new JTextField();
        JButton jButton1 = new JButton();
        JLabel jLabel4 = new JLabel();
        JButton jButton2 = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RFID CVENT");
        setResizable(false);
        setPreferredSize(new java.awt.Dimension(850, 500));

        java.net.URL iconURL = Login.class.getResource("/Icon/NECO_logo.png");
        if (iconURL != null) {
            ImageIcon icon = new ImageIcon(iconURL);
            setIconImage(icon.getImage());
        } else {
            System.err.println("Icon image not found!");
        }

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 500));
        jPanel1.setLayout(null);

        right.setBackground(new java.awt.Color(0, 102, 102));
        right.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel5.setIcon(new ImageIcon(Objects.requireNonNull(Login.class.getResource("/Icon/ADC_bg1.png"))));
        jLabel6.setFont(new java.awt.Font("Showcased Gothic", Font.BOLD, 24));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("   RFID CVENT");

        jLabel7.setFont(new java.awt.Font("Segue UI Light", Font.PLAIN, 14));
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("copyright © CVENT All rights reserved");

        javax.swing.GroupLayout rightLayout = new javax.swing.GroupLayout(right);
        right.setLayout(rightLayout);
        rightLayout.setHorizontalGroup(
                rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightLayout.createSequentialGroup()
                                .addGap(0, 81, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(40, 40, 40))
                        .addGroup(rightLayout.createSequentialGroup()
                                .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(rightLayout.createSequentialGroup()
                                                .addGap(103, 103, 103)
                                                .addComponent(jLabel6))
                                        .addGroup(rightLayout.createSequentialGroup()
                                                .addComponent(jLabel5)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rightLayout.setVerticalGroup(
                rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(rightLayout.createSequentialGroup()
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

        jLabel1.setFont(new java.awt.Font("Segue UI", Font.BOLD, 36));
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("192.168.1.88");

        jLabel2.setFont(new java.awt.Font("Segue UI", Font.PLAIN, 16));
        jLabel2.setText("IP Address");

        ipComboBox.setFont(new java.awt.Font("Segue UI", Font.PLAIN, 16));

        jLabel3.setFont(new java.awt.Font("Segue UI", Font.PLAIN, 16));
        jLabel3.setText("Port");

        jPortField.setFont(new java.awt.Font("Segue UI", Font.PLAIN, 16));
        jPortField.setText("444");
        jPortField.setEditable(false);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Segue UI", Font.PLAIN, 16));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Connect");

        ipComboBox.addActionListener(e -> updatePortField(ipComboBox, jPortField));

        jLabel4.setText("I don't have an account");

        jButton2.setFont(new java.awt.Font("Segue UI", Font.PLAIN, 14));
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Sign Up");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        javax.swing.GroupLayout leftLayout = new javax.swing.GroupLayout(left);
        left.setLayout(leftLayout);
        leftLayout.setHorizontalGroup(
                leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(leftLayout.createSequentialGroup()
                                .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(leftLayout.createSequentialGroup()
                                                .addGap(138, 138, 138)
                                                .addComponent(jLabel1))
                                        .addGroup(leftLayout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel2)
                                                        .addComponent(ipComboBox, 0, 343, Short.MAX_VALUE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jPortField)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(27, Short.MAX_VALUE))
        );
        leftLayout.setVerticalGroup(
                leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(leftLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel1)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ipComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPortField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(77, Short.MAX_VALUE))
        );

        jPanel1.add(left);
        left.setBounds(400, 0, 450, 500);

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



    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.out.println("Button clicked connect");
        RFID_Starter RFIDStarterFrame = new RFID_Starter();
        RFIDStarterFrame.setVisible(true);
        RFIDStarterFrame.pack();
        RFIDStarterFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void updatePortField(JComboBox<String> comboBox, JTextField portField) {
        System.out.println("combo box clicked");
        String selectedDomain = (String) comboBox.getSelectedItem();
        System.out.println(selectedDomain);
        if ("eventsdev.adc.coop".equals(selectedDomain)) {
            portField.setText("444");
        } else {
            portField.setText("443");
        }
    }
    // End of variables declaration//GEN-END:variables
}
