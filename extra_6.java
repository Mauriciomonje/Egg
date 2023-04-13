import java.util.Scanner;

public class extra_6 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas a sensar");
        int n=leer.nextInt();
        double estatura=0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese estatura de la persona numero "+i);
            estatura+=leer.nextDouble();
        }
        System.out.println("La estatura promedio es de "+estatura/n);

    }
}
