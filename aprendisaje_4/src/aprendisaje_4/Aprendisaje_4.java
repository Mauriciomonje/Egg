/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendisaje_4;
import java.util.Scanner;
/**
 *
 * @author mauri
 */
public class Aprendisaje_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese temperatura en grados centigrados");
        int c = leer.nextInt();
        int f= 32 + (9 * c / 5);
        System.out.println(c+" Grados centigrados a grados Farenheit "+f);
    }
    
}
