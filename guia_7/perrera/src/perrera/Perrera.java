package perrera;

import java.util.Scanner;

public class Libro {
    private int ISBN;
    private String titulo;
    private int pag;
    private String autor;

    public Libro() {
    }

    public Libro(int ISBN, int pag, String autor, String titulo) {
        this.ISBN = ISBN;
        this.pag = pag;
        this.autor = autor;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getPag() {
        return pag;
    }

    public void setPag(int pag) {
        this.pag = pag;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void CargarDatos() {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el título");
        this.titulo = leer.nextLine();
        System.out.println("Ingrese el autor");
        this.autor = leer.nextLine();
        System.out.println("Ingrese el ISBN");
        this.ISBN = leer.nextInt();
        System.out.println("Ingrese la cantidad de páginas");
        this.pag = leer.nextInt();
        
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", pag=" + pag + ", autor=" + autor + '}';
    }
    
}
