import java.util.Scanner;

public class vector3 {
    public static void main(String[] args) {
        int[] numeros = {12, 345, 6, 7890, 12345, 67890};
        int[] contador = new int[6];

        for (int i = 0; i < contador.length; i++) {
            int aux=numeros[i];
            int digitos=0;
            while (aux!=0) {
                aux/=10;
                digitos++;
            }
            contador[digitos]++;
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("digitos "+ i +" cantidad "+ contador[i]);
        }
    }
}

