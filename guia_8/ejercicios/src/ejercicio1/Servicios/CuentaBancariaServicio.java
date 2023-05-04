/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.Servicios;

import ejercicio_1.entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author mauri
 */
public class CuentaBancariaServicio {

    Scanner leer = new Scanner(System.in);

    public CuentaBancariaServicio() {
    }

    public CuentaBancaria crearCuenta() {
        System.out.println("Ingrese numero de cuenta");
        int nc = leer.nextInt();
        System.out.println("Ingrese DNI");
        long dni = leer.nextLong();
        System.out.println("Ingrese monto de la cuenta");
        double monto = leer.nextDouble();
        CuentaBancaria cb = new CuentaBancaria(nc, dni, monto);
        return cb;
    }

    public double ingresar(CuentaBancaria saldo) {
        System.out.println("Ingrese monto a depositar");
        double s = leer.nextDouble();//Almacenamos el monto para sumarlo al actual de la cuenta
        saldo.setSaldoActual(saldo.getSaldoActual() + s);
        return saldo.getSaldoActual();
    }

    public double retirar(CuentaBancaria saldo) {
        System.out.println("Ingrese el monto a retirar");
        double r = leer.nextDouble();
        if (saldo.getSaldoActual() < r) {
            saldo.setSaldoActual(0);
        } else {
            saldo.setSaldoActual(saldo.getSaldoActual() - r);
        }
        return saldo.getSaldoActual();
    }

    public double extraccionRapida(CuentaBancaria saldo) {
        double porcentaje = saldo.getSaldoActual() * 0.2;
        double retira=0;
        do {
            System.out.println("Ingrese el monto, no debe superar los " + porcentaje + " dolares");
            retira = leer.nextDouble();
            if (retira <= porcentaje) {
                break;
            }
        } while (true);
        saldo.setSaldoActual(saldo.getSaldoActual()-retira);
        return saldo.getSaldoActual();
    }
    public void consultarSaldo(CuentaBancaria saldo){
       System.out.println(saldo.getSaldoActual());
    }
    public void consultarDatos(CuentaBancaria cb){
        System.out.println("Numero de Cuenta: "+cb.getNumeroCuenta());
        System.out.println("DNI: "+cb.getDniCliente());
        System.out.println("Saldo: "+cb.getSaldoActual());
    }
}
