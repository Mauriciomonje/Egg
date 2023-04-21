import java.util.Scanner;

import javax.tools.ToolProvider;

public class extra_java13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalerea");
        int tope=leer.nextInt();
        for (int i = 1; i <= tope; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
                
            }
            System.out.println("");
        }
    }
}
