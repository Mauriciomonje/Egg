/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.entidades;

import java.util.Date;

public class Usuario {

    private String nombre;
    public String apellido;
    public int dni;
    public String fecha_nacimiento;
    public String pais;

    //Un constructor inicializa y carga los valores por defecto
    //Se pueden llamar igual pero no pueden tener los mismo parametros
    
    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Usuario(String nombre, String apellido, int dni, String fecha_nacimiento, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecha_nacimiento = fecha_nacimiento;
        this.pais = pais;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
