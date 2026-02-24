/**
 * Clase: Biblioteca
 * Autor: Ionut Robert Fireteanu
 * Descripción: Gestiona un array de publicaciones (libros y revistas)
 */

public class Biblioteca {

    // Array de publicaciones (polimorfismo: puede contener Libro y Revista)
    private Publicacion[] publicaciones;
    private int           contador;

    // Constructor
    public Biblioteca(int capacidad) {
        publicaciones = new Publicacion[capacidad];
        contador      = 0;
    }

    // Agregar una publicación a la biblioteca
    public void agregarPublicacion(Publicacion p) {
        if (contador < publicaciones.length) {
            publicaciones[contador] = p;
            contador++;
            System.out.println("✔ Añadido: " + p.getTitulo());
        } else {
            System.out.println("✘ Biblioteca llena. No se puede añadir: " + p.getTitulo());
        }
    }

    // Mostrar toda la biblioteca
    public void mostrarTodo() {
        System.out.println("\n========================================");
        System.out.println("         CATÁLOGO DE LA BIBLIOTECA      ");
        System.out.println("========================================");
        if (contador == 0) {
            System.out.println("La biblioteca está vacía.");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println("----------------------------------------");
                publicaciones[i].mostrarInfo(); // Polimorfismo
            }
            System.out.println("========================================");
            System.out.println("Total de publicaciones: " + contador);
        }
    }

    // Buscar publicación por título
    public Publicacion buscarPorTitulo(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (publicaciones[i].getTitulo().equalsIgnoreCase(titulo)) {
                return publicaciones[i];
            }
        }
        return null;
    }
}
