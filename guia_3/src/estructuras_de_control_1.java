import java.util.Scanner;
public class estructuras_de_control_1 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int numero = leer.nextInt();
        if (numero % 2 == 0){
            System.out.println("El numero "+numero+" es par.");
        }
        else{
            System.out.println("El numero "+numero+" es impar.");
        }
    }
}
