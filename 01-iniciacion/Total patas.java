import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horm, arañ, cochi, totalP;
        System.out.println("Ingrese el numero de hormigas capturadas: ");
        horm = sc.nextInt();
        System.out.println("Ingrese el numero de arañas capturadas: ");
        arañ = sc.nextInt();
        System.out.println("Ingrese el numero de cochinillas capturadas: ");
        cochi = sc.nextInt();
        totalP = (horm * 6) + (arañ * 8) + (cochi * 14);
        System.out.println("Patas totales: " + totalP);
    }
}
