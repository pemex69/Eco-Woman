
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author ivan0
 */
public class Perfil extends javax.swing.JPanel {

    /**
     * Lee de el archivo de texto y carga las elecciones del usuario
     */
    Utilidades util = new Utilidades();
    private String nombre;
    private Menu menuPadre;

    public Perfil(String nombre, Menu menuPadre) {
        this.nombre = nombre;
        this.menuPadre = menuPadre;
        initComponents();

        System.out.println("CARGANDO PERFIL....");

        // cargar en memoria y actualizar a text fields datos del archivo serializado, si no hay archivo, no cargar nada 
        //  Perfil per = cargaDePerfil ()
        System.out.println("CARGANDO PERFIL . . .");
        try {
            ArrayList<PerfilEW> objetosEnArchivo = util.ReadsDataFile(nombre);
            if (!objetosEnArchivo.isEmpty()) {
                PerfilEW objetoEnArchivo = new PerfilEW();
                objetoEnArchivo = objetosEnArchivo.get(objetosEnArchivo.size() - 1);
                Perfil_sp_sangrado.setValue(objetoEnArchivo.getDias_sangrado());
                Perfil_sp_toallas.setValue(objetoEnArchivo.getToallas_diarias());
                Perfil_cb_marca.setSelectedItem(objetoEnArchivo.getMarca());
                Perfil_cb_tipo.setSelectedItem(objetoEnArchivo.getTipo_flujo());
                Perfil_tf_salario.setText(String.valueOf(objetoEnArchivo.getSalario()));
            }

        } catch (Exception r) {
            System.out.println("ERROR AL CARGAR, error: " + r);
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
        jButton1 = new javax.swing.JButton();
        Perfil_sp_toallas = new javax.swing.JSpinner();
        Perfil_sp_sangrado = new javax.swing.JSpinner();
        Perfil_cb_tipo = new javax.swing.JComboBox<String>();
        Perfil_cb_marca = new javax.swing.JComboBox<String>();
        Perfil_tf_salario = new javax.swing.JTextField();
        Perfil_btn_borrar = new javax.swing.JButton();
        Perfil_btn_guardar = new javax.swing.JButton();
        Perfil_img_fondo = new javax.swing.JLabel();
        Perfil_fondo = new javax.swing.JLabel();
        Perfil_btn_guardar1 = new javax.swing.JButton();
        Perfil_btn_guardar2 = new javax.swing.JButton();
        Perfil_btn_guardar3 = new javax.swing.JButton();
        Perfil_btn_borrar1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Historial");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 100, 30));

        Perfil_sp_toallas.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        Perfil_sp_toallas.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jPanel1.add(Perfil_sp_toallas, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 60, -1));

        Perfil_sp_sangrado.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        Perfil_sp_sangrado.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        jPanel1.add(Perfil_sp_sangrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 60, -1));

        Perfil_cb_tipo.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "-", "Abundante", "Regular", "Irregular" }));
        Perfil_cb_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Perfil_cb_tipoActionPerformed(evt);
            }
        });
        jPanel1.add(Perfil_cb_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 160, -1));

        Perfil_cb_marca.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "-", "Saba", "Kotex", "Naturellla" }));
        jPanel1.add(Perfil_cb_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 160, -1));

        Perfil_tf_salario.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        Perfil_tf_salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Perfil_tf_salarioActionPerformed(evt);
            }
        });
        Perfil_tf_salario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Perfil_tf_salarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Perfil_tf_salarioKeyTyped(evt);
            }
        });
        jPanel1.add(Perfil_tf_salario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 200, -1));

        Perfil_btn_borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Perfil_btn_borrar.png"))); // NOI18N
        Perfil_btn_borrar.setBorderPainted(false);
        Perfil_btn_borrar.setContentAreaFilled(false);
        Perfil_btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Perfil_btn_borrarActionPerformed(evt);
            }
        });
        jPanel1.add(Perfil_btn_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        Perfil_btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Perfil_btn_guardar.png"))); // NOI18N
        Perfil_btn_guardar.setBorderPainted(false);
        Perfil_btn_guardar.setContentAreaFilled(false);
        Perfil_btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Perfil_btn_guardarActionPerformed(evt);
            }
        });
        jPanel1.add(Perfil_btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 250, -1));

        Perfil_img_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Perfil_img_fondo.png"))); // NOI18N
        jPanel1.add(Perfil_img_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        Perfil_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Perfil_fondo.png"))); // NOI18N
        jPanel1.add(Perfil_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        Perfil_btn_guardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Perfil_btn_guardar.png"))); // NOI18N
        Perfil_btn_guardar1.setBorderPainted(false);
        Perfil_btn_guardar1.setContentAreaFilled(false);
        Perfil_btn_guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Perfil_btn_guardar1ActionPerformed(evt);
            }
        });
        jPanel1.add(Perfil_btn_guardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 250, -1));

        Perfil_btn_guardar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Perfil_btn_guardar.png"))); // NOI18N
        Perfil_btn_guardar2.setBorderPainted(false);
        Perfil_btn_guardar2.setContentAreaFilled(false);
        Perfil_btn_guardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Perfil_btn_guardar2ActionPerformed(evt);
            }
        });
        jPanel1.add(Perfil_btn_guardar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 250, -1));

        Perfil_btn_guardar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Perfil_btn_guardar.png"))); // NOI18N
        Perfil_btn_guardar3.setBorderPainted(false);
        Perfil_btn_guardar3.setContentAreaFilled(false);
        Perfil_btn_guardar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Perfil_btn_guardar3ActionPerformed(evt);
            }
        });
        jPanel1.add(Perfil_btn_guardar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 250, -1));

        Perfil_btn_borrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Perfil_btn_borrar.png"))); // NOI18N
        Perfil_btn_borrar1.setBorderPainted(false);
        Perfil_btn_borrar1.setContentAreaFilled(false);
        Perfil_btn_borrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Perfil_btn_borrar1ActionPerformed(evt);
            }
        });
        jPanel1.add(Perfil_btn_borrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));
    }// </editor-fold>//GEN-END:initComponents

    private void Perfil_btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Perfil_btn_guardarActionPerformed
        // Cuando se presiona el boton de guardar 

        System.out.println("GUARDANDO DATOS. . .\n");

        int Dias_Sangrado = (int) Perfil_sp_sangrado.getValue();
        int Toallas_diarias = (int) Perfil_sp_toallas.getValue();
        String marca = Perfil_cb_marca.getSelectedItem().toString();
        String tipo_flujo = Perfil_cb_tipo.getSelectedItem().toString();
        String salario = Perfil_tf_salario.getText();
        ArrayList<PerfilEW> objetosEnArchivo = util.ReadsDataFile(nombre);

        // GUARDAR EN ARCHIVO UN OBJETO SERIALIZADO 
        PerfilEW formData = new PerfilEW(marca, Dias_Sangrado, Toallas_diarias, tipo_flujo, Double.parseDouble(salario));
        boolean seguir = util.SaveDataToFile(formData, nombre);
        System.out.println("OBJETO GUARDADO ");

    }//GEN-LAST:event_Perfil_btn_guardarActionPerformed

    private void Perfil_cb_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Perfil_cb_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Perfil_cb_tipoActionPerformed

    private void Perfil_tf_salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Perfil_tf_salarioActionPerformed
    }//GEN-LAST:event_Perfil_tf_salarioActionPerformed

    private void Perfil_tf_salarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Perfil_tf_salarioKeyTyped


    }//GEN-LAST:event_Perfil_tf_salarioKeyTyped

    private void Perfil_tf_salarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Perfil_tf_salarioKeyReleased
        String texto_actual = Perfil_tf_salario.getText();

        try {

            Double.parseDouble(texto_actual);

        } catch (Exception e) {
            System.out.println("ERROR AL PARSEAR UNO O MAS NUMEROS, error: " + e);

            showMessageDialog(null, "Ingresa un dato numérico ");
            Perfil_tf_salario.setText(texto_actual.substring(0, texto_actual.length() - 1));
        }
    }//GEN-LAST:event_Perfil_tf_salarioKeyReleased

    private void Perfil_btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Perfil_btn_borrarActionPerformed
        String nombre_archivo = nombre + "_Perfil.txt";
        util.eliminarDatosCuenta(nombre_archivo);
        //Borrar Usuario
        boolean seguir = false;
        ArrayList<Usuario> objetosEnArchivo = util.ReadsUserFile();

        for (int i = 0; i < objetosEnArchivo.size(); i++) {
            if (objetosEnArchivo.get(i).getNombre().equals(nombre)) {
                System.out.println("Objeto encontrado: " + objetosEnArchivo.get(i));
                objetosEnArchivo.remove(i);
                seguir = true;
                break;
            }
        }
        util.SaveUserArr(objetosEnArchivo);
        System.out.println("Objetos en archivo: " + objetosEnArchivo);

        if (seguir) {
            showMessageDialog(null, "Se ha borrado su cuenta exitosamente '" + nombre + "' !");
            Index index = new Index();
            index.setVisible(true);
            index.setLocationRelativeTo(null);
            this.menuPadre.dispose();

        }

    }//GEN-LAST:event_Perfil_btn_borrarActionPerformed

    private void Perfil_btn_guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Perfil_btn_guardar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Perfil_btn_guardar1ActionPerformed

    private void Perfil_btn_guardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Perfil_btn_guardar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Perfil_btn_guardar2ActionPerformed

    private void Perfil_btn_guardar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Perfil_btn_guardar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Perfil_btn_guardar3ActionPerformed

    private void Perfil_btn_borrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Perfil_btn_borrar1ActionPerformed

    }//GEN-LAST:event_Perfil_btn_borrar1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        ArrayList<PerfilEW> objetosEnArchivo = util.ReadsDataFile(nombre);
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        for (int i = 0; i < objetosEnArchivo.size(); i++) {
            PerfilEW datosActual = objetosEnArchivo.get(i);
            sb.append("\n> Perfil ");
            sb.append(i + 1);
            sb.append("\n");
            sb.append("Dias Sangrado: ");
            sb.append(datosActual.getDias_sangrado());
            sb.append("\n");
            sb.append("Toallas diarias: ");
            sb.append(datosActual.getToallas_diarias());
            sb.append("\n");
            sb.append("Marca de toallas de preferencia: ");
            sb.append(datosActual.getMarca());
            sb.append("\n");
            sb.append("Tipo de flujo: ");
            sb.append(datosActual.getTipo_flujo());
            sb.append("\n");
            sb.append("Salario mensual Neto: ");
            if (datosActual.getSalario() == 0) {
                sb.append("0, se toma en cuenta SMI Mon local en México ($5186.1)");
            } else {

                sb.append(datosActual.getSalario());
            }
            sb.append("\n");
        }
        showMessageDialog(null, sb.toString());
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Perfil_btn_borrar;
    private javax.swing.JButton Perfil_btn_borrar1;
    private javax.swing.JButton Perfil_btn_guardar;
    private javax.swing.JButton Perfil_btn_guardar1;
    private javax.swing.JButton Perfil_btn_guardar2;
    private javax.swing.JButton Perfil_btn_guardar3;
    private javax.swing.JComboBox<String> Perfil_cb_marca;
    private javax.swing.JComboBox<String> Perfil_cb_tipo;
    private javax.swing.JLabel Perfil_fondo;
    private javax.swing.JLabel Perfil_img_fondo;
    private javax.swing.JSpinner Perfil_sp_sangrado;
    private javax.swing.JSpinner Perfil_sp_toallas;
    private javax.swing.JTextField Perfil_tf_salario;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
