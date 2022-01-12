/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;


import controller.controllerLogin;
import javax.swing.JFrame;
import view.viewLaporanpembelian;
import view.viewLaporanpenjualan;

import view.viewLogin;
import view.viewpembelian;
import view.viewstock;
import view.viewtransaksi;
import view.viewuser;

/**
 *
 * @author Tawang sahro winanto
 */
public class utama extends javax.swing.JFrame {

    /**
     * Creates new form utama
     */
    public utama() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        controllerLogin cl = controllerLogin.getInstance(new viewLogin());
        if(!cl.getmL().getHakakses().toLowerCase().contains("pemilik")){
            jMenu2.setVisible(false);
            jMenu3.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layar = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        datauser = new javax.swing.JMenuItem();
        logout = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        barangmasuk = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        penjualan = new javax.swing.JMenu();
        Penjualan = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layarLayout = new javax.swing.GroupLayout(layar);
        layar.setLayout(layarLayout);
        layarLayout.setHorizontalGroup(
            layarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );
        layarLayout.setVerticalGroup(
            layarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 239, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("SELAMAT DATANG DI Toko Karya logam");

        jMenu1.setText("File");

        datauser.setText("Data user");
        datauser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datauserActionPerformed(evt);
            }
        });
        jMenu1.add(datauser);

        logout.setText("logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jMenu1.add(logout);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Data Barang");

        barangmasuk.setText("Barang masuk");
        barangmasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barangmasukActionPerformed(evt);
            }
        });
        jMenu2.add(barangmasuk);

        jMenuItem1.setText("Update stock");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        penjualan.setText("Penjualan");

        Penjualan.setText("penjualan");
        Penjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PenjualanActionPerformed(evt);
            }
        });
        penjualan.add(Penjualan);

        jMenuBar1.add(penjualan);

        jMenu3.setText("Laporan ");

        jMenuItem2.setText("Laporan Pembelian");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Laporan Penjualan");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(layar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(layar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barangmasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barangmasukActionPerformed
        // TODO add your handling code here:
        viewpembelian vb = new viewpembelian();
        this.layar.add(vb);
        vb.show();
    }//GEN-LAST:event_barangmasukActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        viewstock vs = new viewstock();
        this.layar.add(vs);
        vs.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        viewLaporanpembelian vp = new viewLaporanpembelian();
        this.layar.add(vp);
        vp.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void PenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PenjualanActionPerformed
        // TODO add your handling code here:
        viewtransaksi vt = new viewtransaksi();
        this.layar.add(vt);
        vt.show();
    }//GEN-LAST:event_PenjualanActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        viewLaporanpenjualan vj = new viewLaporanpenjualan();
        this.layar.add(vj);
        vj.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void datauserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datauserActionPerformed
        // TODO add your handling code here:
        viewuser us = new viewuser();
        this.layar.add(us);
        us.show();
    }//GEN-LAST:event_datauserActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Penjualan;
    private javax.swing.JMenuItem barangmasuk;
    private javax.swing.JMenuItem datauser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JDesktopPane layar;
    private javax.swing.JMenuItem logout;
    private javax.swing.JMenu penjualan;
    // End of variables declaration//GEN-END:variables
}