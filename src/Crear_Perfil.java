public class Crear_Perfil extends javax.swing.JFrame {

    static String ARCHIVO_USR = "UsrDatos.txt";
    Utilidades util = new Utilidades();

    String nombre;

    public Crear_Perfil(String nombre) {
        this.nombre = nombre;
        initComponents();
        this.setTitle("Eco-Woman");
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Crear_btn_regresar = new javax.swing.JButton();
        Crear_btn_continuar = new javax.swing.JButton();
        Craer_tf_contraseña = new javax.swing.JTextField();
        Crear_tf_nombre = new javax.swing.JTextField();
        Crear_img_perfil = new javax.swing.JLabel();
        Crear_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Crear_btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Crear_btn_regresar.png"))); // NOI18N
        Crear_btn_regresar.setBorderPainted(false);
        Crear_btn_regresar.setContentAreaFilled(false);
        Crear_btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crear_btn_regresarActionPerformed(evt);
            }
        });
        jPanel1.add(Crear_btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, 40, -1));

        Crear_btn_continuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Crear_btn_continuar.png"))); // NOI18N
        Crear_btn_continuar.setBorderPainted(false);
        Crear_btn_continuar.setContentAreaFilled(false);
        Crear_btn_continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crear_btn_continuarActionPerformed(evt);
            }
        });
        jPanel1.add(Crear_btn_continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 230, -1));

        Craer_tf_contraseña.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        Craer_tf_contraseña.setToolTipText("");
        jPanel1.add(Craer_tf_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 180, -1));

        Crear_tf_nombre.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        Crear_tf_nombre.setToolTipText("");
        jPanel1.add(Crear_tf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 180, -1));

        Crear_img_perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Crear_perfil.png"))); // NOI18N
        jPanel1.add(Crear_img_perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, -1, -1));

        Crear_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Crear_fondo.png"))); // NOI18N
        jPanel1.add(Crear_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Crear_btn_continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crear_btn_continuarActionPerformed

        String nombre = Crear_tf_nombre.getText();
        System.out.println("Nombre: " + nombre);

        String pass = Craer_tf_contraseña.getText();
        System.out.println("Contraseña: " + pass);

        System.out.println("GUARDANDO USUARIO . . . ");
        Usuario user = new Usuario(nombre, pass);
        boolean flag = util.SaveNewUserToFile(user);
        if (flag) {
            Datos datos = new Datos(nombre);

            datos.setVisible(true);
            datos.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }//GEN-LAST:event_Crear_btn_continuarActionPerformed

    private void Crear_btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crear_btn_regresarActionPerformed
        // TODO add your handling code here:
        Index index = new Index(nombre);
        index.setVisible(true);
        index.setLocationRelativeTo(null);

        this.setVisible(false);
    }//GEN-LAST:event_Crear_btn_regresarActionPerformed

    //DRY pero igual es un proyecto de tercer semestre no le hagas
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
            java.util.logging.Logger.getLogger(Crear_Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crear_Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crear_Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crear_Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crear_Perfil("test").setVisible(true);
            }
        });
    }

    public void SavesToArrayList() {

        System.out.println("perro");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Craer_tf_contraseña;
    private javax.swing.JButton Crear_btn_continuar;
    private javax.swing.JButton Crear_btn_regresar;
    private javax.swing.JLabel Crear_fondo;
    private javax.swing.JLabel Crear_img_perfil;
    private javax.swing.JTextField Crear_tf_nombre;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}