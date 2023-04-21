import java.util.Scanner;

/*Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €*/

public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese la cantidad de euros a convertir");
        int euros=leer.nextInt();
        
        String operacion;
        System.out.println("Elija el tipo de moneda \n"
        +"yenes \n"
        +"dolares \n"
        +"libras"
        );
        operacion=leer.next();
        conversion(operacion,euros);

    }

    public static void conversion(String op, int euros) {
        switch (op) {
            case "dolares":
                System.out.println(euros*1.28611+" dolares");
                break;
        
            case "yenes":
                System.out.println(euros*129.852+" yenes");
                break;
        
            case "libras":
                System.out.println(euros*0.86+" libras");
                break;
        
            default:
                System.out.println("Ingrese una opcion valida");
                break;
        }
    }
}
