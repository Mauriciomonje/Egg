import java.util.Scanner;
public class prueba {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

    	int opcion;

    	System.out.println("Ingrese una opción");

    	opcion = leer.nextInt();

    	switch (opcion) {
        	case 1:
           System.out.println("Esta línea de código se ejecuta si opcion = 1");
           break;

        	case 2:
           System.out.println("Esta línea de código se ejecuta si opcion = 2");
            break;

        	default:
           System.out.println("El valor ingresado en la variable opcion es diferente" + "a todos los casos analizados por el switch");
    	}
}

    }

