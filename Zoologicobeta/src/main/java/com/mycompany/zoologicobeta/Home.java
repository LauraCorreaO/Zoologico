
package com.mycompany.zoologicobeta;

import java.util.ArrayList;
import java.awt.Color;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        Color verdePastelClaro = new Color(214, 255, 214);
        getContentPane().setBackground(verdePastelClaro);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        planesButton = new javax.swing.JButton();
        btnCrearPlan = new javax.swing.JButton();
        btnCrearAnimal = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Parque central de la aventura");

        planesButton.setText("Ver Planes");
        planesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planesButtonActionPerformed(evt);
            }
        });

        btnCrearPlan.setText("Crear Plan");
        btnCrearPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPlanActionPerformed(evt);
            }
        });

        btnCrearAnimal.setText("Crear Animal");
        btnCrearAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearAnimalActionPerformed(evt);
            }
        });

        jButton1.setText("Crear Boleta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(113, 113, 113))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnCrearAnimal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(planesButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(btnCrearPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearPlan)
                    .addComponent(btnCrearAnimal)
                    .addComponent(jButton1))
                .addGap(31, 31, 31)
                .addComponent(planesButton)
                .addGap(48, 48, 48))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void planesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planesButtonActionPerformed
        // TODO add your handling code here:
        JFramePlanes plan = new JFramePlanes();
        plan.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_planesButtonActionPerformed

    private void btnCrearPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPlanActionPerformed
        JFramePlan framePlan = new JFramePlan();
        framePlan.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCrearPlanActionPerformed

    private void btnCrearAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearAnimalActionPerformed
        JFrameAnimal animal = new JFrameAnimal();
        animal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCrearAnimalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFrameBoletas boleta = new JFrameBoletas();
        boleta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearAnimal;
    private javax.swing.JButton btnCrearPlan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton planesButton;
    // End of variables declaration//GEN-END:variables

   
}
