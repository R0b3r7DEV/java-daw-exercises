package Actividad811;

public class Campana extends Instrumento {
    public Campana() {
        super();
    }
    @Override
    void interpretar() {
        if (melodia.length == 0) {
            System.out.println("No tiene melodia");
        }
        for (int i = 0; i < melodia.length; i++) {
            Nota nota = melodia[i];

            System.out.println("Nota " + (i + 1) + ": " + nota.getNombre());

            StringBuilder play = new StringBuilder();
            for (int d = 0; d < nota.getDuracion(); d++) {
                play.append("BoooM ");
            }
            System.out.println(" -> " + play.toString().trim());

            if (i < melodia.length -1) {
                System.out.println(" Shhh....");
            }
        }
        System.out.println("Aquí finaliza el Play");
    }
}
