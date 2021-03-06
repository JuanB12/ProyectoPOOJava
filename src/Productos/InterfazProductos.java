/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

import Menu.Menu;
import javax.swing.JOptionPane;
import Inventario.InterfazInventario;

/**
 *
 * @author Lenovo
 */
public class InterfazProductos extends javax.swing.JFrame {

    /**
     * Creates new form InterfazProductos
     */
    public InterfazProductos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonINVENTARIO = new javax.swing.JButton();
        jLabelMENU = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonMENU = new javax.swing.JButton();
        jLabelSALIR = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabelINVENTARIO = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonINVENTARIO.setBackground(new java.awt.Color(0, 0, 0));
        buttonINVENTARIO.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        buttonINVENTARIO.setForeground(new java.awt.Color(255, 255, 255));
        buttonINVENTARIO.setText("VER INVENTARIO");
        buttonINVENTARIO.setBorder(null);
        buttonINVENTARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonINVENTARIOActionPerformed(evt);
            }
        });
        jPanel1.add(buttonINVENTARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 180, 40));

        jLabelMENU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMENU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casa.png"))); // NOI18N
        jLabelMENU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMENUMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelMENU, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 50, 40));

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "IdProducto", "Nombre", "Categor??a", "Precio", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 680, 600));

        buttonMENU.setBackground(new java.awt.Color(0, 0, 0));
        buttonMENU.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        buttonMENU.setForeground(new java.awt.Color(255, 255, 255));
        buttonMENU.setText("IR A MEN??");
        buttonMENU.setBorder(null);
        buttonMENU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMENUActionPerformed(evt);
            }
        });
        jPanel1.add(buttonMENU, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 180, 40));

        jLabelSALIR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSALIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrarse.png"))); // NOI18N
        jLabelSALIR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSALIRMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelSALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 50, 40));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SALIR");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 180, 40));

        jLabelINVENTARIO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelINVENTARIO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tienda-delantera (1).png"))); // NOI18N
        jLabelINVENTARIO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelINVENTARIOMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelINVENTARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 50, 40));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PRODUCTOS DE TU COMPRA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 290, 80));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 250));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMENUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMENUActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonMENUActionPerformed

    private void buttonINVENTARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonINVENTARIOActionPerformed
        InterfazInventario interfazoinventario = new InterfazInventario(); 
        interfazoinventario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonINVENTARIOActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int Dialog = JOptionPane.YES_NO_OPTION;
        int Result = JOptionPane.showConfirmDialog(null, "??Desea salir de la pantalla?", "Exit",
                Dialog);
        if (Result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabelINVENTARIOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelINVENTARIOMouseClicked
        InterfazInventario interfazoinventario = new InterfazInventario(); 
        interfazoinventario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelINVENTARIOMouseClicked

    private void jLabelMENUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMENUMouseClicked
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelMENUMouseClicked

    private void jLabelSALIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSALIRMouseClicked
        int Dialog = JOptionPane.YES_NO_OPTION;
        int Result = JOptionPane.showConfirmDialog(null, "??Desea salir de la pantalla?", "Exit",
                Dialog);
        if (Result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabelSALIRMouseClicked

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
            java.util.logging.Logger.getLogger(InterfazProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonINVENTARIO;
    private javax.swing.JButton buttonMENU;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelINVENTARIO;
    private javax.swing.JLabel jLabelMENU;
    private javax.swing.JLabel jLabelSALIR;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
