
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import static javax.swing.JOptionPane.showMessageDialog;
import java.util.*;
import sources.ResultadosEW;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ivan0
 */
public class Calculo extends javax.swing.JPanel {

    /**
     * Creates new form Calculo
     */
    public Calculo(String nombre) {
        initComponents();
        Utilidades util = new Utilidades();
        //CARGAR DE ARCHIVO DE TEXTO EL OBJETO DE PERFIL
        //MUESTRAS EN PANTALLA EL RESULTADO - MAPEANDO DE PerfilEW -> pb objetos de swing
        System.out.println("CARGANDO DATOS PARA CALCULO....");

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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelRes3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SalarioRes = new javax.swing.JLabel();
        labelRes1 = new javax.swing.JLabel();
        labelRes2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("PORCENTAJE MENSUAL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 210, 20));

        labelRes3.setText("RESULTADO 1");
        jPanel1.add(labelRes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 110, 20));

        jLabel3.setText("GASTO EN TOALLAS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 180, 20));

        SalarioRes.setText("salario");
        jPanel1.add(SalarioRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 200, 60));

        labelRes1.setText("RESULTADO 1");
        jPanel1.add(labelRes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 110, 20));

        labelRes2.setText("RESULTADO 1");
        jPanel1.add(labelRes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 110, 20));

        jLabel5.setText("HUELLA DE CARBONO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 200, 60));

        jLabel6.setText("$ pesos");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 200, 60));

        jLabel7.setText("g/CO2");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 200, 60));

        jLabel8.setText("% de un 100% ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 200, 60));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SalarioRes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelRes1;
    private javax.swing.JLabel labelRes2;
    private javax.swing.JLabel labelRes3;
    // End of variables declaration//GEN-END:variables
}