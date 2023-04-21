import java.util.Scanner;

/*Realice un programa que compruebe si una matriz dada es
 antisimétrica. Se dice que una matriz A es antisimétrica
  cuando ésta es igual a su propia traspuesta, pero cambiada
   de signo. Es decir, A es antisimétrica si A = -AT. La matriz
    traspuesta de una matriz A se denota por AT y se obtiene cambiando
     sus filas por columnas (o viceversa).*/
public class vector5 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int [][] matrizA = new int [3][3];
        int [][] matrizB = new int [3][3];
        boolean bandera=true;
        //Matriz A
        matrizA[0][0]=0;
        matrizA[0][1]=-2;
        matrizA[0][2]=4;
        matrizA[1][0]=2;
        matrizA[1][1]=0;
        matrizA[1][2]=2;
        matrizA[2][0]=-4;
        matrizA[2][1]=-2;
        matrizA[2][2]=0;
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                System.out.print(" ["+matrizA[i][j]+"] ");
            }
            System.out.println();
        }
        System.out.println();
        //Matriz B
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                matrizB[j][i]=matrizA[i][j]*-1;
                System.out.print(" ["+matrizB[i][j]+"] ");
            }
            System.out.println();
        }
        
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                if (matrizB[i][j]!=matrizA[i][j]) {
                    bandera=false;
                }
            }
        }

        if (bandera==true) {
            System.out.println("La matriz B es una matriz -AT");
        }
        else{
            System.out.println("La matriz B NO es una matriz -AT");
        }
    }
}
