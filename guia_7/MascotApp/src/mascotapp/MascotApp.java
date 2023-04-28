package mascotapp;


import java.util.Scanner;
import mascotapp.entidades.Perro;
import mascotapp.entidades.Mascota;
import mascotapp.entidades.Usuario;

public class MascotApp {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Perro laika = new Perro();
        Mascota m1 = new Mascota();
        Usuario u1 = new Usuario("Mauricio", "Monje");
        Usuario u2 = new Usuario(leer.next(), leer.next(), 29, "31/10/1993", "Argentina");
        //asignamos a laika / el perro creado
        //por ahora laika es como un perro fantasma por que los atributos aun
        //no tienen valores asignados.
        laika.apodo = "cucha";
        laika.nombre = "Laika";
        laika.raza = "obejero";
        laika.edad = 10;
        laika.tipo = "perra";
        //-----------------------------------------------------------
        m1.nombre = "Laika";
        m1.raza = "obejero";
        m1.edad = 10;
        m1.color = "bicolor";
        m1.tipo = "perro";
        m1.cola = true;
        m1.apodo = "cucha";
        //Para evitar hacer todo esto se usan los constructores en el archivo class

        System.out.println(m1.nombre + " \n"
                + m1.apodo + " \n"
                + m1.raza + " \n"
                + m1.edad + " \n"
                + m1.tipo + " \n"
                + m1.cola + " \n"
                + m1.color + " \n");
                
        System.out.println(""
                + u2.getNombre() + " \n" // Utilizo get para mostrar el objeto
                + u2.apellido + " \n"
                + u2.dni + " \n"
                + u2.fecha_nacimiento + " \n"
                + u2.pais + " \n"
        );
    }

}
