package Loguearse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lenovo
 */
import AppPackage.AnimationClass;
import Menu.Menu;
import Registro.Registrarse;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.*;
import Pago.Interfazpago;
import java.awt.Desktop;
import java.net.URI;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void AbrirInternet() {
        try {
            Desktop.getDesktop().browse(URI.create("www.google.com"));
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, e);
        }
    }

    public void AbrirGmail() {
        try {
            Desktop.getDesktop().browse(URI.create("www.gmail.com"));
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, e);
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

        jPanel1 = new javax.swing.JPanel();
        IconoUserLogin = new javax.swing.JLabel();
        MenuLogin = new javax.swing.JLabel();
        UsuarioLogin = new javax.swing.JLabel();
        IngresoUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ContrasenaLogin = new javax.swing.JLabel();
        IngresoContrasena = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        ButtonLogin = new javax.swing.JButton();
        Registrarse = new javax.swing.JLabel();
        InternetLogin = new javax.swing.JLabel();
        GmailLogin = new javax.swing.JLabel();
        OjoLogin = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        OcultarContrasena = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IconoUserLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconoUserLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        IconoUserLogin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                IconoUserLoginMouseMoved(evt);
            }
        });
        IconoUserLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IconoUserLoginMouseExited(evt);
            }
        });
        jPanel1.add(IconoUserLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 160, 150));

        MenuLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lista.png"))); // NOI18N
        MenuLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuLoginMouseClicked(evt);
            }
        });
        jPanel1.add(MenuLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 60, 40));

        UsuarioLogin.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        UsuarioLogin.setText("Usuario");
        jPanel1.add(UsuarioLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 280, 40));

        IngresoUsuario.setForeground(new java.awt.Color(153, 153, 153));
        IngresoUsuario.setText(" Ingrese su usuario");
        IngresoUsuario.setBorder(null);
        IngresoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IngresoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngresoUsuarioMousePressed(evt);
            }
        });
        IngresoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(IngresoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 240, 40));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuarios.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 40, 50));

        ContrasenaLogin.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        ContrasenaLogin.setText("Contraseña");
        jPanel1.add(ContrasenaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 280, 40));

        IngresoContrasena.setText("******");
        IngresoContrasena.setBorder(null);
        IngresoContrasena.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IngresoContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngresoContrasenaMousePressed(evt);
            }
        });
        jPanel1.add(IngresoContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 210, 40));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-con-llave.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 40, 40));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 280, 10));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 280, 10));

        ButtonLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/jugar.png"))); // NOI18N
        ButtonLogin.setBorder(null);
        ButtonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonLoginMouseClicked(evt);
            }
        });
        ButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLoginActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 130, 50));

        Registrarse.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        Registrarse.setForeground(new java.awt.Color(204, 204, 204));
        Registrarse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Registrarse.setText("¿Desea registrarse?");
        Registrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registrarse.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                RegistrarseMouseMoved(evt);
            }
        });
        Registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarseMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegistrarseMouseExited(evt);
            }
        });
        jPanel1.add(Registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 210, 20));

        InternetLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InternetLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Internet.png"))); // NOI18N
        InternetLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InternetLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InternetLoginMouseClicked(evt);
            }
        });
        jPanel1.add(InternetLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 50, 40, 40));

        GmailLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GmailLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sobre.png"))); // NOI18N
        GmailLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GmailLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GmailLoginMouseClicked(evt);
            }
        });
        jPanel1.add(GmailLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 90, 40, 40));

        OjoLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OjoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ojo.png"))); // NOI18N
        OjoLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OjoLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OjoLoginMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                OjoLoginMousePressed(evt);
            }
        });
        jPanel1.add(OjoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 30, 50));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 160, 10));

        OcultarContrasena.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OcultarContrasena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ojo.png"))); // NOI18N
        OcultarContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OcultarContrasenaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OcultarContrasenaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                OcultarContrasenaMousePressed(evt);
            }
        });
        jPanel1.add(OcultarContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 30, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuLoginMouseClicked
        // --> 
        AnimationClass Internet = new AnimationClass();
        Internet.jLabelXRight(-40, 10, 10, 10, InternetLogin);
        AnimationClass Gmail = new AnimationClass();
        Gmail.jLabelXRight(-40, 10, 10, 10, GmailLogin);
        // <--
        Internet.jLabelXLeft(10, -40, 10, 10, InternetLogin);
        Gmail.jLabelXLeft(10, -40, 10, 10, GmailLogin);
    }//GEN-LAST:event_MenuLoginMouseClicked

    private void IconoUserLoginMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconoUserLoginMouseMoved
        IconoUserLogin.setBorder(javax.swing.BorderFactory.createLineBorder(Color.gray));
    }//GEN-LAST:event_IconoUserLoginMouseMoved

    private void IconoUserLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconoUserLoginMouseExited
        IconoUserLogin.setBorder(javax.swing.BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_IconoUserLoginMouseExited

    private void RegistrarseMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarseMouseMoved
        Registrarse.setBorder(javax.swing.BorderFactory.createLineBorder(Color.gray));
    }//GEN-LAST:event_RegistrarseMouseMoved

    private void RegistrarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarseMouseExited
        Registrarse.setBorder(javax.swing.BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_RegistrarseMouseExited

    private void RegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarseMouseClicked
        Registrarse registro = new Registrarse();
        registro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegistrarseMouseClicked

    private void IngresoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoUsuarioActionPerformed
        //Se crean las variabes
        String usuario, contra;
        usuario = this.IngresoUsuario.getText();
        contra = this.IngresoContrasena.getText();
        if (usuario.equals("Juan") && contra.equals("12345")) {
            Menu prueba = new Menu();
            prueba.setVisible(true);
            prueba.setExtendedState(prueba.getExtendedState());
            this.setVisible(false);
        } else {
            if (usuario.equals("Juan") && !(contra.equals("12345"))) {
                JOptionPane.showMessageDialog(null, "Contraseña no valido.");
            } else if ((!(usuario.equals("Juan")) && contra.equals("12345"))) {
                if (!(usuario.equals("Juan")) && contra.equals("12345")) {
                    JOptionPane.showMessageDialog(null, "Usuario no valido.");
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario y contraseña no valido.");
                }
            }
        }
    }//GEN-LAST:event_IngresoUsuarioActionPerformed

    private void ButtonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLoginMouseClicked
        //Se crean las variabes
        String usuario, contra;
        usuario = this.IngresoUsuario.getText();
        contra = this.IngresoContrasena.getText();
        if (usuario.equals("Juan") && contra.equals("12345")) {
            Menu prueba = new Menu();
            prueba.setVisible(true);
            prueba.setExtendedState(prueba.getExtendedState());
            this.setVisible(false);
        } else {
            if (usuario.equals("Juan") && !(contra.equals("12345"))) {
                JOptionPane.showMessageDialog(null, "Contraseña no valido.");
            } else if ((!(usuario.equals("Juan")) && contra.equals("12345"))) {
                if (!(usuario.equals("Juan")) && contra.equals("12345")) {
                    JOptionPane.showMessageDialog(null, "Usuario no valido.");
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario y contraseña no valido.");
                }
            }
        }
    }//GEN-LAST:event_ButtonLoginMouseClicked

    private void OjoLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OjoLoginMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_OjoLoginMouseClicked

    private void OjoLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OjoLoginMousePressed
        OjoLogin.setVisible(true);
        OjoLogin.setVisible(false);
        IngresoContrasena.setEchoChar((char) 0);
    }//GEN-LAST:event_OjoLoginMousePressed

    private void OcultarContrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OcultarContrasenaMousePressed
        OjoLogin.setVisible(true);
        OjoLogin.setVisible(false);
        IngresoContrasena.setEchoChar((char) 0);
    }//GEN-LAST:event_OcultarContrasenaMousePressed

    private void OcultarContrasenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OcultarContrasenaMouseClicked
        OjoLogin.setVisible(true);
        OjoLogin.setVisible(false);
        IngresoContrasena.setEchoChar((char) 0);
    }//GEN-LAST:event_OcultarContrasenaMouseClicked

    private void OcultarContrasenaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OcultarContrasenaMouseExited
        OjoLogin.setVisible(false);
        OjoLogin.setVisible(true);
        IngresoContrasena.setEchoChar('⚫');
    }//GEN-LAST:event_OcultarContrasenaMouseExited

    private void ButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonLoginActionPerformed

    private void InternetLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InternetLoginMouseClicked
        AbrirInternet();
    }//GEN-LAST:event_InternetLoginMouseClicked

    private void GmailLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GmailLoginMouseClicked
        AbrirGmail();
    }//GEN-LAST:event_GmailLoginMouseClicked

    private void IngresoUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresoUsuarioMousePressed
        if (IngresoUsuario.getText().equals("Ingrese su nombre de usuario")) {
            IngresoUsuario.setText("");
            IngresoUsuario.setForeground(Color.black);
        }
        if (String.valueOf(IngresoContrasena.getPassword()).isEmpty()) {
            IngresoContrasena.setText("********");
            IngresoContrasena.setForeground(Color.gray);
        }
    }//GEN-LAST:event_IngresoUsuarioMousePressed

    private void IngresoContrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresoContrasenaMousePressed
        if (String.valueOf(IngresoContrasena.getPassword()).equals("********")) {
            IngresoContrasena.setText("");
            IngresoContrasena.setForeground(Color.black);
        }
        if (IngresoUsuario.getText().isEmpty()) {
            IngresoUsuario.setText("Ingrese su nombre de usuario");
            IngresoUsuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_IngresoContrasenaMousePressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLogin;
    private javax.swing.JLabel ContrasenaLogin;
    private javax.swing.JLabel GmailLogin;
    private javax.swing.JLabel IconoUserLogin;
    private javax.swing.JPasswordField IngresoContrasena;
    private javax.swing.JTextField IngresoUsuario;
    private javax.swing.JLabel InternetLogin;
    private javax.swing.JLabel MenuLogin;
    private javax.swing.JLabel OcultarContrasena;
    private javax.swing.JLabel OjoLogin;
    private javax.swing.JLabel Registrarse;
    private javax.swing.JLabel UsuarioLogin;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
