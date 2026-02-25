package Actividad811;

public class PruebaCampana {
    public static void main(String[] args) {
        Campana campana = new Campana();

        campana.add(new Nota("SOL", 2));
        campana.add(new Nota("LA", 1));
        campana.add(new Nota("DO", 4));
        campana.add(new Nota("SOL", 2));
        campana.add(new Nota("MI", 1));
        campana.add(new Nota("DO", 2));

        campana.interpretar();
    }
}
