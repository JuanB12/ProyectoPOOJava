/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;
import Menu.Menu; 
import javax.swing.JOptionPane;
import Inventario.Storage;

/**
 *
 * @author Lenovo
 */
public class interfazStorage extends javax.swing.JFrame {

    /**
     * Creates new form interfazStorage
     */
    public interfazStorage() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelSALIR = new javax.swing.JLabel();
        jButtonSALIR = new javax.swing.JButton();
        jLabelMENU = new javax.swing.JLabel();
        jButtonMENU = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cantidad", "Tipo", "Frecuencia"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 600));

        jLabelSALIR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSALIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrarse.png"))); // NOI18N
        jLabelSALIR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSALIRMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelSALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 50, 40));

        jButtonSALIR.setBackground(new java.awt.Color(0, 0, 0));
        jButtonSALIR.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jButtonSALIR.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSALIR.setText("SALIR");
        jButtonSALIR.setBorder(null);
        jButtonSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSALIRActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 180, 40));

        jLabelMENU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMENU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casa.png"))); // NOI18N
        jLabelMENU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMENUMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelMENU, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 50, 40));

        jButtonMENU.setBackground(new java.awt.Color(0, 0, 0));
        jButtonMENU.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jButtonMENU.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMENU.setText("MENU");
        jButtonMENU.setBorder(null);
        jButtonMENU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMENUActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMENU, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 180, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelSALIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSALIRMouseClicked
        int Dialog = JOptionPane.YES_NO_OPTION;
        int Result = JOptionPane.showConfirmDialog(null, "¿Desea salir de la pantalla?", "Exit",
            Dialog);
        if (Result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabelSALIRMouseClicked

    private void jButtonSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSALIRActionPerformed
        int Dialog = JOptionPane.YES_NO_OPTION;
        int Result = JOptionPane.showConfirmDialog(null, "¿Desea salir de la pantalla?", "Exit",
            Dialog);
        if (Result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonSALIRActionPerformed

    private void jLabelMENUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMENUMouseClicked
        InterfazInventario interfazinventario = new InterfazInventario();
        interfazinventario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelMENUMouseClicked

    private void jButtonMENUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMENUActionPerformed
        InterfazInventario interfazinventario = new InterfazInventario();
        interfazinventario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonMENUActionPerformed

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
            java.util.logging.Logger.getLogger(interfazStorage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazStorage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazStorage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazStorage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazStorage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMENU;
    private javax.swing.JButton jButtonSALIR;
    private javax.swing.JLabel jLabelMENU;
    private javax.swing.JLabel jLabelSALIR;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}