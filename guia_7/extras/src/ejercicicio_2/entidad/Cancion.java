/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicicio_2.entidad;

import java.util.Scanner;

/**
 *
 * @author mauri
 */
public class Cancion {
    private String titulo;
    private String autor;
    public Cancion() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void Inicializa(){
        this.titulo="";
        this.autor="";
    }
    public void Inicializa(String titulo,String autor){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el titulo de la cancion");
        this.titulo=leer.nextLine();
        System.out.println("Ingrese el autor de la cancion");
        this.autor=leer.nextLine();
    }
}
