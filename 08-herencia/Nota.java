package Actividad811;

public class Nota {
    private String nombre;
    private int duracion;

    public Nota(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }
    public String getNombre() {
        return nombre;
    }
    public int getDuracion() {
        return duracion;
    }
    @Override
    public String toString() {
        return nombre + "(" + duracion + ")";
    }
}
