/**
 * Clase: Aerolinea
 * Autor: Ionut Robert Fireteanu
 * Descripción: Gestiona los vuelos y empleados de la aerolínea
 */

public class Aerolinea {

    // Atributos
    private String     nombre;
    private Vuelo[]    vuelos;
    private Empleado[] empleados;
    private int        contadorVuelos;
    private int        contadorEmpleados;

    // Constructor
    public Aerolinea(String nombre, int capacidadVuelos, int capacidadEmpleados) {
        this.nombre            = nombre;
        this.vuelos            = new Vuelo[capacidadVuelos];
        this.empleados         = new Empleado[capacidadEmpleados];
        this.contadorVuelos    = 0;
        this.contadorEmpleados = 0;
    }

    // Agregar vuelo controlando límite
    public void agregarVuelo(Vuelo v) {
        if (contadorVuelos < vuelos.length) {
            vuelos[contadorVuelos] = v;
            contadorVuelos++;
            System.out.println("✔ Vuelo añadido: " + v.getNumeroVuelo());
        } else {
            System.out.println("✘ Límite de vuelos alcanzado. No se puede añadir: " + v.getNumeroVuelo());
        }
    }

    // Agregar empleado controlando límite
    public void agregarEmpleado(Empleado e) {
        if (contadorEmpleados < empleados.length) {
            empleados[contadorEmpleados] = e;
            contadorEmpleados++;
            System.out.println("✔ Empleado añadido: " + e.getNombre());
        } else {
            System.out.println("✘ Límite de empleados alcanzado. No se puede añadir: " + e.getNombre());
        }
    }

    // Mostrar información de todos los empleados
    public void mostrarEmpleados() {
        System.out.println("\n========================================");
        System.out.println("       EMPLEADOS DE " + nombre.toUpperCase());
        System.out.println("========================================");
        if (contadorEmpleados == 0) {
            System.out.println("No hay empleados registrados.");
        } else {
            for (int i = 0; i < contadorEmpleados; i++) {
                System.out.println("----------------------------------------");
                empleados[i].mostrarInformacion();
            }
            System.out.println("========================================");
        }
    }

    // Mostrar información de todos los vuelos y sus pasajeros
    public void mostrarVuelos() {
        System.out.println("\n========================================");
        System.out.println("        VUELOS DE " + nombre.toUpperCase());
        System.out.println("========================================");
        if (contadorVuelos == 0) {
            System.out.println("No hay vuelos registrados.");
        } else {
            for (int i = 0; i < contadorVuelos; i++) {
                System.out.println("----------------------------------------");
                vuelos[i].mostrarInformacion();
            }
            System.out.println("========================================");
        }
    }
}
