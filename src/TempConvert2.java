
import javax.swing.JOptionPane;

public class TempConvert2 extends javax.swing.JFrame {

    double far, cel;

    public TempConvert2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblfar = new javax.swing.JLabel();
        lblcel = new javax.swing.JLabel();
        FarBox = new javax.swing.JTextField();
        CelBox = new javax.swing.JTextField();
        F2C = new javax.swing.JButton();
        C2F = new javax.swing.JButton();
        outputlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Temp Conversion");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(255, 255, 0));

        lblfar.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        lblfar.setText("Fahrenheit");

        lblcel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcel.setText("Celcius");

        CelBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CelBoxActionPerformed(evt);
            }
        });

        F2C.setText(">>>>");
        F2C.setOpaque(false);
        F2C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F2CActionPerformed(evt);
            }
        });

        C2F.setText("<<<<");
        C2F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2FActionPerformed(evt);
            }
        });

        outputlbl.setBackground(new java.awt.Color(0, 0, 0));
        outputlbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        outputlbl.setForeground(new java.awt.Color(255, 255, 0));
        outputlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        outputlbl.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outputlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(F2C, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(lblfar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FarBox))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CelBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcel)
                            .addComponent(C2F, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblfar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FarBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CelBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(F2C)
                    .addComponent(C2F))
                .addGap(18, 18, 18)
                .addComponent(outputlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CelBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CelBoxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_CelBoxActionPerformed

    private void F2CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F2CActionPerformed
        // TODO add your handling code here:
        //read number in
        try {
            far = Double.parseDouble(FarBox.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error, must enter a number");
            return; //stop here
        }
        //convert
        cel = (far - 32.0) * 5.0 / 9.0;
        //print output in CelBox
        CelBox.setText(String.format("%.2f", cel));
        outputlbl.setText(String.format("%.2f F= %.2f C", far, cel));

    }//GEN-LAST:event_F2CActionPerformed

    private void C2FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2FActionPerformed
        // TODO add your handling code here:
        cel = Double.parseDouble(CelBox.getText());
        far = (cel * 9.0 / 5.0) + 32;
        FarBox.setText(String.format("%.2f", far));
        outputlbl.setText(String.format("%.2f C= %.2f F", cel, far));
    }//GEN-LAST:event_C2FActionPerformed

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
            java.util.logging.Logger.getLogger(TempConvert2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TempConvert2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TempConvert2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TempConvert2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TempConvert2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton C2F;
    private javax.swing.JTextField CelBox;
    private javax.swing.JButton F2C;
    private javax.swing.JTextField FarBox;
    private javax.swing.JLabel lblcel;
    private javax.swing.JLabel lblfar;
    private javax.swing.JLabel outputlbl;
    // End of variables declaration//GEN-END:variables
}
