import java.util.Scanner;
/*
 * Crea una aplicación que le pida dos números al usuario y este pueda 
 * elegir entre sumar, restar, multiplicar y dividir. La aplicación debe 
 * tener una función para cada operación matemática y deben devolver sus 
 * resultados para imprimirlos en el main. 
 */
public class funciones_1 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int eleccion;
        int resultado;
        System.out.println("Ingrese los 2 numeros a evaluar");
        int n1=leer.nextInt();
        int n2=leer.nextInt();
        double resultado2;
        System.out.println("MENU \n"
        +"1_Sumar \n"
        +"2_Restar \n"
        +"3_Multiplicar \n"
        +"4_Dividir \n"
        +"5 Salir");
        do {
            System.out.println("Ingrese opcion...");
            eleccion=leer.nextInt();
            switch (eleccion) {
                case 1:
                    System.out.println("Ingrese el numero 1 e ingrese el numero 2 ");
                    resultado= sumar(n1, n2);
                    System.out.println(n1+"+"+n2+"="+resultado);
                    break;
            
                case 2:
                    System.out.println("Ingrese el numero 1 e ingrese el numero 2 ");
                    resultado= restar(n1, n2);
                    System.out.println(n1+"-"+n2+"="+resultado);
                    break;
            
                case 3:
                    System.out.println("Ingrese el numero 1 e ingrese el numero 2 ");
                    resultado= multiplicar(n1, n2);
                    System.out.println(n1+"*"+n2+"="+resultado);
                    break;
            
                case 4:
                    System.out.println("Ingrese el numero 1 e ingrese el numero 2 ");
                    resultado2= dividir(n1, n2);
                    System.out.println(n1+"/"+n2+"="+resultado2);
                    break;
                case 5:
                    System.out.println("Gracias por usar esta App.");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
            
        } while (eleccion!=5);
    }
    public static int sumar(int n1, int n2) {
        int suma;
        suma= n1+n2;
        return suma;
    }
    public static int restar(int n1, int n2) {
        int resta;
        resta= n1-n2;
        return resta;
    }
    public static int multiplicar(int n1, int n2) {
        int multiplica;
        multiplica= n1*n2;
        return multiplica;
    }
    public static double dividir(int n1, int n2) {
        double divide;
        divide= (float) n1/n2;
        return divide;
    }
    
}