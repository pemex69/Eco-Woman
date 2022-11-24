
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Datos extends JFrame implements ActionListener, ItemListener {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Mismo que perfil, pues es el mismo form
    Utilidades util = new Utilidades();

    public Datos(String nombre) {
        this.nombre = nombre;
        initComponents();

        this.setTitle("Eco-Woman");
        this.setLocationRelativeTo(null);
        Datos_tf_salario.setText("0");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Datos_cb_tipo = new javax.swing.JComboBox<String>();
        Perfil_cb_marca = new javax.swing.JComboBox<String>();
        Datos_sp_toallas = new javax.swing.JSpinner();
        Datos_sp_sangrado = new javax.swing.JSpinner();
        Datos_tf_salario = new javax.swing.JTextField();
        Datos_btn_guardar = new javax.swing.JButton();
        Datos_img_perfil = new javax.swing.JLabel();
        Datos_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Datos_cb_tipo.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        Datos_cb_tipo.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Abundante", "Regular", "Irregular" }));
        jPanel1.add(Datos_cb_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 160, -1));

        Perfil_cb_marca.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        Perfil_cb_marca.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Saba", "Kotex", "Naturella" }));
        jPanel1.add(Perfil_cb_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 160, -1));

        Datos_sp_toallas.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        Datos_sp_toallas.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jPanel1.add(Datos_sp_toallas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 60, -1));

        Datos_sp_sangrado.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        Datos_sp_sangrado.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        jPanel1.add(Datos_sp_sangrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 60, -1));

        Datos_tf_salario.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jPanel1.add(Datos_tf_salario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 200, -1));

        Datos_btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Datos_btn_guardar.png"))); // NOI18N
        Datos_btn_guardar.setBorderPainted(false);
        Datos_btn_guardar.setContentAreaFilled(false);
        Datos_btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Datos_btn_guardarActionPerformed(evt);
            }
        });
        jPanel1.add(Datos_btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 250, -1));

        Datos_img_perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Datos_img_perfil.png"))); // NOI18N
        jPanel1.add(Datos_img_perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        Datos_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Datos_fondo.png"))); // NOI18N
        jPanel1.add(Datos_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Datos_btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Datos_btn_guardarActionPerformed
        // TODO add your handling code here:
        try {
            int dias_sangrado = (int) Datos_sp_sangrado.getValue();
            int toallas_diarias = (int) Datos_sp_toallas.getValue();
            String marca = Perfil_cb_marca.getSelectedItem().toString();
            String tipo_flujo = Datos_cb_tipo.getSelectedItem().toString();
            String salario = Datos_tf_salario.getText();
            //GUARDAR EN ARCHIVO OBJETO SERIALIZADO
            PerfilEW NuevoUsuario = new PerfilEW(marca, dias_sangrado, toallas_diarias, tipo_flujo, Double.parseDouble(salario));
            boolean seguir = util.SaveDataToFile(NuevoUsuario, nombre);
            System.out.println("OBJETO GUARDADO ");

            if (seguir) {
                Menu menu = new Menu(nombre);
                menu.setVisible(true);
                menu.setLocationRelativeTo(null);
                this.setVisible(false);
            }

        } catch (NumberFormatException format) {
            showMessageDialog(null, "Ingresa un valor válido en 'Salario Mensual Neto' por favor. ");
        }
    }//GEN-LAST:event_Datos_btn_guardarActionPerformed

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
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Datos("test").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Datos_btn_guardar;
    private javax.swing.JComboBox<String> Datos_cb_tipo;
    private javax.swing.JLabel Datos_fondo;
    private javax.swing.JLabel Datos_img_perfil;
    private javax.swing.JSpinner Datos_sp_sangrado;
    private javax.swing.JSpinner Datos_sp_toallas;
    private javax.swing.JTextField Datos_tf_salario;
    private javax.swing.JComboBox<String> Perfil_cb_marca;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("ALGO SALIO MAL, error: " + e);
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        throw new UnsupportedOperationException("ALGO SALIO MAL, error: " + ie); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
