/**
 * Programa: Main - Sistema de Reservas de Vuelos
 * Autor: Ionut Robert Fireteanu
 * Descripción: Programa principal que gestiona una aerolínea con vuelos y pasajeros
 */

public class Main {

    public static void main(String[] args) {

        // 1. Crear instancia de Aerolinea (máx. 5 vuelos, máx. 10 empleados)
        Aerolinea aerolinea = new Aerolinea("AirR0b3rt", 5, 10);

        // 2. Crear instancias de Empleado
        Empleado emp1 = new Empleado("Carlos López",    35, "12345678A", "Piloto",            4500.00);
        Empleado emp2 = new Empleado("María García",    28, "87654321B", "Auxiliar de vuelo", 2200.00);
        Empleado emp3 = new Empleado("Pedro Martínez",  42, "11223344C", "Controlador aéreo", 3800.00);
        Empleado emp4 = new Empleado("Laura Sánchez",   31, "44332211D", "Auxiliar de vuelo", 2200.00);

        // 3. Crear instancias de Vuelo
        Vuelo vuelo1 = new Vuelo("IB1234", "Madrid",   "Barcelona", "08:00", "09:10", 3);
        Vuelo vuelo2 = new Vuelo("VY5678", "Valencia", "París",     "14:30", "16:45", 2);

        // Crear instancias de Pasajero
        Pasajero p1 = new Pasajero("Ana Ruiz",      25, "55667788E", "IB1234", "1A");
        Pasajero p2 = new Pasajero("Jorge Torres",  40, "99887766F", "IB1234", "1B");
        Pasajero p3 = new Pasajero("Sofía Méndez",  33, "12398745G", "IB1234", "2A");
        Pasajero p4 = new Pasajero("Luis Fernández",29, "32165498H", "IB1234", "2B"); // Excederá capacidad
        Pasajero p5 = new Pasajero("Elena Vidal",   55, "65432198I", "VY5678", "1A");
        Pasajero p6 = new Pasajero("Marcos Gil",    47, "78901234J", "VY5678", "1B");

        // 4. Agregar empleados a la aerolínea
        System.out.println("\n--- Añadiendo empleados ---");
        aerolinea.agregarEmpleado(emp1);
        aerolinea.agregarEmpleado(emp2);
        aerolinea.agregarEmpleado(emp3);
        aerolinea.agregarEmpleado(emp4);

        // 5. Agregar pasajeros a los vuelos (controlando capacidad)
        System.out.println("\n--- Añadiendo pasajeros al vuelo IB1234 (capacidad 3) ---");
        vuelo1.agregarPasajero(p1);
        vuelo1.agregarPasajero(p2);
        vuelo1.agregarPasajero(p3);
        vuelo1.agregarPasajero(p4); // ✘ Vuelo completo

        System.out.println("\n--- Añadiendo pasajeros al vuelo VY5678 (capacidad 2) ---");
        vuelo2.agregarPasajero(p5);
        vuelo2.agregarPasajero(p6);

        // 6. Agregar vuelos a la aerolínea
        System.out.println("\n--- Añadiendo vuelos ---");
        aerolinea.agregarVuelo(vuelo1);
        aerolinea.agregarVuelo(vuelo2);

        // 7. Mostrar empleados
        aerolinea.mostrarEmpleados();

        // 8. Mostrar vuelos y pasajeros
        aerolinea.mostrarVuelos();
    }
}
