import java.util.Scanner;

public class extra_2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int A=1;
        int B=2;
        int C=3;
        int D=4;
        int aux;
        System.out.println(A+" "+B+" "+C+" "+D);
        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
        System.out.println(A+" "+B+" "+C+" "+D);

    }
}
