import java.util.*;
import sources.ResultadosEW;

public class Calculo extends javax.swing.JPanel {

    String nombre;

    public Calculo(String nombre) {
        this.nombre = nombre;
        initComponents();
        Utilidades util = new Utilidades();
        //CARGAR DE ARCHIVO DE TEXTO EL OBJETO DE PERFIL
        //MUESTRAS EN PANTALLA EL RESULTADO - MAPEANDO DE PerfilEW -> pb objetos de swing
        System.out.println("CARGANDO DATOS PARA TABLA....");

        // cargar en memoria y actualizar a text fields datos del archivo serializado, si no hay archivo, no cargar nada 
        //  Perfil per = cargaDePerfil ()
        try {
            ArrayList<PerfilEW> objetosEnArchivo = util.ReadsDataFile(nombre);

            PerfilEW objetoEnArchivo = objetosEnArchivo.get(objetosEnArchivo.size() - 1);

            ResultadosEW res = objetoEnArchivo.calculoResultado();
            labelRes1.setText(String.valueOf(res.getCo2()));
            labelRes2.setText(String.valueOf(res.getGasto_toallas()));
            labelRes3.setText(String.valueOf(res.getGasto_salario()));
            if (objetoEnArchivo.getSalario() == 0) {
                SalarioRes.setText("5.258,1");
            } else {
                SalarioRes.setText(String.valueOf(objetoEnArchivo.getSalario()));
            }
        } catch (Exception r) {
            System.out.println("ERROR AL CARGAR, error: " + r);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        labelRes3 = new javax.swing.JLabel();
        SalarioRes = new javax.swing.JLabel();
        labelRes1 = new javax.swing.JLabel();
        labelRes2 = new javax.swing.JLabel();
        Calcular_btn_recomendaciones = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Calcular_img = new javax.swing.JLabel();
        Calcular_fondo = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelRes3.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        labelRes3.setText("RESULTADO 1");
        jPanel1.add(labelRes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 110, 30));

        SalarioRes.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        SalarioRes.setText("salario");
        jPanel1.add(SalarioRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 100, 50));

        labelRes1.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        labelRes1.setText("RESULTADO 1");
        jPanel1.add(labelRes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 130, 40));

        labelRes2.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        labelRes2.setText("RESULTADO 1");
        jPanel1.add(labelRes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 130, 30));

        Calcular_btn_recomendaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calcular_btn_recomendaciones.png"))); // NOI18N
        Calcular_btn_recomendaciones.setBorderPainted(false);
        Calcular_btn_recomendaciones.setContentAreaFilled(false);
        Calcular_btn_recomendaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calcular_btn_recomendacionesActionPerformed(evt);
            }
        });
        jPanel1.add(Calcular_btn_recomendaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calcular_ing_fondo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        Calcular_img.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Calcular_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calcular_img.png"))); // NOI18N
        jPanel1.add(Calcular_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        Calcular_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calcular_fondo.png"))); // NOI18N
        jPanel1.add(Calcular_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));
    }// </editor-fold>//GEN-END:initComponents

    private void Calcular_btn_recomendacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calcular_btn_recomendacionesActionPerformed
        // TODO add your handling code here:
        Tabla tabla = new Tabla(nombre);
        tabla.setVisible(true);
        tabla.setLocationRelativeTo(null);

    }//GEN-LAST:event_Calcular_btn_recomendacionesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular_btn_recomendaciones;
    private javax.swing.JLabel Calcular_fondo;
    private javax.swing.JLabel Calcular_img;
    private javax.swing.JLabel SalarioRes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelRes1;
    private javax.swing.JLabel labelRes2;
    private javax.swing.JLabel labelRes3;
    // End of variables declaration//GEN-END:variables
}