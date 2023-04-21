import java.util.Scanner;
public class estructuras_de_control_5 {
    public static void main(String[]args) throws Exception {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor final");
        int valor_final= leer.nextInt();
        int sumatoria=0;
        while (sumatoria<valor_final) {
            System.out.println("Ingrese un numero entero");
            sumatoria += leer.nextInt();
        }
        System.out.println("La sumatoria da como resultado "+sumatoria);
    }
}
