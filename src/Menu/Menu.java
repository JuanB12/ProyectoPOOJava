/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Registro.*;
import javax.swing.JOptionPane;
import Proovedor.Interfazproveedor;
import Proovedor.Proveedor;
import Pago.Interfazpago;
import Pago.Pagos;
import Clientes.Interfazcliente;

/**
 *
 * @author Daniel Lerma
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jLabel = new javax.swing.JLabel();
        jButtonCliente = new javax.swing.JButton();
        jLabelPagos = new javax.swing.JLabel();
        jButtonProveedor = new javax.swing.JButton();
        jLabelCliente1 = new javax.swing.JLabel();
        jButtonPagos = new javax.swing.JButton();
        jLabelProveedor1 = new javax.swing.JLabel();
        jButtonCarrito = new javax.swing.JButton();
        jLabelCarrito = new javax.swing.JLabel();
        jButtonBuscarproducto = new javax.swing.JButton();
        jLabelProductos = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jpE_S = new javax.swing.JPanel();
        jLabelBienvenido = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel.setForeground(new java.awt.Color(255, 255, 255));
        jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel.setText("ELIGA LA OPCIÓN QUE DESEE");
        getContentPane().add(jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 410, 60));

        jButtonCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario (2).png"))); // NOI18N
        jButtonCliente.setBorderPainted(false);
        jButtonCliente.setContentAreaFilled(false);
        jButtonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 120, 80));

        jLabelPagos.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabelPagos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPagos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPagos.setText("PAGOS");
        getContentPane().add(jLabelPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 252, 110, 30));

        jButtonProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/repartidor.png"))); // NOI18N
        jButtonProveedor.setBorderPainted(false);
        jButtonProveedor.setContentAreaFilled(false);
        jButtonProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProveedorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 120, 90));

        jLabelCliente1.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabelCliente1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCliente1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCliente1.setText("CLIENTE");
        jLabelCliente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCliente1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabelCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 120, -1));

        jButtonPagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cartera.png"))); // NOI18N
        jButtonPagos.setBorderPainted(false);
        jButtonPagos.setContentAreaFilled(false);
        jButtonPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPagosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 110, 90));

        jLabelProveedor1.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabelProveedor1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProveedor1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProveedor1.setText("PROVEEDOR");
        jLabelProveedor1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelProveedor1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabelProveedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 140, 30));

        jButtonCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anadir-al-carrito.png"))); // NOI18N
        jButtonCarrito.setBorderPainted(false);
        jButtonCarrito.setContentAreaFilled(false);
        jButtonCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarritoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 110, 80));

        jLabelCarrito.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabelCarrito.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCarrito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCarrito.setText("CARRITO");
        getContentPane().add(jLabelCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 130, 30));

        jButtonBuscarproducto.setBackground(new java.awt.Color(255, 255, 255));
        jButtonBuscarproducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/producto.png"))); // NOI18N
        jButtonBuscarproducto.setBorderPainted(false);
        jButtonBuscarproducto.setContentAreaFilled(false);
        jButtonBuscarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarproductoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 120, 80));

        jLabelProductos.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabelProductos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProductos.setText("PRODUCTOS");
        getContentPane().add(jLabelProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 150, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 100, 80));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SALIR ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 100, 30));

        jpE_S.setBackground(new java.awt.Color(255, 255, 255));
        jpE_S.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jpE_S.setForeground(new java.awt.Color(255, 255, 255));
        jpE_S.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBienvenido.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabelBienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBienvenido.setText("BIENVENIDO");
        jpE_S.add(jLabelBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 420, 50));

        getContentPane().add(jpE_S, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo azul.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClienteActionPerformed
        Interfazcliente intercli = new Interfazcliente();
        intercli.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonClienteActionPerformed

    private void jLabelCliente1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCliente1MouseClicked
        Interfazcliente intercli = new Interfazcliente();
        intercli.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelCliente1MouseClicked

    private void jButtonProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProveedorActionPerformed
        Interfazproveedor interprov = new Interfazproveedor();
        interprov.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonProveedorActionPerformed

    private void jButtonPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPagosActionPerformed
        Interfazpago interfazPag = new Interfazpago();
        interfazPag.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonPagosActionPerformed

    private void jButtonCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarritoActionPerformed
        /*BDD*/
    }//GEN-LAST:event_jButtonCarritoActionPerformed

    private void jLabelProveedor1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelProveedor1MouseClicked
        Interfazproveedor interprov = new Interfazproveedor();
        interprov.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelProveedor1MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        int Dialog = JOptionPane.YES_NO_OPTION;
        int Result = JOptionPane.showConfirmDialog(null, "¿Desea salir del Menu?", "Exit",
                Dialog);
        if (Result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButtonBuscarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBuscarproductoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBuscarproducto;
    private javax.swing.JButton jButtonCarrito;
    private javax.swing.JButton jButtonCliente;
    private javax.swing.JButton jButtonPagos;
    private javax.swing.JButton jButtonProveedor;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBienvenido;
    private javax.swing.JLabel jLabelCarrito;
    private javax.swing.JLabel jLabelCliente1;
    private javax.swing.JLabel jLabelPagos;
    private javax.swing.JLabel jLabelProductos;
    private javax.swing.JLabel jLabelProveedor1;
    private javax.swing.JPanel jpE_S;
    // End of variables declaration//GEN-END:variables
}
