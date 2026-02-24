/**
 * Clase: Vuelo
 * Autor: Ionut Robert Fireteanu
 * Descripción: Representa un vuelo y gestiona sus pasajeros
 */

public class Vuelo {

    // Atributos
    private String    numeroVuelo;
    private String    origen;
    private String    destino;
    private String    horaSalida;
    private String    horaLlegada;
    private int       capacidad;
    private Pasajero[] pasajeros;
    private int       contadorPasajeros;

    // Constructor
    public Vuelo(String numeroVuelo, String origen, String destino,
                 String horaSalida, String horaLlegada, int capacidad) {
        this.numeroVuelo        = numeroVuelo;
        this.origen             = origen;
        this.destino            = destino;
        this.horaSalida         = horaSalida;
        this.horaLlegada        = horaLlegada;
        this.capacidad          = capacidad;
        this.pasajeros          = new Pasajero[capacidad];
        this.contadorPasajeros  = 0;
    }

    // Getter
    public String getNumeroVuelo() { return numeroVuelo; }

    // Agregar pasajero controlando capacidad
    public void agregarPasajero(Pasajero p) {
        if (contadorPasajeros < capacidad) {
            pasajeros[contadorPasajeros] = p;
            contadorPasajeros++;
            System.out.println("✔ Pasajero añadido al vuelo " + numeroVuelo + ": " + p.getNombre());
        } else {
            System.out.println("✘ Vuelo " + numeroVuelo + " completo. No se puede añadir: " + p.getNombre());
        }
    }

    // Mostrar información del vuelo y sus pasajeros
    public void mostrarInformacion() {
        System.out.println("  Número    : " + numeroVuelo);
        System.out.println("  Origen    : " + origen);
        System.out.println("  Destino   : " + destino);
        System.out.println("  Salida    : " + horaSalida);
        System.out.println("  Llegada   : " + horaLlegada);
        System.out.println("  Capacidad : " + contadorPasajeros + "/" + capacidad + " pasajeros");

        if (contadorPasajeros == 0) {
            System.out.println("  Sin pasajeros registrados.");
        } else {
            System.out.println("  ---- Pasajeros ----");
            for (int i = 0; i < contadorPasajeros; i++) {
                pasajeros[i].mostrarInformacion();
                System.out.println("  -------------------");
            }
        }
    }
}
