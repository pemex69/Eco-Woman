
import javax.swing.*;
import java.io.Serializable;
import sources.ResultadosEW;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;
import javax.lang.model.element.Element;

/**
 *
 * @author que
 */
public class PerfilEW implements Serializable {

    private static final long serialVersionUID = 1L;

    //formData
    private String marca, tipo_flujo, nombre;
    private int dias_sangrado, toallas_diarias;
    private double salario;

    PerfilEW() {
    }

    ;

    PerfilEW(String marca, int dias_sangrado, int toallas_diarias, String tipo_flujo, double salario) {
        this.marca = marca;
        this.dias_sangrado = dias_sangrado;
        this.toallas_diarias = toallas_diarias;
        this.tipo_flujo = tipo_flujo;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Dias de sangrado: " + dias_sangrado + ", Toallas diarias: " + toallas_diarias + ", Marca de toallas: " + marca + ", Tipo de flujo: " + tipo_flujo + ", Salario Mensual Neto: " + salario;
    }

    
    
    
    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getDias_sangrado() {
        return dias_sangrado;
    }

    public void setDias_sangrado(int diasDeSangrado) {
        this.dias_sangrado = diasDeSangrado;
    }

    public int getToallas_diarias() {
        return toallas_diarias;
    }

    public void setToallas_diarias(int toallas_diarias) {
        this.toallas_diarias = toallas_diarias;
    }

    public String getTipo_flujo() {
        return tipo_flujo;
    }

    public void setTipo_flujo(String tipo_flujo) {
        this.tipo_flujo = tipo_flujo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ResultadosEW calculoResultado() {
        double gasto_toallas = 0, ingresos_mensuales, huella_carbono = 0, sol;        
        ingresos_mensuales = salario;
        //S0LVE
        
        toallas_diarias *= dias_sangrado;
        if ("Saba".equals(marca)) {
            huella_carbono = toallas_diarias * 0.0261261f;
            if ("Abundante".equals(tipo_flujo)) {
                gasto_toallas = toallas_diarias * 2.15;
            } else if ("Regular".equals(tipo_flujo)) {
                gasto_toallas = toallas_diarias * 3.54;
            } else if ("Irregular".equals(tipo_flujo)) {
                gasto_toallas = toallas_diarias * 2;
            } else {
                System.out.println("NO SE ELIGIO NINGUN TIPO DE FLUJO . . .");
            }
        } else if ("Kotex".equals(marca)) {
            huella_carbono = toallas_diarias * 0.02485f;
            if ("Abundante".equals(tipo_flujo)) {
                gasto_toallas = toallas_diarias * 2.08;
            } else if ("Regular".equals(tipo_flujo)) {
                gasto_toallas = toallas_diarias * 3.85;
            } else if ("Irregular".equals(tipo_flujo)) {
                gasto_toallas = toallas_diarias * 1.5;
            } else {
                System.out.println("NO SE ELIGIO NINGUN TIPO DE FLUJO . . .");
            }
        } else if ("Naturellla".equals(marca)) {
            huella_carbono = toallas_diarias * 0.02776431f;
            if ("Abundante".equals(tipo_flujo)) {
                gasto_toallas = toallas_diarias * 3.12;
            } else if ("Regular".equals(tipo_flujo)) {
                gasto_toallas = toallas_diarias * 1.63;
            } else if ("Irregular".equals(tipo_flujo)) {
                gasto_toallas = toallas_diarias * 2.3;
            } else {
                System.out.println("NO SE ELIGIO NINGUN TIPO DE FLUJO . . .");
            }
        } else {
            System.out.println("NO SE ELIGIO NINGUNA MARCA . . .");
        }

        
        if (salario == 0) {
            ingresos_mensuales = 5258.1;
        }
        sol = (gasto_toallas * 100) / salario;
        double roundedtoallas = (double) Math.round(gasto_toallas * 100.0000) / 100.0000;
        double roundedco2sol = (double) Math.round(huella_carbono * 100.0000) / 100.0000;
        double roundedsol = (double) Math.round(sol * 100.0000) / 100.0000;
        ResultadosEW resultado_final = new ResultadosEW();
        resultado_final.setCo2(roundedco2sol);
        resultado_final.setGasto_salario(roundedsol);
        resultado_final.setGasto_toallas(roundedtoallas);
        return resultado_final;
    }
}