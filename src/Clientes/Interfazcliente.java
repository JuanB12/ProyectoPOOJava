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
        Agregar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtNombre.setBorder(null);
        TxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 160, 30));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 140, 30));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Apellido");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 140, 30));

        TxtApellido.setBorder(null);
        TxtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(TxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 160, 30));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cédula");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 140, 30));

        TxtCedula.setBorder(null);
        TxtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCedulaActionPerformed(evt);
            }
        });
        getContentPane().add(TxtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 160, 30));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Correo Electrónico");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 140, 30));

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
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Cedula", "Telefono", "Ciudad", "Direccion", "Correo Electronico", "Sexo"
            }
        ));
        TablaDatos.setOpaque(false);
        jScrollPane1.setViewportView(TablaDatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 490, 140));

        TxtCorreo.setBorder(null);
        getContentPane().add(TxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 160, 30));

        TxtTelefono.setBorder(null);
        TxtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(TxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 170, 30));

        jLabel9.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Teléfono");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 110, 30));

        TxtDireccion.setBorder(null);
        TxtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDireccionActionPerformed(evt);
            }
        });
        getContentPane().add(TxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 170, 30));

        jLabel8.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Dirección");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 100, 30));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Sexo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 100, 30));

        TxtSexo.setBorder(null);
        TxtSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSexoActionPerformed(evt);
            }
        });
        getContentPane().add(TxtSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 170, 30));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Ciudad");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 100, 30));

        TxtCiudad.setBorder(null);
        TxtCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCiudadActionPerformed(evt);
            }
        });
        getContentPane().add(TxtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 170, 30));

        Agregar.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        Agregar.setText("AGREGAR");
        Agregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 110, 30));

        Cancelar.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        Cancelar.setText("INICIO");
        Cancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 110, 30));

        Eliminar.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        Eliminar.setText("ELIMINAR");
        Eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 110, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 360));

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
    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
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
    }//GEN-LAST:event_AgregarActionPerformed

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

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        int a;
        try {
            a = TablaDatos.getSelectedRow();
            cli.remove(a);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor, escoga una fila");
        }
        verDatos();
    }//GEN-LAST:event_EliminarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CancelarActionPerformed

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
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTable TablaDatos;
    private javax.swing.JTextField TxtApellido;
    private javax.swing.JTextField TxtCedula;
    private javax.swing.JTextField TxtCiudad;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtSexo;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
