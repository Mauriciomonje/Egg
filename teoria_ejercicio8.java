
import java.util.Scanner;

/*Escriba un programa que valide si una nota está entre 0 y 10,
sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.*/

public class teoria_ejercicio8 {

    public static void main(String[] args) {
    int nota;
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de la nota");
        nota = leer.nextInt();
        while(nota<0 || nota>10){
            System.out.println("Nota no válida, ingrese un valor nuevo");
            nota = leer.nextInt();
        }
        System.out.println("La nota que usted ingresó es "+nota);
    }
    
}
