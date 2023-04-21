import java.util.Scanner;

public class extra_11 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n=leer.nextInt();
        int aux=n;
        int aux2=1;
        int contador=0;
        do {
            n/=10;
            contador++;
        } while ((n/10)>0);
         
        System.out.println("Cantidad de digitos "+(contador+1)+" ultimo digito "+aux%10);
    }
}
