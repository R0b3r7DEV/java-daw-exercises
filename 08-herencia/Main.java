/**
 * Programa: Main - Sistema de Biblioteca
 * Autor: Ionut Robert Fireteanu
 * Descripción: Programa principal que prueba el sistema de gestión de biblioteca
 */

public class Main {

    public static void main(String[] args) {

        // 1. Crear instancia de Biblioteca con capacidad 10
        Biblioteca biblioteca = new Biblioteca(10);

        // 2. Crear instancias de Libro
        Libro libro1 = new Libro("El Quijote",         "Miguel de Cervantes", "978-8420412146", 12.99, 863, "Novela");
        Libro libro2 = new Libro("Clean Code",         "Robert C. Martin",    "978-0132350884", 35.50, 431, "Programación");
        Libro libro3 = new Libro("Hacking: The Art",   "Jon Erickson",        "978-1593271442", 28.00, 488, "Ciberseguridad");

        // Crear instancias de Revista
        Revista revista1 = new Revista("National Geographic", "Varios Autores", "977-0027-9358",  5.99, 112, "Febrero");
        Revista revista2 = new Revista("Linux Magazine",      "Varios Autores", "977-1752-3445", 8.50,  45,  "Enero");

        // 3. Agregar publicaciones a la biblioteca
        System.out.println("\n--- Añadiendo publicaciones ---");
        biblioteca.agregarPublicacion(libro1);
        biblioteca.agregarPublicacion(libro2);
        biblioteca.agregarPublicacion(libro3);
        biblioteca.agregarPublicacion(revista1);
        biblioteca.agregarPublicacion(revista2);

        // 4. Mostrar toda la biblioteca (polimorfismo en acción)
        biblioteca.mostrarTodo();

        // 5. Buscar una publicación por título
        System.out.println("\n--- Búsqueda por título ---");
        String tituloBuscado = "Clean Code";
        Publicacion encontrada = biblioteca.buscarPorTitulo(tituloBuscado);

        if (encontrada != null) {
            System.out.println("✔ Publicación encontrada:");
            System.out.println("----------------------------------------");
            encontrada.mostrarInfo();
        } else {
            System.out.println("✘ No se encontró: " + tituloBuscado);
        }
    }
}
