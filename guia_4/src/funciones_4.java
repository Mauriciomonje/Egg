import java.util.Scanner;

public class funciones_4 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese numero a evaluar");
        int n = leer.nextInt();
        boolean bandera= primo(n);
        
        System.out.println(n+" "+bandera);
        
    }
    public static boolean primo(int n) {
        boolean es_primo;
        int contador=0;
        for (int i = 1; i <= n; i++) {
            if (n%i==0) {
                contador++;
            }
        }
        if (contador==2) {
            es_primo=true;
        } else {
            es_primo=false;
        }
        return es_primo;
    }
}
