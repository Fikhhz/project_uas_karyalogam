/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import database.KoneksiDatabase;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tawang sahro winanto
 */
public class viewListbarang extends javax.swing.JFrame {

    /**
     * Creates new form ViewListDataPelanggan
     */
    
    private viewtransaksi vti;
    private DefaultTableModel Tabel;
    
    public viewListbarang( viewtransaksi vti ) {
        initComponents();
        this.vti = vti;
        Tabel = new DefaultTableModel();
        listdataTB.setModel(Tabel);
        Tabel.addColumn("ids ");
        Tabel.addColumn("type ");
        Tabel.addColumn("stock gas");
        Tabel.addColumn("harga ");
        TampilDataPel();
    }

    private void TampilDataPel (){
        Tabel.getDataVector().removeAllElements();
        Tabel.fireTableDataChanged();
        
        String sql = "SELECT * FROM stock ";
        try {
            Statement stat = (Statement) KoneksiDatabase.getKoneksi(). createStatement();
            ResultSet res = stat.executeQuery(sql);
            while(res.next()){
                Object[] hasil;
                hasil = new Object[4];
                hasil[0] = res.getString("ids");
                hasil[1] = res.getString("type");
                hasil[2] = res.getString("stockgas");
                hasil[3] = res.getString("harga");
                 Tabel.addRow(hasil);
            }
        } catch (SQLException ex) {
            Logger.getLogger(viewtransaksi.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        listdataTB = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listdataTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        listdataTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listdataTBMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listdataTB);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Data Barang");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listdataTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listdataTBMouseClicked
        // TODO add your handling code here:
        int ambilbarang = listdataTB.getSelectedRow();

        vti.getType().setText(listdataTB.getValueAt(ambilbarang, 1).toString());
        vti.getStock().setText(listdataTB.getValueAt(ambilbarang, 2).toString());
        vti.getHargasatuan().setText(listdataTB.getValueAt(ambilbarang, 3).toString());
        
        //Interface tabel akan otomatis ke close
        dispose();
    }//GEN-LAST:event_listdataTBMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ViewListDataPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ViewListDataPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ViewListDataPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ViewListDataPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ViewListDataPelanggan().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listdataTB;
    // End of variables declaration//GEN-END:variables
}
