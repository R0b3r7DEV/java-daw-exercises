/**
 * Clase: Pasajero
 * Autor: Ionut Robert Fireteanu
 * Descripción: Hereda de Persona y representa a un pasajero de un vuelo
 */

public class Pasajero extends Persona {

    // Atributos propios
    private String numeroVuelo;
    private String asiento;

    // Constructor
    public Pasajero(String nombre, int edad, String documento,
                    String numeroVuelo, String asiento) {
        super(nombre, edad, documento);
        this.numeroVuelo = numeroVuelo;
        this.asiento     = asiento;
    }

    // Getters
    public String getNumeroVuelo() { return numeroVuelo; }
    public String getAsiento()     { return asiento; }

    // Implementación del método abstracto
    @Override
    public void mostrarInformacion() {
        System.out.println("  [ PASAJERO ]");
        System.out.println("  Nombre    : " + getNombre());
        System.out.println("  Edad      : " + getEdad() + " años");
        System.out.println("  Documento : " + getDocumento());
        System.out.println("  Vuelo     : " + numeroVuelo);
        System.out.println("  Asiento   : " + asiento);
    }
}
