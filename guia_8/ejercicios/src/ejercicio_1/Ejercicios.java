/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1;

import ejercicio1.Servicios.CuentaBancariaServicio;
import ejercicio_1.entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author mauri
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancariaServicio cbs = new CuentaBancariaServicio();
        CuentaBancaria cb = cbs.crearCuenta();
        Scanner leer = new Scanner(System.in);
        int rta = 0;
        do {
            System.out.println("1_Ingresar Dolares \n"
                    + "2_Retirar Dolares \n"
                    + "3_Extraccion Rapida \n"
                    + "4_Consultar Saldo \n"
                    + "5_Consultar Datos \n"
                    + "6_Salir"
            );

            rta = leer.nextInt();

            switch (rta) {
                case 1:
                    cbs.ingresar(cb);
                    break;
                case 2:
                    cbs.retirar(cb);
                    break;
                case 3:
                    cbs.extraccionRapida(cb);
                    break;
                case 4:
                    cbs.consultarSaldo(cb);
                    break;
                case 5:
                    cbs.consultarDatos(cb);
                    break;
                case 6:
                    System.out.println("Cerrando Sesion...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
            if (rta == 6) {
                break;
            }
        } while (true);
    }

}
