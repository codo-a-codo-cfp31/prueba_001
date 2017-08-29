/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ahorcado;

import javax.swing.JButton;
import javax.swing.JTextField;


/**
 *
 * @author AIRAM
 */
public class JFrameAhorcado extends javax.swing.JFrame {

    
    public JFrameAhorcado() {
        initComponents();
    }
    
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPalabraAdivina = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtPalabraAdivina1 = new javax.swing.JTextField();
        txtPalabraAdivina2 = new javax.swing.JTextField();
        txtPalabraAdivina3 = new javax.swing.JTextField();
        txtPalabraAdivina4 = new javax.swing.JTextField();
        txtPalabraAdivina5 = new javax.swing.JTextField();
        txtPalabraAdivina6 = new javax.swing.JTextField();
        txtPalabraAdivina7 = new javax.swing.JTextField();
        txtPalabraAdivina8 = new javax.swing.JTextField();
        txtPalabraAdivina9 = new javax.swing.JTextField();
        txtPalabraAdivina10 = new javax.swing.JTextField();
        txtPalabraAdivina11 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPalabraAdivina.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtPalabraAdivina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPalabraAdivinaActionPerformed(evt);
            }
        });

        jButton1.setText("Comenzar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Verificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtPalabraAdivina1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPalabraAdivina1ActionPerformed(evt);
            }
        });

        txtPalabraAdivina4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPalabraAdivina4ActionPerformed(evt);
            }
        });

        txtPalabraAdivina8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPalabraAdivina8ActionPerformed(evt);
            }
        });

        txtPalabraAdivina10.setName(""); // NOI18N

        txtPalabraAdivina11.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtPalabraAdivina11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPalabraAdivina11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPalabraAdivina11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPalabraAdivina, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPalabraAdivina1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPalabraAdivina2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPalabraAdivina3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPalabraAdivina4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPalabraAdivina5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPalabraAdivina6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPalabraAdivina7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPalabraAdivina8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPalabraAdivina9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPalabraAdivina10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPalabraAdivina, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPalabraAdivina1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPalabraAdivina2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPalabraAdivina3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPalabraAdivina4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPalabraAdivina5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPalabraAdivina6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPalabraAdivina7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPalabraAdivina8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPalabraAdivina9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPalabraAdivina10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtPalabraAdivina11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addGap(53, 53, 53)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPalabraAdivinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPalabraAdivinaActionPerformed
        
    }//GEN-LAST:event_txtPalabraAdivinaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                
    }//GEN-LAST:event_jButton1ActionPerformed

    public JButton getjButton3() {
        return jButton3;
    }

    public void setjButton3(JButton jButton3) {
        this.jButton3 = jButton3;
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtPalabraAdivina4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPalabraAdivina4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPalabraAdivina4ActionPerformed

    private void txtPalabraAdivina8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPalabraAdivina8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPalabraAdivina8ActionPerformed

    private void txtPalabraAdivina1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPalabraAdivina1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPalabraAdivina1ActionPerformed

    private void txtPalabraAdivina11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPalabraAdivina11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPalabraAdivina11ActionPerformed

   
   /* public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFrameAhorcado().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public static javax.swing.JTextField txtPalabraAdivina;
    public static javax.swing.JTextField txtPalabraAdivina1;
    public static javax.swing.JTextField txtPalabraAdivina10;
    public static javax.swing.JTextField txtPalabraAdivina11;
    public static javax.swing.JTextField txtPalabraAdivina2;
    public static javax.swing.JTextField txtPalabraAdivina3;
    public static javax.swing.JTextField txtPalabraAdivina4;
    public static javax.swing.JTextField txtPalabraAdivina5;
    public static javax.swing.JTextField txtPalabraAdivina6;
    public static javax.swing.JTextField txtPalabraAdivina7;
    public static javax.swing.JTextField txtPalabraAdivina8;
    public static javax.swing.JTextField txtPalabraAdivina9;
    // End of variables declaration//GEN-END:variables

    public JButton getjButton1() {
        return jButton1;
    }

    public JTextField getTxtPalabraAdivina1() {
        return txtPalabraAdivina1;
    }

    public void setTxtPalabraAdivina1(JTextField txtPalabraAdivina1) {
        this.txtPalabraAdivina1 = txtPalabraAdivina1;
    }

    public JTextField getTxtPalabraAdivina10() {
        return txtPalabraAdivina10;
    }

    public void setTxtPalabraAdivina10(JTextField txtPalabraAdivina10) {
        this.txtPalabraAdivina10 = txtPalabraAdivina10;
    }

    public JTextField getTxtPalabraAdivina2() {
        return txtPalabraAdivina2;
    }

    public void setTxtPalabraAdivina2(JTextField txtPalabraAdivina2) {
        this.txtPalabraAdivina2 = txtPalabraAdivina2;
    }

    public JTextField getTxtPalabraAdivina3() {
        return txtPalabraAdivina3;
    }

    public void setTxtPalabraAdivina3(JTextField txtPalabraAdivina3) {
        this.txtPalabraAdivina3 = txtPalabraAdivina3;
    }

    public JTextField getTxtPalabraAdivina4() {
        return txtPalabraAdivina4;
    }

    public void setTxtPalabraAdivina4(JTextField txtPalabraAdivina4) {
        this.txtPalabraAdivina4 = txtPalabraAdivina4;
    }

    public JTextField getTxtPalabraAdivina5() {
        return txtPalabraAdivina5;
    }

    public void setTxtPalabraAdivina5(JTextField txtPalabraAdivina5) {
        this.txtPalabraAdivina5 = txtPalabraAdivina5;
    }

    public JTextField getTxtPalabraAdivina6() {
        return txtPalabraAdivina6;
    }

    public void setTxtPalabraAdivina6(JTextField txtPalabraAdivina6) {
        this.txtPalabraAdivina6 = txtPalabraAdivina6;
    }

    public JTextField getTxtPalabraAdivina7() {
        return txtPalabraAdivina7;
    }

    public void setTxtPalabraAdivina7(JTextField txtPalabraAdivina7) {
        this.txtPalabraAdivina7 = txtPalabraAdivina7;
    }

    public JTextField getTxtPalabraAdivina8() {
        return txtPalabraAdivina8;
    }

    public void setTxtPalabraAdivina8(JTextField txtPalabraAdivina8) {
        this.txtPalabraAdivina8 = txtPalabraAdivina8;
    }

    public JTextField getTxtPalabraAdivina9() {
        return txtPalabraAdivina9;
    }

    public void setTxtPalabraAdivina9(JTextField txtPalabraAdivina9) {
        this.txtPalabraAdivina9 = txtPalabraAdivina9;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JButton getjButton2() {
        return jButton2;
    }

    public void setjButton2(JButton jButton2) {
        this.jButton2 = jButton2;
    }

    public static JTextField getTxtPalabraAdivina() {
        return txtPalabraAdivina;
    }

    public static void setTxtPalabraAdivina(JTextField txtPalabraAdivina) {
        JFrameAhorcado.txtPalabraAdivina = txtPalabraAdivina;
    }
}
