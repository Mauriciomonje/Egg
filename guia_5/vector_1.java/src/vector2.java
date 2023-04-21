import java.util.Scanner;

public class vector2 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la dimension del vector");
        int n=leer.nextInt();
        int[] vector=new int[n];
        int num;
        int contador=0;
        for (int i = 0; i < n; i++) {
            vector[i]= (int) (Math.random()*10)+1;
        }
        
        System.out.println("Ingrese el numero que quiere buscar");
        num=leer.nextInt();
        for (int i = 0; i < n; i++) {
            if (vector[i]==num) {
                contador++;
                System.out.println("Se encontro en la posicion "+i+" se repite " +contador);
            }
        }
        if (contador==0) {
            System.out.println("No se encontro el numero solicitado");
        }
    }
    public static void buscar(int vector) {
        
    }
}
