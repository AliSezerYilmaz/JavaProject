/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thirdproject;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.json.JSONObject;

/**
 *
 * @author kucuksille
 */
public class ThirdFrame extends javax.swing.JFrame {
    
   
    /**
     * Creates new form ThirdFrame
     */
    public ThirdFrame() {
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

        btn_getweather = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_temperature = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_feeltemperature = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_weathercondition = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_description = new javax.swing.JLabel();
        lbl_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_getweather.setText("Hava Durumu Getir");
        btn_getweather.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_getweatherActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("Sıcaklık");

        lbl_temperature.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lbl_temperature.setForeground(java.awt.Color.red);
        lbl_temperature.setText("sıcaklık");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Hissedilen Sıcaklık");

        lbl_feeltemperature.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lbl_feeltemperature.setForeground(java.awt.Color.red);
        lbl_feeltemperature.setText("hissedilen sıcaklık");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setText("Hava Durumu");

        lbl_weathercondition.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lbl_weathercondition.setForeground(java.awt.Color.red);
        lbl_weathercondition.setText("hissedilen sıcaklık");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setText("Açıklama");

        lbl_description.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lbl_description.setForeground(java.awt.Color.red);
        lbl_description.setText("açıklama");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_feeltemperature)
                            .addComponent(lbl_temperature)
                            .addComponent(lbl_weathercondition)
                            .addComponent(lbl_description)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(btn_getweather)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbl_temperature))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbl_feeltemperature))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbl_weathercondition))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbl_description))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_image, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_getweather)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_getweatherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_getweatherActionPerformed
        WeatherClient wClient = new WeatherClient();
        try {
            JsonOperation currentWeather = new JsonOperation(wClient.getWeather("Isparta"));
            
            lbl_temperature.setText(currentWeather.getKeyValue("main","temp").toString());
            lbl_feeltemperature.setText(currentWeather.getKeyValue("main","feels_like").toString());
            lbl_weathercondition.setText(currentWeather.getKeyValue("weather",0,"main").toString());
            lbl_description.setText(currentWeather.getKeyValue("weather",0,"description").toString());
            String imageName = currentWeather.getKeyValue("weather",0,"icon").toString() + "@2x.png";
            URL url = new URL("https://openweathermap.org/img/wn/" + imageName);
            BufferedImage bufferedImage = ImageIO.read(url);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            lbl_image.setIcon(imageIcon);
            
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }//GEN-LAST:event_btn_getweatherActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ThirdFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThirdFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThirdFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThirdFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThirdFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_getweather;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_description;
    private javax.swing.JLabel lbl_feeltemperature;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JLabel lbl_temperature;
    private javax.swing.JLabel lbl_weathercondition;
    // End of variables declaration//GEN-END:variables
}
