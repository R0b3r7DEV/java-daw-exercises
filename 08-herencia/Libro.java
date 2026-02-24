/**
 * Clase: Libro
 * Autor: Ionut Robert Fireteanu
 * Descripción: Hereda de Publicacion y añade páginas y género
 */

public class Libro extends Publicacion {

    // Atributos propios
    private int    numeroPaginas;
    private String genero;

    // Constructor
    public Libro(String titulo, String autor, String isbn, double precio,
                 int numeroPaginas, String genero) {
        super(titulo, autor, isbn, precio);
        this.numeroPaginas = numeroPaginas;
        this.genero        = genero;
    }

    // Getters
    public int    getNumeroPaginas() { return numeroPaginas; }
    public String getGenero()        { return genero; }

    // Sobreescritura de mostrarInfo()
    @Override
    public void mostrarInfo() {
        System.out.println("[ LIBRO ]");
        super.mostrarInfo();
        System.out.println("Páginas: " + numeroPaginas);
        System.out.println("Género : " + genero);
    }
}
