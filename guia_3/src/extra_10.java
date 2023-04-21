import java.util.Scanner;

public class extra_10 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Adivine el resultado de la multiplicacion.");
        int n1 = (int)(Math.random() * 10 + 1);
        int n2 = (int)(Math.random() * 10 + 1);
        int n;
        System.out.println(n1+" * "+n2);
        do {
            
            n=leer.nextInt();
            if (n==n1*n2) {
                System.out.println("Felicidades,adivinaste el resultado.");
            } else {
                System.out.println("Incorrecto");
            }
        } while (true);
    }
}
