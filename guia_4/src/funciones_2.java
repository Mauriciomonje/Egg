import java.util.Scanner;
/*
 * Diseñe una función que pida el nombre y la edad de N personas
 *  e imprima los datos de las personas ingresadas por teclado e 
 * indique si son mayores o menores de edad. Después de cada persona,
 *  el programa debe preguntarle al usuario si quiere seguir mostrando personas y frenar 
 * cuando el usuario ingrese la palabra “No”.
 */
public class funciones_2 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String rta;
        int edad;
        boolean bandera,flag;
        String nombre;
        flag=true;
        do {
            System.out.println("Ingrese nombre");
            nombre=leer.nextLine();
            System.out.println("Ingrese edad");
            edad=leer.nextInt();
            evaluacion(edad, nombre);
            leer.nextLine();
            System.out.println("Si no tiene mas personas para evaluar ingrese 'no' otro caso ingrese cualquier letra");
            rta=leer.nextLine();
            rta=rta.toLowerCase();
            if(rta.equals("no")){
                flag=false;
            }
        } while (flag);
    }
    public static void evaluacion(int age,String n) {
        if (age>17) {
            System.out.println(n+" edad "+age+" es mayor de edad");
        } else {
            System.out.println(n+" edad "+age+" no es mayor de edad");
        }
    }
}
