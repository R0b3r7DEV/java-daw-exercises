/**
 * Clase: Revista
 * Autor: Ionut Robert Fireteanu
 * Descripción: Hereda de Publicacion y añade número de edición y mes
 */

public class Revista extends Publicacion {

    // Atributos propios
    private int    numeroEdicion;
    private String mesPublicacion;

    // Constructor
    public Revista(String titulo, String autor, String isbn, double precio,
                   int numeroEdicion, String mesPublicacion) {
        super(titulo, autor, isbn, precio);
        this.numeroEdicion  = numeroEdicion;
        this.mesPublicacion = mesPublicacion;
    }

    // Getters
    public int    getNumeroEdicion()  { return numeroEdicion; }
    public String getMesPublicacion() { return mesPublicacion; }

    // Sobreescritura de mostrarInfo()
    @Override
    public void mostrarInfo() {
        System.out.println("[ REVISTA ]");
        super.mostrarInfo();
        System.out.println("Edición: " + numeroEdicion);
        System.out.println("Mes    : " + mesPublicacion);
    }
}
