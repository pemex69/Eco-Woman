import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Utilidades {

    static String ARCHIVO_USR = "UsrDatos.txt";
    static String ARCHIVO_EW = "_Perfil.txt";
    static String ARCHIVO_SETTINGS = "Variables.txt";

    public static ArrayList<Usuario> ReadsUserFile() {
        try {
            FileInputStream fi = new FileInputStream(new File(ARCHIVO_USR));
            ObjectInputStream oi = new ObjectInputStream(fi);

            // Lee objetos
            ArrayList<Usuario> Leido = (ArrayList<Usuario>) oi.readObject();

            System.out.println("LEI DE ARCHIVO ESTO: " + Leido);

            oi.close();
            fi.close();

            return Leido;
        } catch (Exception e) {
            System.out.println("ERROR AL LEER, error: " + e);
            showMessageDialog(null, "Ocurrio un error al leer el archivo " + e.getLocalizedMessage());
        }
        //al vacio
        ArrayList<Usuario> nada = new ArrayList<>();
        System.out.println("Error al leer, no se pudo cargar el archivo, regresa 'nada'");
        return nada;
    }

    public static void SaveUserArr(ArrayList<Usuario> al) {
        try {
            System.out.println("GUARDANDO EL SIGUIENTE OBJETO: " + al);
            FileOutputStream f = new FileOutputStream(new File(ARCHIVO_USR));
            ObjectOutputStream o = new ObjectOutputStream(f);

            // Escribe el objeto en el archivo
            o.writeObject(al);

            o.close();
            f.close();
            System.out.println("OBJETO GUARDADO ");
        } catch (Exception notf) {
            System.out.println("ALGO SALIO MAL AL GUARDAR EL NUEVO AL, error: " + notf);
        }
    }

    public static boolean SaveNewUserToFile(Usuario pew) {
        try {
            ArrayList<Usuario> objetosEnArchivo = ReadsUserFile();
            if (objetosEnArchivo.isEmpty()) {
                objetosEnArchivo.add(pew);
            } else {
                for (int i = 0; i < objetosEnArchivo.size(); i++) {
                    if (objetosEnArchivo.get(i).getNombre().equals(pew.getNombre())) {
                        showMessageDialog(null, "El usuario '" + pew.getNombre() + "' ya existe, intenta con otro. ");
                        return false;
                    }
                }
                objetosEnArchivo.add(pew);
            }

            //pew == Perfil EcoWoman != PerfilEW
            System.out.println("GUARDANDO EL SIGUIENTE OBJETO: " + pew);
            FileOutputStream f = new FileOutputStream(new File(ARCHIVO_USR));
            ObjectOutputStream o = new ObjectOutputStream(f);

            // Escribe el objeto en el archivo
            o.writeObject(objetosEnArchivo);

            o.close();
            f.close();
            System.out.println("OBJETO GUARDADO ");
            return true;
        } catch (Exception e) {
            System.out.println("ERROR AL GUARDAR, error: " + e);
            return false;
        }
    }

    public static ArrayList<PerfilEW> ReadsDataFile(String nombre) {
        try {
            FileInputStream fi = new FileInputStream(new File(nombre + ARCHIVO_EW));
            ObjectInputStream oi = new ObjectInputStream(fi);

            // Read objects
            ArrayList<PerfilEW> Leido = (ArrayList<PerfilEW>) oi.readObject();

            System.out.println("LEI DE ARCHIVO ESTO: " + Leido);

            oi.close();
            fi.close();

            return Leido;
        } catch (Exception e) {
            System.out.println("ERROR AL LEER datos->>>>>>>>>>>>>>>>, error: " + e);
            //  showMessageDialog(null, "Ocurrio un error al leer el archivo " + e.getLocalizedMessage());
        }
        //al vacio
        ArrayList<PerfilEW> nada = new ArrayList<>();
        System.out.println("Error al leer, no se pudo cargar el archivo, regresa 'nada'");
        return nada;
    }

    public static boolean SaveDataToFile(PerfilEW pew, String nombre) {
        try {
            ArrayList<PerfilEW> objetosEnArchivo = ReadsDataFile(nombre);
            objetosEnArchivo.add(pew);
            //pew == Perfil EcoWoman != PerfilEW
            System.out.println("GUARDANDO EL SIGUIENTE OBJETO: " + objetosEnArchivo);
            FileOutputStream f = new FileOutputStream(new File(nombre + ARCHIVO_EW));
            ObjectOutputStream o = new ObjectOutputStream(f);

            // Escribe el objeto en el archivo
            o.writeObject(objetosEnArchivo);

            o.close();
            f.close();
            System.out.println("OBJETO GUARDADO EN TXT ");
            return true;
        } catch (Exception e) {
            System.out.println("ERROR AL GUARDAR, error: " + e);
            return false;
        }
    }

    public static ArrayList<PerfilEW> ReadsAdminDataFile() {
        try {
            FileInputStream fi = new FileInputStream(new File(ARCHIVO_SETTINGS));
            ObjectInputStream oi = new ObjectInputStream(fi);

            // Read objects
            ArrayList<PerfilEW> Leido = (ArrayList<PerfilEW>) oi.readObject();

            System.out.println("LEI DE ARCHIVO ESTO: " + Leido);

            oi.close();
            fi.close();

            return Leido;
        } catch (Exception e) {
            System.out.println("ERROR AL LEER datos->>>>>>>>>>>>>>>>, error: " + e);
            //  showMessageDialog(null, "Ocurrio un error al leer el archivo " + e.getLocalizedMessage());
        }
        //al vacio
        ArrayList<PerfilEW> nada = new ArrayList<>();
        System.out.println("Error al leer, no se pudo cargar el archivo, regresa 'nada'");
        return nada;
    }

    public static boolean SaveDataToAdminFile(PerfilEW pew) {
        try {
            ArrayList<PerfilEW> objetosEnArchivo = ReadsAdminDataFile();
            objetosEnArchivo.add(pew);
            //pew == Perfil EcoWoman != PerfilEW
            System.out.println("GUARDANDO DATOS DE CO2 ");
            FileOutputStream f = new FileOutputStream(new File(ARCHIVO_SETTINGS));
            ObjectOutputStream o = new ObjectOutputStream(f);

            // Escribe el objeto en el archivo
            o.writeObject(objetosEnArchivo);

            o.close();
            f.close();
            System.out.println("OBJETO GUARDADO EN TXT ");
            return true;
        } catch (Exception e) {
            System.out.println("ERROR AL GUARDAR, error: " + e);
            return false;
        }
    }

    public static void eliminarDatosCuenta(String archivo) {
        try {
            File fichero = new File(archivo);
            boolean status = fichero.delete();
            if (!status) {
                System.out.println("El archivo no existe y/o no se pudo eliminar el archivo");
            } else {
                System.out.println("Archivo eliminado . . . ");
            }
        } catch (Exception fnf) {
            System.out.println("No se encontro el archivo, error: " + fnf);
        }
    }
}