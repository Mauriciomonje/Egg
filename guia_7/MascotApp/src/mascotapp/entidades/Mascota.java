
package mascotapp.entidades;


public class Mascota {
    public String nombre;
    public String apodo;
    public String tipo;//gato,perro,loro
    public String color;
    public int edad;
    public Boolean cola;
    public String raza;

    public Mascota() {
    }
    
    public Mascota(String nombre, String apodo) {
        this.nombre = nombre;
        this.apodo = apodo;
    }
    
}
