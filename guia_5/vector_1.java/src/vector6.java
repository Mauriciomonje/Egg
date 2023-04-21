/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números 
del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales 
son idénticas. Crear un programa que permita introducir un cuadrado 
por teclado y determine si este cuadrado es mágico o no. El programa 
deberá comprobar que los números introducidos son correctos, es decir, 
están entre el 1 y el 9. */

public class vector6 {
    public static void main(String[] args) {
        int [][] matrizA= new int[3][3];
        int valor;
        int aux=0;
        int aux2=0;
        int aux3=0;
        boolean bandera=true;
        matrizA[0][0]=2;
        matrizA[0][1]=7;
        matrizA[0][2]=6;
        matrizA[1][0]=9;
        matrizA[1][1]=5;
        matrizA[1][2]=1;
        matrizA[2][0]=4;
        matrizA[2][1]=3;
        matrizA[2][2]=8;
        valor=matrizA[0][0]+matrizA[0][1]+matrizA[0][2];
        for (int i = 0; i < matrizA.length; i++) {
            aux=0;
            aux2=0;
            aux3=0;
            for (int j = 0; j < matrizA.length; j++) {
                aux+=matrizA[i][j];
                aux3+=matrizA[j][i];
                if (i==j) {
                    aux2++;
                }
            }
            if (aux!=valor && aux2!=valor && aux3!=valor) {
                bandera=false;
            }
            
        }
        if (bandera) {
            System.out.println("Es una matriz magica");
        } else {
            System.out.println("No es una matriz magica");
        }
    }
}
