/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defense.system;

/**
 *
 * @author suran
 */
public class Submarine extends javax.swing.JFrame implements Observer {

    private MainController mainController;

    /**
     * Creates new form Submarine
     */
    public Submarine() {
        initComponents();
        setVisible(true);
        btnShoot.setEnabled(false);
        btnSoner.setEnabled(false);
        btnTomahawk.setEnabled(false);
        btnTrident.setEnabled(false);
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submarineSoldier = new javax.swing.JSpinner();
        btnTrident = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        txtFeild = new javax.swing.JTextField();
        submarineAmmo = new javax.swing.JSpinner();
        lblClear = new javax.swing.JLabel();
        btnShoot = new javax.swing.JButton();
        btnTomahawk = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnSoner = new javax.swing.JButton();
        checkBox = new javax.swing.JCheckBox();
        btnSend = new javax.swing.JButton();
        sliderEnergy = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sliderOxigien = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Submarine");

        submarineSoldier.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        submarineSoldier.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                submarineSoldierStateChanged(evt);
            }
        });

        btnTrident.setBackground(new java.awt.Color(255, 255, 204));
        btnTrident.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTrident.setText("Trident-2 Missile");

        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        txtFeild.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        submarineAmmo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        submarineAmmo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                submarineAmmoStateChanged(evt);
            }
        });

        lblClear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblClear.setText("Area Not Cleared");

        btnShoot.setBackground(new java.awt.Color(102, 255, 255));
        btnShoot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnShoot.setText("Shoot");
        btnShoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShootActionPerformed(evt);
            }
        });

        btnTomahawk.setBackground(new java.awt.Color(255, 102, 102));
        btnTomahawk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTomahawk.setForeground(new java.awt.Color(255, 255, 255));
        btnTomahawk.setText("Tomahawk Mi...");
        btnTomahawk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomahawkActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Ammo Cou...");

        btnSoner.setBackground(new java.awt.Color(51, 51, 51));
        btnSoner.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSoner.setForeground(new java.awt.Color(255, 255, 255));
        btnSoner.setText("Soner Operation");
        btnSoner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSonerActionPerformed(evt);
            }
        });

        checkBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkBox.setText("Position");
        checkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxActionPerformed(evt);
            }
        });

        btnSend.setBackground(new java.awt.Color(51, 255, 204));
        btnSend.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        sliderEnergy.setBackground(new java.awt.Color(255, 255, 255));
        sliderEnergy.setForeground(new java.awt.Color(0, 0, 0));
        sliderEnergy.setMajorTickSpacing(20);
        sliderEnergy.setMinorTickSpacing(10);
        sliderEnergy.setOrientation(javax.swing.JSlider.VERTICAL);
        sliderEnergy.setPaintLabels(true);
        sliderEnergy.setPaintTicks(true);
        sliderEnergy.setToolTipText("");
        sliderEnergy.setValue(100);
        sliderEnergy.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderEnergyStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Soldier Co...");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Oxigien");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Energy");

        sliderOxigien.setBackground(new java.awt.Color(255, 255, 255));
        sliderOxigien.setForeground(new java.awt.Color(0, 0, 0));
        sliderOxigien.setMajorTickSpacing(20);
        sliderOxigien.setMinorTickSpacing(10);
        sliderOxigien.setOrientation(javax.swing.JSlider.VERTICAL);
        sliderOxigien.setPaintLabels(true);
        sliderOxigien.setPaintTicks(true);
        sliderOxigien.setToolTipText("");
        sliderOxigien.setValue(100);
        sliderOxigien.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderOxigienStateChanged(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Submarine");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnTomahawk, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnTrident, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnShoot, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSoner, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(118, 118, 118))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(lblClear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(15, 15, 15)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(24, 24, 24))
                            .addComponent(checkBox, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(submarineAmmo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submarineSoldier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(sliderEnergy, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(sliderOxigien, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblClear)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(submarineSoldier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnShoot)
                            .addComponent(btnSoner)
                            .addComponent(jLabel3)
                            .addComponent(submarineAmmo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTomahawk)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(checkBox)
                                .addComponent(btnTrident)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSend)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sliderEnergy, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(sliderOxigien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShootActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShootActionPerformed

    private void btnTomahawkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomahawkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTomahawkActionPerformed

    private void btnSonerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSonerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSonerActionPerformed

    private void checkBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxActionPerformed

    private void submarineSoldierStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_submarineSoldierStateChanged
        // TODO add your handling code here:
        String valueString = submarineSoldier.getValue().toString();
        mainController.setSpinner("Submarine", "Soldier", valueString);
    }//GEN-LAST:event_submarineSoldierStateChanged

    private void submarineAmmoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_submarineAmmoStateChanged
        // TODO add your handling code here:
        String valueString = submarineAmmo.getValue().toString();
        mainController.setSpinner("Submarine", "Ammo", valueString);
    }//GEN-LAST:event_submarineAmmoStateChanged

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        if (!txtFeild.getText().equals("")) {
            mainController.sendMessageToMainController("Submarine", txtFeild.getText());
            txtFeild.setText("");
        }
    }//GEN-LAST:event_btnSendActionPerformed

    private void sliderOxigienStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderOxigienStateChanged
        // TODO add your handling code here:
        int value = sliderOxigien.getValue();
        mainController.setOxigienValue("Submarine", value);


    }//GEN-LAST:event_sliderOxigienStateChanged

    private void sliderEnergyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderEnergyStateChanged
        // TODO add your handling code here:
        int value = sliderEnergy.getValue();
        mainController.setEnergyValue("Submarine", value);
    }//GEN-LAST:event_sliderEnergyStateChanged

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
            java.util.logging.Logger.getLogger(Submarine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Submarine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Submarine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Submarine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Submarine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnShoot;
    private javax.swing.JButton btnSoner;
    private javax.swing.JButton btnTomahawk;
    private javax.swing.JButton btnTrident;
    private javax.swing.JCheckBox checkBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClear;
    private javax.swing.JSlider sliderEnergy;
    private javax.swing.JSlider sliderOxigien;
    private javax.swing.JSpinner submarineAmmo;
    private javax.swing.JSpinner submarineSoldier;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtFeild;
    // End of variables declaration//GEN-END:variables

    @Override
    public void sendMessageToAll(String value) {
        txtArea.setText("MainController : " + value + "\n" + txtArea.getText());

    }

    @Override
    public void sendMessageToMainController(String name, String value) {
        //
    }

    @Override
    public void sendAreaClear(boolean b) {
        lblClear.setText(b ? "Area Cleared" : "Area Not Cleared");
    }

    @Override
    public void buttonControl(int value) {

        boolean b = checkBox.isSelected();
        btnShoot.setEnabled(value > 20 ? b && true : false);
        btnSoner.setEnabled(value > 40 ? b && true : false);
        btnTomahawk.setEnabled(value > 60 ? b && true : false);
        btnTrident.setEnabled(value > 80 ? b && true : false);

    }

     @Override
    public void getPrivateMessage(String name, String value) {
         if(name.equals("Submarine")){
             txtArea.setText("MainController : " + value + "\n" + txtArea.getText());
         }
    }

}
