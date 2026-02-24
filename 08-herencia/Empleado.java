/**
 * Clase: Empleado
 * Autor: Ionut Robert Fireteanu
 * Descripción: Hereda de Persona y representa a un empleado de la aerolínea
 */

public class Empleado extends Persona {

    // Atributos propios
    private String cargo;
    private double salario;

    // Constructor
    public Empleado(String nombre, int edad, String documento,
                    String cargo, double salario) {
        super(nombre, edad, documento);
        this.cargo   = cargo;
        this.salario = salario;
    }

    // Getters
    public String getCargo()   { return cargo; }
    public double getSalario() { return salario; }

    // Implementación del método abstracto
    @Override
    public void mostrarInformacion() {
        System.out.println("  [ EMPLEADO ]");
        System.out.println("  Nombre    : " + getNombre());
        System.out.println("  Edad      : " + getEdad() + " años");
        System.out.println("  Documento : " + getDocumento());
        System.out.println("  Cargo     : " + cargo);
        System.out.printf ("  Salario   : %.2f €%n", salario);
    }
}
