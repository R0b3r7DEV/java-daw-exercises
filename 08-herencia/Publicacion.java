/**
 * Clase: Publicacion
 * Autor: Ionut Robert Fireteanu
 * Descripción: Clase base que representa una publicación genérica
 */

public class Publicacion {

    // Atributos
    private String titulo;
    private String autor;
    private String isbn;
    private double precio;

    // Constructor
    public Publicacion(String titulo, String autor, String isbn, double precio) {
        this.titulo = titulo;
        this.autor  = autor;
        this.isbn   = isbn;
        this.precio = precio;
    }

    // Getters
    public String getTitulo() { return titulo; }
    public String getAutor()  { return autor; }
    public String getIsbn()   { return isbn; }
    public double getPrecio() { return precio; }

    // Método para mostrar información (se sobreescribe en las subclases)
    public void mostrarInfo() {
        System.out.println("Título : " + titulo);
        System.out.println("Autor  : " + autor);
        System.out.println("ISBN   : " + isbn);
        System.out.printf ("Precio : %.2f €%n", precio);
    }
}
