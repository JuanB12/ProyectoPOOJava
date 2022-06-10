package Clientes;

import Registro.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Clientes.Cliente;
import Menu.Menu;

public class Interfazcliente extends javax.swing.JFrame {

    private ArrayList<Cliente> cli;

    public Interfazcliente() {
        cli = new ArrayList<Cliente>();
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelAGREGAR = new javax.swing.JLabel();
        jButtonAGREGAR = new javax.swing.JButton();
        TxtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtCedula = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        TxtCorreo = new javax.swing.JTextField();
        TxtTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TxtDireccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtSexo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtCiudad = new javax.swing.JTextField();
        jLabelMENU = new javax.swing.JLabel();
        jButtonMENU = new javax.swing.JButton();
        jLabelELIMINAR = new javax.swing.JLabel();
        jButtonAGREGAR1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAGREGAR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAGREGAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mas-simbolo-negro.png"))); // NOI18N
        jLabelAGREGAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAGREGARMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelAGREGAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 280, 60, 40));

        jButtonAGREGAR.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAGREGAR.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jButtonAGREGAR.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAGREGAR.setText("ELIMINAR");
        jButtonAGREGAR.setBorder(null);
        jButtonAGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAGREGARActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAGREGAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 350, 180, 40));

        TxtNombre.setBorder(null);
        TxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 160, 30));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 160, 30));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Apellido");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, 30));

        TxtApellido.setBorder(null);
        TxtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(TxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 160, 30));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cédula");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 160, 30));

        TxtCedula.setBorder(null);
        TxtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCedulaActionPerformed(evt);
            }
        });
        jPanel1.add(TxtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 160, 30));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Correo Electrónico");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 160, 30));

        TablaDatos.setAutoCreateRowSorter(true);
        TablaDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, ""},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Cedula", "Telefono", "Ciudad", "Direccion", "Correo Electronico", "Sexo"
            }
        ));
        TablaDatos.setOpaque(false);
        jScrollPane1.setViewportView(TablaDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 730, 330));

        TxtCorreo.setBorder(null);
        jPanel1.add(TxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 160, 30));

        TxtTelefono.setBorder(null);
        TxtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(TxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 180, 30));

        jLabel9.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Teléfono");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 110, 30));

        TxtDireccion.setBorder(null);
        TxtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDireccionActionPerformed(evt);
            }
        });
        jPanel1.add(TxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 180, 30));

        jLabel8.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Dirección");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 110, 30));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Sexo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 110, 30));

        TxtSexo.setBorder(null);
        TxtSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSexoActionPerformed(evt);
            }
        });
        jPanel1.add(TxtSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 180, 30));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Ciudad");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 110, 30));

        TxtCiudad.setBorder(null);
        TxtCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCiudadActionPerformed(evt);
            }
        });
        jPanel1.add(TxtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 180, 30));

        jLabelMENU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMENU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casa.png"))); // NOI18N
        jLabelMENU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMENUMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelMENU, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, 60, 40));

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
        jPanel1.add(jButtonMENU, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 430, 180, 40));

        jLabelELIMINAR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelELIMINAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar (1).png"))); // NOI18N
        jLabelELIMINAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelELIMINARMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelELIMINAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 350, 60, 40));

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
        jPanel1.add(jButtonAGREGAR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 280, 180, 40));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/servicio-al-cliente.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 5, 80, 200));

        jLabel10.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CLIENTE");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 4, 220, 200));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 300, 210));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreActionPerformed
    private void Limpiar() {
        TxtNombre.setText("");
        TxtApellido.setText("");
        TxtCiudad.setText("");
        TxtSexo.setText("");
        TxtDireccion.setText("");
        TxtCorreo.setText("");
        TxtCedula.setText("");
        TxtTelefono.setText("");
    }

    private void verDatos() {
        String mat[][] = new String[cli.size()][8];
        Cliente aux;
        for (int i = 0; i < cli.size(); i++) {
            aux = cli.get(i);
            mat[i][0] = aux.getNombre();
            mat[i][1] = aux.getApellido();
            mat[i][2] = Integer.toString(aux.getCedula());
            mat[i][3] = Integer.toString(aux.getTelefono());
            mat[i][4] = aux.getCiudad();
            mat[i][5] = aux.getDireccion();
            mat[i][6] = aux.getCor_dir();
            mat[i][7] = aux.getSexo();
        }
        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
                mat,
                new String[]{
                    "Nombre", "Apellido", "Cedula", "Telefono", "Ciudad", "Direccion", "Correo Electronico", "Sexo"
                }
        ));
    }
    private void TxtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApellidoActionPerformed

    private void TxtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCedulaActionPerformed

    private void TxtCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCiudadActionPerformed

    private void TxtSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSexoActionPerformed

    private void TxtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDireccionActionPerformed

    private void TxtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTelefonoActionPerformed

    private void jLabelAGREGARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAGREGARMouseClicked
        String Nom, Ape, Ciu, Sex, Dir, Cor_dir;
        int Ced, Tel;
        try {
            Nom = TxtNombre.getText();
            Ape = TxtApellido.getText();
            Ciu = TxtCiudad.getText();
            Sex = TxtSexo.getText();
            Dir = TxtDireccion.getText();
            Cor_dir = TxtCorreo.getText();
            Ced = Integer.parseInt(TxtCedula.getText());
            Tel = Integer.parseInt(TxtTelefono.getText());
            cli.add(new Cliente(Nom, Ape, Ciu, Sex, Dir, Cor_dir, Ced, Tel));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "verifique los datos");
        }
        Limpiar();
        verDatos();
    }//GEN-LAST:event_jLabelAGREGARMouseClicked

    private void jButtonAGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAGREGARActionPerformed
        int a;
        try {
            a = TablaDatos.getSelectedRow();
            cli.remove(a);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor, escoga una fila");
        }
        verDatos();
    }//GEN-LAST:event_jButtonAGREGARActionPerformed

    private void jLabelMENUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMENUMouseClicked
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelMENUMouseClicked

    private void jButtonMENUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMENUActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonMENUActionPerformed

    private void jLabelELIMINARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelELIMINARMouseClicked
        int a;
        try {
            a = TablaDatos.getSelectedRow();
            cli.remove(a);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor, escoga una fila");
        }
        verDatos();
    }//GEN-LAST:event_jLabelELIMINARMouseClicked

    private void jButtonAGREGAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAGREGAR1ActionPerformed
        String Nom, Ape, Ciu, Sex, Dir, Cor_dir;
        int Ced, Tel;
        try {
            Nom = TxtNombre.getText();
            Ape = TxtApellido.getText();
            Ciu = TxtCiudad.getText();
            Sex = TxtSexo.getText();
            Dir = TxtDireccion.getText();
            Cor_dir = TxtCorreo.getText();
            Ced = Integer.parseInt(TxtCedula.getText());
            Tel = Integer.parseInt(TxtTelefono.getText());
            cli.add(new Cliente(Nom, Ape, Ciu, Sex, Dir, Cor_dir, Ced, Tel));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "verifique los datos");
        }
        Limpiar();
        verDatos();
    }//GEN-LAST:event_jButtonAGREGAR1ActionPerformed

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
            java.util.logging.Logger.getLogger(Interfazcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfazcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfazcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfazcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfazcliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatos;
    private javax.swing.JTextField TxtApellido;
    private javax.swing.JTextField TxtCedula;
    private javax.swing.JTextField TxtCiudad;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtSexo;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JButton jButtonAGREGAR;
    private javax.swing.JButton jButtonAGREGAR1;
    private javax.swing.JButton jButtonMENU;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAGREGAR;
    private javax.swing.JLabel jLabelELIMINAR;
    private javax.swing.JLabel jLabelMENU;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
