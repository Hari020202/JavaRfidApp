package Controllers;

import WebServiceCall.CventUtils;
import WebServiceCall.Utils;

import javax.swing.*;
import org.json.JSONObject;

public class RFID_Starter extends javax.swing.JFrame {
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loginButton;
    private javax.swing.JButton startButton;
    private javax.swing.JButton stopButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static String token = "";
    public static int isBsicAuth = 0;
    public RFID_Starter() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        //jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RFID Configuration");
        setPreferredSize(new java.awt.Dimension(700, 400));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 400));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        java.net.URL iconURL = Login.class.getResource("/Icon/NECO_logo.png");
        if (iconURL != null) {
            ImageIcon icon = new ImageIcon(iconURL);
            setIconImage(icon.getImage());
        } else {
            System.err.println("Icon image not found!");
        }

        // Make sure the image path is correct
        jLabel1.setIcon(new ImageIcon(RFID_Starter.class.getResource("/Icon/logo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RFID Starter API");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("copyright © company name All rights reserved");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(137, 137, 137)
                                                .addComponent(jLabel1))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(72, 72, 72)
                                                .addComponent(jLabel3))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(104, 104, 104)
                                                .addComponent(jLabel2)))
                                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(64, 64, 64))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 500);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

//        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
//        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
//        jLabel4.setText("RFID CVENT");

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Login ->");

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Start ->");

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Stop ->");

        loginButton.setBackground(new java.awt.Color(0, 102, 102));
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.setPreferredSize(new java.awt.Dimension(400, 30));

        startButton.setBackground(new java.awt.Color(0, 102, 102));
        startButton.setForeground(new java.awt.Color(255, 255, 255));
        startButton.setText("Start");
        startButton.setPreferredSize(new java.awt.Dimension(200, 30));
        startButton.setEnabled(false);

        stopButton.setBackground(new java.awt.Color(0, 102, 102));
        stopButton.setForeground(new java.awt.Color(255, 255, 255));
        stopButton.setText("Stop");
        stopButton.setPreferredSize(new java.awt.Dimension(200, 30));
        stopButton.setEnabled(false);

        // Use GroupLayout for precise alignment
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(101, 101, 101)
                                                ))
                                .addContainerGap(230, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(28, 28, 28)

                                .addGap(40, 40, 40)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(400, 0, 400, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();

        //Button Action

        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isBsicAuth = 1;
                System.out.println("Login button clicked");
                String url = "https://192.168.1.88/cloud/localRestLogin";
                String message = "Login Failed";
                try {
                    String response = String.valueOf(Utils.WebServiceCall(url));
                    JSONObject myResponse = new JSONObject(response);
                    String code = myResponse.optString("code");
                    if (code.equals("0")) {
                        message = "Login Successfully";
                        token = myResponse.optString("message");
                        System.out.println("Token is :" + token);
                        startButton.setEnabled(true);
                        stopButton.setEnabled(false);
                    } else {
                        message = "Login Failed";
                    }
                    System.out.println("Response is :" + response);
                } catch (Exception ex) {
                    message = "Internal Error occurred " + ex;
                }
                JOptionPane.showMessageDialog(
                       jPanel1,
                        message,
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });

        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isBsicAuth = 0;
                System.out.println("Start button clicked");
                String message = "";
                String url = "https://192.168.1.88/cloud/start";
                try {
                    String response = String.valueOf(new Utils().WebServiceCall(url));
                    if (Utils.statusCode == 200) {
                        System.out.println("Reader Started Successfully");
                        message = "Reader Started Successfully";
                        startButton.setEnabled(false);
                        stopButton.setEnabled(true);
                    } else {
                        System.out.println("Something went wrong");
                        message = "Reader Failed to start";
                    }
                    System.out.println("Response is :" + response);
                } catch (Exception ex) {
                    startButton.setEnabled(true);
                    stopButton.setEnabled(true);
                    System.out.println("Status code :" + Utils.statusCode);
                    message = "Internal Error Occurred " + ex;
                }
                if(Utils.statusCode==200){
                    url= "https://events.adc.coop/RFIDStartCheck.php?Flag=1";
                    try {
                        String response = String.valueOf(new CventUtils().WebServiceCall(url));
                    } catch (Exception ex) {
                        message = "Failed to reach CVENT server";
                        System.out.println("Internal Error Occured "+ex);
                    }
                }
                JOptionPane.showMessageDialog(
                        jPanel1,
                        message,
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });

        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isBsicAuth = 0;
                System.out.println("Stop button clicked");
                String url = "https://192.168.1.88/cloud/stop";
                String message = "Reader Failed to Stop";
                try {
                    String response = String.valueOf(new Utils().WebServiceCall(url));
                    if (Utils.statusCode == 200) {
                        System.out.println("Reader Stopped Successfully");
                        message = "Reader Stopped Successfully";
                        startButton.setEnabled(false);
                        stopButton.setEnabled(false);
                    } else {
                        System.out.println("Something went wrong");
                    }
                    System.out.println("Response is :" + response);
                } catch (Exception ex) {
                    startButton.setEnabled(true);
                    stopButton.setEnabled(true);
                    message = "Internal Error Occurred " + ex;
                }
                if(Utils.statusCode==200){
                    url = "https://events.adc.coop/RFIDStartCheck.php?Flag=0";
                    try {
                        String response = String.valueOf(new CventUtils().WebServiceCall(url));
                    } catch (Exception ex) {
                        System.out.println("Internal Error Occured "+ex);
                        message = "Failed to reach CVENT server";
                    }
                }
                JOptionPane.showMessageDialog(
                        jPanel1,
                        message,
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });

    }// </editor-fold>//GEN-END:initComponents


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RFID_Starter().setVisible(true);
            }
        });
    }


    // End of variables declaration//GEN-END:variables
}
