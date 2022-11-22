import java.io.Serializable;

public class Usuario implements Serializable{
    
    private String nombre, pass;
    
    
    Usuario() {
    }

    ;
    
    Usuario(String nombre, String pass) {
        this.nombre = nombre;
        this.pass = pass;
    }
 
    @Override
    public String toString() {
        return "Nombre_: " + nombre + " . . . ";
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}