/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1.entidades;

/**
 *
 * @author mauri
 */
public class CuentaBancaria {

    public CuentaBancaria() {
    }
    public  CuentaBancaria(int numeroCuenta,long dniCliente,double saldoActual){
        this.numeroCuenta=numeroCuenta;
        this.dniCliente=dniCliente;
        this.saldoActual=saldoActual;
    }
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public long getDniCliente() {
        return dniCliente;
    }
    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }
    public double getSaldoActual() {
        return saldoActual;
    }
    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
}
