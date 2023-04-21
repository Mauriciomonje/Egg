import java.util.Scanner;

public class extra_9 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el dividendo");
        int n1=leer.nextInt();
        System.out.println("Ingrese el divisor");
        int n2=leer.nextInt();
        int resultado=0;
        while (n1>n2) {
            n1-=n2;
            resultado++;
        }
        System.out.println("resultado "+resultado);
    }
    
}
