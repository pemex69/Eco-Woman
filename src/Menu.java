import java.awt.BorderLayout;

public class Menu extends javax.swing.JFrame {

    private String nombre;

    /**
     * Creates new form Menu
     */
    public Menu(String nombre) {
        this.nombre = nombre;
        initComponents();

        Inicio incio = new Inicio();
        incio.setSize(720, 481);
        incio.setLocation(0, 0);

        Content.removeAll();
        Content.add(incio, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();

        this.setTitle("Eco-Woman");
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Menu_btn_cerrarsesion = new javax.swing.JButton();
        Menu_btn_calculo = new javax.swing.JButton();
        Menu_btn_perfil = new javax.swing.JButton();
        Menu_btn_nosotros = new javax.swing.JButton();
        Menu_btn_inicio = new javax.swing.JButton();
        Menu_fondo = new javax.swing.JLabel();
        Content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu_btn_cerrarsesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu_btn_cerrarsesion.png"))); // NOI18N
        Menu_btn_cerrarsesion.setToolTipText("");
        Menu_btn_cerrarsesion.setBorderPainted(false);
        Menu_btn_cerrarsesion.setContentAreaFilled(false);
        Menu_btn_cerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_btn_cerrarsesionActionPerformed(evt);
            }
        });
        jPanel1.add(Menu_btn_cerrarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        Menu_btn_calculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu_btn_calculo.png"))); // NOI18N
        Menu_btn_calculo.setToolTipText("");
        Menu_btn_calculo.setBorderPainted(false);
        Menu_btn_calculo.setContentAreaFilled(false);
        Menu_btn_calculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_btn_calculoActionPerformed(evt);
            }
        });
        jPanel1.add(Menu_btn_calculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        Menu_btn_perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu_btn_perfil.png"))); // NOI18N
        Menu_btn_perfil.setToolTipText("");
        Menu_btn_perfil.setBorderPainted(false);
        Menu_btn_perfil.setContentAreaFilled(false);
        Menu_btn_perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_btn_perfilActionPerformed(evt);
            }
        });
        jPanel1.add(Menu_btn_perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        Menu_btn_nosotros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu_btn_nosotros.png"))); // NOI18N
        Menu_btn_nosotros.setToolTipText("");
        Menu_btn_nosotros.setBorderPainted(false);
        Menu_btn_nosotros.setContentAreaFilled(false);
        Menu_btn_nosotros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_btn_nosotrosActionPerformed(evt);
            }
        });
        jPanel1.add(Menu_btn_nosotros, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        Menu_btn_inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu_btn_inicio.png"))); // NOI18N
        Menu_btn_inicio.setToolTipText("");
        Menu_btn_inicio.setBorderPainted(false);
        Menu_btn_inicio.setContentAreaFilled(false);
        Menu_btn_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_btn_inicioActionPerformed(evt);
            }
        });
        jPanel1.add(Menu_btn_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        Menu_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu_fondo.png"))); // NOI18N
        jPanel1.add(Menu_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jPanel1.add(Content, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 720, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Menu_btn_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_btn_inicioActionPerformed
        // TODO add your handling code here:
        Inicio incio = new Inicio();
        incio.setSize(720, 481);
        incio.setLocation(0, 0);

        Content.removeAll();
        Content.add(incio, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }//GEN-LAST:event_Menu_btn_inicioActionPerformed

    private void Menu_btn_cerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_btn_cerrarsesionActionPerformed
        // TODO add your handling code here:
        Index index = new Index(nombre);
        index.setVisible(true);
        index.setLocationRelativeTo(null);
        this.setVisible(false);

    }//GEN-LAST:event_Menu_btn_cerrarsesionActionPerformed

    private void Menu_btn_calculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_btn_calculoActionPerformed
        // TODO add your handling code here:
        Calculo calculo = new Calculo(nombre);
        calculo.setSize(720, 481);
        calculo.setLocation(0, 0);

        Content.removeAll();
        Content.add(calculo, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }//GEN-LAST:event_Menu_btn_calculoActionPerformed

    private void Menu_btn_perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_btn_perfilActionPerformed
        // TODO add your handling code here:
        Perfil perfil = new Perfil(nombre, this);
        perfil.setSize(720, 481);
        perfil.setLocation(0, 0);

        Content.removeAll();
        Content.add(perfil, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }//GEN-LAST:event_Menu_btn_perfilActionPerformed

    private void Menu_btn_nosotrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_btn_nosotrosActionPerformed
        // TODO add your handling code here:
        Nosotros nosotros = new Nosotros();
        nosotros.setSize(720, 481);
        nosotros.setLocation(0, 0);

        Content.removeAll();
        Content.add(nosotros, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }//GEN-LAST:event_Menu_btn_nosotrosActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu("test").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content;
    private javax.swing.JButton Menu_btn_calculo;
    private javax.swing.JButton Menu_btn_cerrarsesion;
    private javax.swing.JButton Menu_btn_inicio;
    private javax.swing.JButton Menu_btn_nosotros;
    private javax.swing.JButton Menu_btn_perfil;
    private javax.swing.JLabel Menu_fondo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}