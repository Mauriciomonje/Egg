import java.util.Scanner;

public class extra_3 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra=leer.nextLine();
        letra.toLowerCase();
        boolean bandera= false;
        if (letra.equalsIgnoreCase("a")) {
            System.out.println("La letra es una vocal");
            bandera=true;
        }
        
        if (letra.equalsIgnoreCase("e")) {
            System.out.println("La letra es una vocal");
            bandera=true;
        }
        
        if (letra.equalsIgnoreCase("i")) {
            System.out.println("La letra es una vocal");
            bandera=true;
        }
        
        if (letra.equalsIgnoreCase("o")) {
            System.out.println("La letra es una vocal");
            bandera=true;
        }
        
        if (letra.equalsIgnoreCase("u")) {
            System.out.println("La letra es una vocal");
            bandera=true;
        }
        if (bandera==false) {
            System.out.println("La letra no es una vocal");
        }
        
    }
}
