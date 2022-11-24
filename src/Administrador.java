import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Administrador extends javax.swing.JFrame {

    Utilidades util = new Utilidades();
    String nombre;

    public Administrador(String nombre) {
        initComponents();
        this.nombre = nombre;
        this.setTitle("Eco-Woman");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Adminsitrador_btn_mostrar1 = new javax.swing.JButton();
        DeleteUsr = new javax.swing.JTextField();
        Adminsitrador_btn_mostrar = new javax.swing.JButton();
        Admin_Save = new javax.swing.JButton();
        Administrador_btn_regresar = new javax.swing.JButton();
        Administrador_img = new javax.swing.JLabel();
        Administrador_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Adminsitrador_btn_mostrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Adminsitrador_btn_mostrar.png"))); // NOI18N
        Adminsitrador_btn_mostrar1.setBorderPainted(false);
        Adminsitrador_btn_mostrar1.setContentAreaFilled(false);
        Adminsitrador_btn_mostrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Adminsitrador_btn_mostrar1ActionPerformed(evt);
            }
        });
        jPanel1.add(Adminsitrador_btn_mostrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 150, -1));

        DeleteUsr.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        DeleteUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteUsrActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteUsr, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 180, -1));

        Adminsitrador_btn_mostrar.setBorderPainted(false);
        Adminsitrador_btn_mostrar.setContentAreaFilled(false);
        jPanel1.add(Adminsitrador_btn_mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        Admin_Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Administrador_btn_guardar.png"))); // NOI18N
        Admin_Save.setBorderPainted(false);
        Admin_Save.setContentAreaFilled(false);
        Admin_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_SaveActionPerformed(evt);
            }
        });
        jPanel1.add(Admin_Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 150, -1));

        Administrador_btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Adminstrador_btn_regresar.png"))); // NOI18N
        Administrador_btn_regresar.setBorderPainted(false);
        Administrador_btn_regresar.setContentAreaFilled(false);
        Administrador_btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Administrador_btn_regresarActionPerformed(evt);
            }
        });
        jPanel1.add(Administrador_btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 40, -1));

        Administrador_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Administrador_img.png"))); // NOI18N
        jPanel1.add(Administrador_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        Administrador_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Administrador_fondo.png"))); // NOI18N
        jPanel1.add(Administrador_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Administrador_btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Administrador_btn_regresarActionPerformed
        // TODO add your handling code here:
        Index index = new Index(nombre);
        index.setVisible(true);
        index.setLocationRelativeTo(null);

        this.setVisible(false);
    }//GEN-LAST:event_Administrador_btn_regresarActionPerformed

    private void Admin_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_SaveActionPerformed
        //borra usuario
        String nombre_archivo = nombre + "_Perfil.txt";
        try {
            boolean found = false, adminacc = false, empty = false;
            util.eliminarDatosCuenta(nombre_archivo);
            ArrayList<Usuario> objetosEnArchivo = util.ReadsUserFile();
            String UsuarioBorrar = DeleteUsr.getText();
            if ("admin".equals(UsuarioBorrar)) {
                adminacc = true;
            } else if ("".equals(UsuarioBorrar)) {
                empty = true;
            }
            if (!adminacc) {
                for (int i = 0; i < objetosEnArchivo.size(); i++) {
                    if (objetosEnArchivo.get(i).getNombre().equals(UsuarioBorrar)) {
                        System.out.println("Objeto encontrado: " + objetosEnArchivo.get(i));
                        System.out.println("Removiendo: " + UsuarioBorrar + ", coincide con: " + objetosEnArchivo.get(i));
                        objetosEnArchivo.remove(i);
                        showMessageDialog(null, "Se ha eliminado la cuenta del usuario '" + UsuarioBorrar + "' . ");
                        found = true;
                        break;
                    }
                }
                util.SaveUserArr(objetosEnArchivo);
                System.out.println("objetos en archivo: " + objetosEnArchivo) ;
                if (!found && !empty) {
                    showMessageDialog(null, "No se encontró la cuenta '" + UsuarioBorrar + "' . ");
                }
            } else {
                showMessageDialog(null, "No se puede borrar la cuenta de administrador . ");
            }
        } catch (Exception e) {
            System.out.println("ALGO SALIO MAL, error: " + e);
        }
    }//GEN-LAST:event_Admin_SaveActionPerformed

    private void Adminsitrador_btn_mostrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Adminsitrador_btn_mostrar1ActionPerformed
        ArrayList<Usuario> objetosEnArchivo = util.ReadsUserFile();
        StringBuilder sb = new StringBuilder();
        sb.append("LISTA DE USUARIOS: \n\n");
        for (int i = 0; i < objetosEnArchivo.size(); i++) {
            Usuario datosUsr = objetosEnArchivo.get(i);
            sb.append(datosUsr);
            sb.append("\n");
        }
        showMessageDialog(null, sb.toString());
    }//GEN-LAST:event_Adminsitrador_btn_mostrar1ActionPerformed

    private void DeleteUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteUsrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteUsrActionPerformed

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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador("test").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admin_Save;
    private javax.swing.JButton Administrador_btn_regresar;
    private javax.swing.JLabel Administrador_fondo;
    private javax.swing.JLabel Administrador_img;
    private javax.swing.JButton Adminsitrador_btn_mostrar;
    private javax.swing.JButton Adminsitrador_btn_mostrar1;
    private javax.swing.JTextField DeleteUsr;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}