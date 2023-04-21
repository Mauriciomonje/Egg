/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejericio_5;
import java.util.Scanner;
/**
 *
 * @author mauri
 */
public class Ejericio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        double numero = leer.nextInt();
        double doble= numero * 2;
        double cuadrado = numero * 3;
        double raiz= Math.sqrt(numero);
        System.out.println("doble "+doble+" triple "+cuadrado+" raiz "+raiz);
    }
    
}
