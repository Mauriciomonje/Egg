
import java.util.Scanner;


public class vector4 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int tamanio=3;
        int[][] vecA=new int[tamanio][tamanio];
        int[][] vecB=new int[tamanio][tamanio];

        System.out.println("MatrizA");
        for (int i = 0; i <vecA.length; i++) {
            for (int j=0;j<vecA.length; j++){
                vecA[i][j]= (int) (Math.random()*9);
            }
        }
        //"["+matriz+"]"
        // imprime matrizA
        for (int i = 0; i < vecB.length; i++) {
            for (int j = 0; j< vecB.length; j++) {
                System.out.print("["+vecA[i][j]+"]");
            }
            System.out.println("");
        }
        //transpuesta
        for (int i = 0; i < vecB.length; i++) {
            for (int j = 0; j< vecB.length; j++) {
                vecB[j][i]=vecA[i][j];
            }
            System.out.println("");
        }
        //imprime transpuesta
        System.out.println("MatrizB");
        for (int i = 0; i < vecB.length; i++) {
            for (int j = 0; j< vecB.length; j++) {
                System.out.print("["+vecB[i][j]+"]");
            }
            System.out.println("");
        }
    }
}
