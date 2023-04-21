import java.util.Scanner;

public class extra_8 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n;
        int pares=0;
        int impares=0;
        do {
            System.out.println("Ingrese numero a evaluar");
            n=leer.nextInt();
            if (n%2==0) {
                pares++;
            } else {
                impares++;
            }
            
        } while (n%5!=0);
        System.out.println("pares "+pares+" impares "+impares);
    }
}
