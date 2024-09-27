package Controllers;

import WebServiceCall.CventUtils;
import WebServiceCall.Utils;
import javax.swing.*;
import org.json.JSONObject;
import java.awt.*;
import java.util.Objects;

import static javax.swing.JOptionPane.*;

public class RFID_Starter extends javax.swing.JFrame {
    private javax.swing.JButton startButton;
    private javax.swing.JButton stopButton;
    private javax.swing.JPanel jPanel1;
    public static String token = "";
    public static int isBsicAuth = 0;
    private static final String ip =(String)Login.ipComboBox.getSelectedItem();
    private static final String port = Login.jPortField.getText() ;

    public RFID_Starter() {
        initComponents();
    }

    // <editor-fold default state="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        System.out.println("url is : https://"+ip+":"+port+"/RFIDStartCheck.php?Flag=1");
        System.out.println();
        jPanel1 = new javax.swing.JPanel();
        JPanel jPanel2 = new JPanel();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel2 = new JLabel();
        JLabel jLabel3 = new JLabel();
        JPanel jPanel3 = new JPanel();
        //jLabel4 = new javax.swing.JLabel();
        JLabel jLabel5 = new JLabel();
        JLabel jLabel6 = new JLabel();
        JLabel jLabel7 = new JLabel();
        JButton loginButton = new JButton();
        startButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RFID");
        setPreferredSize(new java.awt.Dimension(700, 400));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 400));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        java.net.URL iconURL = Login.class.getResource("/Icon/NECO_logo.png");
        if (iconURL != null) {
            ImageIcon icon = new ImageIcon(iconURL);
            setIconImage(icon.getImage());
        } else {
            System.err.println("Icon image not found!");
        }

        // Make sure the image path is correct
        jLabel1.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Icon/ADC_bg1.png")))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Showcased Gothic", Font.PLAIN, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("   RFID CVENT");

        jLabel3.setFont(new java.awt.Font("Segue UI Light", Font.PLAIN, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("copyright © company name All rights reserved");

        java.awt.GridBagConstraints gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.CENTER;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jLabel1, gridBagConstraints);

        gridBagConstraints.gridy = 1;
        gridBagConstraints.weighty = 0;
        jPanel2.add(jLabel2, gridBagConstraints);

        gridBagConstraints.gridy = 2;
        jPanel2.add(jLabel3, gridBagConstraints);


        assert jPanel1 != null;
        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 400);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Segue UI", Font.PLAIN, 14)); // NOI18N
        jLabel5.setText("Login ->");

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Segue UI", Font.PLAIN, 14)); // NOI18N
        jLabel6.setText("Start ->");

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("Segue UI", Font.PLAIN, 14)); // NOI18N
        jLabel7.setText("Stop ->");

        loginButton.setBackground(new java.awt.Color(0, 102, 102));
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.setPreferredSize(new java.awt.Dimension(100, 30));

        assert startButton != null;
        startButton.setBackground(new java.awt.Color(0, 102, 102));
        startButton.setForeground(new java.awt.Color(255, 255, 255));
        startButton.setText("Start");
        startButton.setPreferredSize(new java.awt.Dimension(100, 30));
        startButton.setEnabled(false);

        assert stopButton != null;
        stopButton.setBackground(new java.awt.Color(0, 102, 102));
        stopButton.setForeground(new java.awt.Color(255, 255, 255));
        stopButton.setText("Stop");
        stopButton.setPreferredSize(new java.awt.Dimension(100, 30));
        stopButton.setEnabled(false);

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
                                                .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(100, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(400, 0, 300, 400);

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

        loginButton.addActionListener(evt -> {
            isBsicAuth = 1;
            System.out.println("Login button clicked");
            String code = updateBearerToken();
            String message = "Login Failed";
            if(code.equals("0")) {
                message = "Login Successfully";
                startButton.setEnabled(true);
                stopButton.setEnabled(false);
            }
            JOptionPane.showMessageDialog(
                   jPanel1,
                    message,
                    "Message",
                    JOptionPane.INFORMATION_MESSAGE
            );
        });

        startButton.addActionListener(evt -> {
            int choice = JOptionPane.showConfirmDialog(
                    jPanel1,
                    "are you sure you want to start the RFID Reader",
                    "Message",
                    JOptionPane.YES_NO_OPTION
            );
            if(choice==NO_OPTION){
                return;
            }
            isBsicAuth = 0;
            System.out.println("Start button clicked");
            String message;
            String url = "https://192.168.1.88/cloud/start";
            try {
                String response = String.valueOf(Utils.WebServiceCall(url));
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
               // url= "https://events.adc.coop/RFIDStartCheck.php?Flag=1";
                url = "https://"+ip+":"+port+"/RFIDStartCheck.php?Flag=1";
                try {
                    String response = String.valueOf(CventUtils.WebServiceCall(url));
                    System.out.println("response of cvent server :"+response);
                } catch (Exception ex) {
                    message = "RFID reader started but failed to reach CVENT server";
                    System.out.println("Internal Error Occured "+ex);
                }
            }
            JOptionPane.showMessageDialog(
                    jPanel1,
                    message,
                    "Message",
                    JOptionPane.INFORMATION_MESSAGE
            );
        });

        stopButton.addActionListener(evt -> {
            int choice = JOptionPane.showConfirmDialog(
                    jPanel1,
                    "are you sure you want to stop the RFID Reader",
                    "Message",
                    JOptionPane.YES_NO_OPTION
            );
            if(choice==NO_OPTION){
                return;
            }
            isBsicAuth = 1;
            System.out.println("Stop button clicked");
            String code = updateBearerToken();
            String url = "https://192.168.1.88/cloud/stop";
            String message = "Reader Failed to Stop";
            System.out.println("Code :"+code);
            try {
                isBsicAuth = 0;
                String response = String.valueOf(Utils.WebServiceCall(url));
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
                message = "Bearer token has expired click login to update token and stop again";
            }
            if(Utils.statusCode==200){
                //url = "https://events.adc.coop/RFIDStartCheck.php?Flag=0";
                url = "https://"+ip+":"+port+"/RFIDStartCheck.php?Flag=0";
                try {
                    String response = String.valueOf(CventUtils.WebServiceCall(url));
                    System.out.println("Response is :"+response);
                } catch (Exception ex) {
                    System.out.println("Internal Error Occured "+ex);
                    message = "RFID reader stopped but failed to reach CVENT server";
                }
            }
            JOptionPane.showMessageDialog(
                    jPanel1,
                    message,
                    "Message",
                    JOptionPane.INFORMATION_MESSAGE
            );
        });

    }// </editor-fold>//GEN-END:initComponents



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new RFID_Starter().setVisible(true));
    }

   public String updateBearerToken(){
        String url = "https://192.168.1.88/cloud/localRestLogin";
        String code = "";
        try {
            String response = String.valueOf(Utils.WebServiceCall(url));
            JSONObject myResponse = new JSONObject(response);
            code = myResponse.optString("code");
            token =(Objects.equals(code, "0"))? myResponse.optString("message"):"";
        } catch (Exception e) {
            System.out.println("Internal exception :"+e);
        }
        return code;
    }
    // End of variables declaration//GEN-END:variables
}
