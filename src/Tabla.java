import java.util.ArrayList;
import sources.ResultadosEW;

public class Tabla extends javax.swing.JFrame {

    Utilidades util = new Utilidades();
    String nombre;

    public Tabla(String nombre) {
        this.nombre = nombre;
        initComponents();
        this.setTitle("Eco-Woman");
        try {
            ArrayList<PerfilEW> objetosEnArchivo = util.ReadsDataFile(nombre);

            PerfilEW objetoEnArchivo = objetosEnArchivo.get(objetosEnArchivo.size() - 1);

            ResultadosEW res = objetoEnArchivo.calculoResultado();
            labelRes1.setText(String.valueOf(res.getCo2()));
            labelRes2.setText(String.valueOf(res.getGasto_toallas()));
            if (res.getGasto_salario() == 0) {
                labelRes3.setText(String.valueOf(res.getGasto_salario()));
            } else {

                labelRes3.setText(String.valueOf(res.getGasto_salario()));
            }
            double per_esponja = 1560 / 5258.1;
            double per_toallaTela = 750 / 5258.1;
            double per_copaMenstrual = 651 / 5258.1;

            if (objetoEnArchivo.getSalario() != 0) {
                per_esponja = 1560 / objetoEnArchivo.getSalario();
                per_toallaTela = 750 / objetoEnArchivo.getSalario();
                per_copaMenstrual = 651 / objetoEnArchivo.getSalario();
            }
            labelRes4.setText(String.valueOf(per_esponja));
            labelRes5.setText(String.valueOf(per_toallaTela));
            labelRes6.setText(String.valueOf(per_copaMenstrual));

        } catch (Exception r) {
            System.out.println("ERROR AL CARGAR, error: " + r);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelRes6 = new javax.swing.JLabel();
        labelRes5 = new javax.swing.JLabel();
        labelRes4 = new javax.swing.JLabel();
        labelRes1 = new javax.swing.JLabel();
        labelRes2 = new javax.swing.JLabel();
        labelRes3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Decoracion = new javax.swing.JLabel();
        Decoracion1 = new javax.swing.JLabel();
        Decoracion4 = new javax.swing.JLabel();
        Decoracion3 = new javax.swing.JLabel();
        Decoracion2 = new javax.swing.JLabel();
        Decoracion5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelRes6.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        labelRes6.setText("RESULTADO 1");
        jPanel1.add(labelRes6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 90, 120, 30));

        labelRes5.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        labelRes5.setText("RESULTADO 1");
        jPanel1.add(labelRes5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, 120, 30));

        labelRes4.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        labelRes4.setText("RESULTADO 1");
        jPanel1.add(labelRes4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 120, 30));

        labelRes1.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        labelRes1.setText("RESULTADO 1");
        jPanel1.add(labelRes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 120, 20));

        labelRes2.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        labelRes2.setText("RESULTADO 1");
        jPanel1.add(labelRes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 130, 30));

        labelRes3.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        labelRes3.setText("RESULTADO 1");
        jPanel1.add(labelRes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 120, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Huella de Carbono  g/CO2", "", "0.029 g/CO2", "0.023 g/CO2", "0.30  g/CO2"},
                {"Gasto por Consumo", null, "$??15.6", "$ 7.5", "$ 6.51"},
                {"Porcentaje de Gasto (Salario)", "", "", null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "", "Perfil", "Esponja Marina Menstrual", "Tollas Femeninas de Tela", "Copa Menstrual"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 1120, 80));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tarea_regresar.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tarea_img.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        Decoracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Crear_decoracion.png"))); // NOI18N
        jPanel1.add(Decoracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, -1, -1));

        Decoracion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Crear_decoracion.png"))); // NOI18N
        jPanel1.add(Decoracion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 320, -1, -1));

        Decoracion4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Crear_decoracion.png"))); // NOI18N
        jPanel1.add(Decoracion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -14, -1, 140));

        Decoracion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Crear_decoracion.png"))); // NOI18N
        jPanel1.add(Decoracion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, -30, -1, -1));

        Decoracion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Crear_decoracion.png"))); // NOI18N
        jPanel1.add(Decoracion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 320, -1, -1));

        Decoracion5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Crear_decoracion.png"))); // NOI18N
        jPanel1.add(Decoracion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
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
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla("test").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Decoracion;
    private javax.swing.JLabel Decoracion1;
    private javax.swing.JLabel Decoracion2;
    private javax.swing.JLabel Decoracion3;
    private javax.swing.JLabel Decoracion4;
    private javax.swing.JLabel Decoracion5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelRes1;
    private javax.swing.JLabel labelRes2;
    private javax.swing.JLabel labelRes3;
    private javax.swing.JLabel labelRes4;
    private javax.swing.JLabel labelRes5;
    private javax.swing.JLabel labelRes6;
    // End of variables declaration//GEN-END:variables
}