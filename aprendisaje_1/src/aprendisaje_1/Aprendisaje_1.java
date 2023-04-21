
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendisaje_1;
import java.util.Scanner;
/**
 *
 * @author mauri
 */
public class Aprendisaje_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int numero1= lectura.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero2= lectura.nextInt();
        int suma =numero1+numero2;
        System.out.println(numero1+"+"+numero2+"="+suma);
    }
    
}
