
import static javax.swing.JOptionPane.showMessageDialog;
import java.io.*;
import static javax.swing.JOptionPane.showMessageDialog;
import java.util.*;

public class Index extends javax.swing.JFrame {

    //valida usuario no form
    static String ARCHIVO_EW = "UsrDatos.txt";

    public Index() {
        initComponents();

        this.setTitle("Eco-Woman");
        this.setLocationRelativeTo(null);

    }

    Utilidades util = new Utilidades();

    /**
     * WARNING: Do NOT modify this code. The content of this method is always
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Inicio_btn_crearcuenta = new javax.swing.JButton();
        Inicio_btn_admin = new javax.swing.JButton();
        Inicio_btn_ingresar = new javax.swing.JButton();
        Inicio_tf_contraseña = new javax.swing.JTextField();
        Inicio_tf_nombre = new javax.swing.JTextField();
        Inicio_fondo = new javax.swing.JLabel();
        Inicio_img_perfil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Inicio_btn_crearcuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inicio_btn_crearcuenta.png"))); // NOI18N
        Inicio_btn_crearcuenta.setBorderPainted(false);
        Inicio_btn_crearcuenta.setContentAreaFilled(false);
        Inicio_btn_crearcuenta.setDefaultCapable(false);
        Inicio_btn_crearcuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inicio_btn_crearcuentaActionPerformed(evt);
            }
        });
        jPanel1.add(Inicio_btn_crearcuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, -1, -1));

        Inicio_btn_admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inicio_btn_admin.png"))); // NOI18N
        Inicio_btn_admin.setBorderPainted(false);
        Inicio_btn_admin.setContentAreaFilled(false);
        Inicio_btn_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inicio_btn_adminActionPerformed(evt);
            }
        });
        jPanel1.add(Inicio_btn_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, -1, -1));

        Inicio_btn_ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inicio_btn_ingresar.png"))); // NOI18N
        Inicio_btn_ingresar.setBorderPainted(false);
        Inicio_btn_ingresar.setContentAreaFilled(false);
        Inicio_btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inicio_btn_ingresarActionPerformed(evt);
            }
        });
        jPanel1.add(Inicio_btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 230, -1));

        Inicio_tf_contraseña.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jPanel1.add(Inicio_tf_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 180, -1));

        Inicio_tf_nombre.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        Inicio_tf_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inicio_tf_nombreActionPerformed(evt);
            }
        });
        jPanel1.add(Inicio_tf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 180, -1));

        Inicio_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inicio_fondo.png"))); // NOI18N
        jPanel1.add(Inicio_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Inicio_img_perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inicio_img_perfil.png"))); // NOI18N
        jPanel1.add(Inicio_img_perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Inicio_btn_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inicio_btn_adminActionPerformed
        String adminusr = Inicio_tf_nombre.getText();
        String adminpass = Inicio_tf_contraseña.getText();
        if ("admin".equals(adminusr) && "admin".equals(adminpass)) {
            Administrador admin = new Administrador();
            admin.setVisible(true);
            admin.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        else {
            showMessageDialog(null,"No tienes acceso de administrador. ");
        }
    }//GEN-LAST:event_Inicio_btn_adminActionPerformed

    private void Inicio_btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inicio_btn_ingresarActionPerformed
        // TODO add your handling code here:
        String nombre = Inicio_tf_nombre.getText();
        String pass = Inicio_tf_contraseña.getText();
        ArrayList<Usuario> objetosEnArchivo = util.ReadsUserFile();
        boolean seguir = false;
        for (int i = 0; i < objetosEnArchivo.size(); i++) {
            if (objetosEnArchivo.get(i).getNombre().equals(nombre) && objetosEnArchivo.get(i).getPass().equals(pass)) {
                seguir = true;
                break;
            }
        }
        if (seguir) {
            Menu menu = new Menu(nombre);
            menu.setVisible(true);
            menu.setLocationRelativeTo(null);
            this.setVisible(false);
            System.out.println("Inicio de sesion exitoso");
        } else {
            showMessageDialog(null, "Usuario y/o contraseña incorrectos. ");
        }

    }//GEN-LAST:event_Inicio_btn_ingresarActionPerformed

    private void Inicio_btn_crearcuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inicio_btn_crearcuentaActionPerformed
        // TODO add your handling code here:
        Crear_Perfil crear = new Crear_Perfil();
        crear.setVisible(true);
        crear.setLocationRelativeTo(null);

        this.setVisible(false);
    }//GEN-LAST:event_Inicio_btn_crearcuentaActionPerformed

    private void Inicio_tf_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inicio_tf_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Inicio_tf_nombreActionPerformed

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Inicio_btn_admin;
    private javax.swing.JButton Inicio_btn_crearcuenta;
    private javax.swing.JButton Inicio_btn_ingresar;
    private javax.swing.JLabel Inicio_fondo;
    private javax.swing.JLabel Inicio_img_perfil;
    private javax.swing.JTextField Inicio_tf_contraseña;
    private javax.swing.JTextField Inicio_tf_nombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
