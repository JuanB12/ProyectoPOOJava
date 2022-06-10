/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

import Menu.Menu;
import javax.swing.JOptionPane;
import Inventario.Storage;
import java.util.ArrayList;

/**
 *
 * @author JuanB
 */
public class interfazStorage extends javax.swing.JFrame {

    /**
     * Creates new form interfazStorage
     */
    public interfazStorage() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    private ArrayList<Storage> stor;

    private void Limpiar() {
        TxtCANTIDAD.setText("");
        TxtTIPO.setText("");
        TxtFRECUENCIA.setText("");
    }

    private void verDatos() {
        String mat[][] = new String[stor.size()][3];
        Storage aux;
        for (int i = 0; i < stor.size(); i++) {
            aux = stor.get(i);
            mat[i][0] = aux.getFrecuencia();
            mat[i][1] = aux.getTipo();
            mat[i][3] = Integer.toString(aux.getCantidad());
        }
        tablaStorage.setModel(new javax.swing.table.DefaultTableModel(
                mat,
                new String[]{
                    "Tipo", "Cantidad", "Frecuencia"
                }
        ));
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
        tablaStorage = new javax.swing.JTable();
        jLabelSALIR = new javax.swing.JLabel();
        jButtonSALIR = new javax.swing.JButton();
        jLabelMENU = new javax.swing.JLabel();
        jButtonMENU = new javax.swing.JButton();
        jLabelAGREGAR2 = new javax.swing.JLabel();
        jButtonAGREGAR1 = new javax.swing.JButton();
        TxtCANTIDAD = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtTIPO = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtFRECUENCIA = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaStorage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"29", "DDR4", "3.2GHz"},
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
        jScrollPane1.setViewportView(tablaStorage);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 600));

        jLabelSALIR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSALIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrarse.png"))); // NOI18N
        jLabelSALIR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSALIRMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelSALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 50, 40));

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
        jPanel1.add(jButtonSALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, 180, 40));

        jLabelMENU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMENU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casa.png"))); // NOI18N
        jLabelMENU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMENUMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelMENU, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 50, 40));

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
        jPanel1.add(jButtonMENU, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 180, 40));

        jLabelAGREGAR2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAGREGAR2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mas-simbolo-negro.png"))); // NOI18N
        jLabelAGREGAR2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAGREGAR2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabelAGREGAR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 50, 40));

        jButtonAGREGAR1.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAGREGAR1.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jButtonAGREGAR1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAGREGAR1.setText("AGREGAR");
        jButtonAGREGAR1.setBorder(null);
        jButtonAGREGAR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAGREGAR1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAGREGAR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 180, 40));

        TxtCANTIDAD.setBorder(null);
        TxtCANTIDAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCANTIDADActionPerformed(evt);
            }
        });
        jPanel1.add(TxtCANTIDAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 190, 30));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cantidad");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 120, 30));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tipo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 110, 30));

        TxtTIPO.setBorder(null);
        TxtTIPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTIPOActionPerformed(evt);
            }
        });
        jPanel1.add(TxtTIPO, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 190, 30));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Frecuencia");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 110, 30));

        TxtFRECUENCIA.setBorder(null);
        TxtFRECUENCIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFRECUENCIAActionPerformed(evt);
            }
        });
        jPanel1.add(TxtFRECUENCIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 190, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 600));

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

    private void jLabelAGREGAR2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAGREGAR2MouseClicked
        String tipo, frec;
        int cant;
        try {
            tipo = TxtTIPO.getText();
            frec = TxtFRECUENCIA.getText();
            cant = Integer.parseInt(TxtCANTIDAD.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "verifique los datos");
        }
        Limpiar();
        verDatos();
    }//GEN-LAST:event_jLabelAGREGAR2MouseClicked

    private void jButtonAGREGAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAGREGAR1ActionPerformed
         String tipo, frec;
        int cant;
        try {
            tipo = TxtTIPO.getText();
            frec = TxtFRECUENCIA.getText();
            cant = Integer.parseInt(TxtCANTIDAD.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "verifique los datos");
        }
        Limpiar();
        verDatos();
    }//GEN-LAST:event_jButtonAGREGAR1ActionPerformed

    private void TxtCANTIDADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCANTIDADActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCANTIDADActionPerformed

    private void TxtTIPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTIPOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTIPOActionPerformed

    private void TxtFRECUENCIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFRECUENCIAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFRECUENCIAActionPerformed

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
    private javax.swing.JTextField TxtCANTIDAD;
    private javax.swing.JTextField TxtFRECUENCIA;
    private javax.swing.JTextField TxtTIPO;
    private javax.swing.JButton jButtonAGREGAR1;
    private javax.swing.JButton jButtonMENU;
    private javax.swing.JButton jButtonSALIR;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelAGREGAR;
    private javax.swing.JLabel jLabelAGREGAR1;
    private javax.swing.JLabel jLabelAGREGAR2;
    private javax.swing.JLabel jLabelMENU;
    private javax.swing.JLabel jLabelSALIR;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaStorage;
    // End of variables declaration//GEN-END:variables
}
