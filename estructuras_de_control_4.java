import java.util.Scanner;

public class estructuras_de_control_4 {
    public static void main (String[]args){
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase que empiece con 'A' ");
        do {
            frase = leer.nextLine();
            
            if(frase.toUpperCase().substring(0,1).equals("A") ){
                System.out.println("Correcto");
                break;
            }
            else{
                System.out.println("Incorrecto ingrese otra frase");
            }
            
        } while (frase.substring(1)!="A");

    }
}
