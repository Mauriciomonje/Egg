import java.util.Scanner;
public class estructuras_de_control_2 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        if (frase.equals("eureka")){
            System.out.println("Correcto");

        }
        else {
            System.out.println("Incorrecto");
        }
    }
}
