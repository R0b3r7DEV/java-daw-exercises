/**
 * Clase: Persona
 * Autor: Ionut Robert Fireteanu
 * Descripción: Clase abstracta base que representa una persona
 */

public abstract class Persona {

    // Atributos
    private String nombre;
    private int    edad;
    private String documento;

    // Constructor
    public Persona(String nombre, int edad, String documento) {
        this.nombre    = nombre;
        this.edad      = edad;
        this.documento = documento;
    }

    // Getters
    public String getNombre()    { return nombre; }
    public int    getEdad()      { return edad; }
    public String getDocumento() { return documento; }

    // Método abstracto que cada subclase debe implementar
    public abstract void mostrarInformacion();
}
