import java.util.Scanner;
public class estructuras_de_control_3 {
public static void main(String[]args) throws Exception {
    Scanner leer = new Scanner(System.in);
    String frase;
    System.out.println("Ingrese una frase de 8 caracteres");
    do {
        frase = leer.nextLine();
        if (frase.length()==8) {
            System.out.println("Correcto");
            break;
        }
        else{
            System.out.println("Incorrecto Ingrese otra frase ");
        }
    } while (frase.length()!=8);
}
}
