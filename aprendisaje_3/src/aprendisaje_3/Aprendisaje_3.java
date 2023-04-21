/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendisaje_3;

import java.util.Scanner;

/**
 *
 * @author mauri
 */
public class Aprendisaje_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        String mayuscula = frase.toUpperCase();
        String minuscula = frase.toLowerCase();
        System.out.println(mayuscula);
        System.out.println(minuscula);
    }

}
