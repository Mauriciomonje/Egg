import java.util.Scanner;
public class estructuras_de_control_6 {
    public static void main(String[]args) throws Exception{
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int n1=leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int n2=leer.nextInt();
        int condicion=0;
        System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija opcion:...");
        do {
            
            condicion=leer.nextInt();
            switch (condicion) {
                case 1:
                    System.out.println(n1+" + "+n2+"="+(n1+n2));
                    break;
                case 2:
                    System.out.println(n1+" - "+n2+"="+(n1-n2));
                    break;
                case 3:
                    System.out.println(n1+" X "+n2+"="+(n1*n2));
                    break;
                case 4:
                    System.out.println(n1+" / "+n2+"="+(n1/n2));
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        } while (condicion!=5);

    }
}
