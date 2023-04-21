import java.util.Scanner;

import javax.script.ScriptContext;

public class extra_14 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias");
        int n = leer.nextInt();
        int m;
        int promedio=0;
        int contador=0;
        for (int i = 1; i <=n; i++) {
            System.out.println("Ingrese la cantidad de hijos para la familia "+i);
            m=leer.nextInt();
            for (int j = 1; j<=m ; j++) {
                System.out.println("Ingrese la edad del hijo numero "+j);
                promedio+=leer.nextInt();
                contador++;
            }
            
        }
        System.out.println("cantidad de familias "+ n+" cantidad total de hijos "+contador+" Proemdio de edad de los hijos "+(promedio/contador));
    }
    
}
