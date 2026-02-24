
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bImp;
        double iva;
        System.out.print("Ingrese el importe : ");
        bImp = sc.nextDouble();
        System.out.print("Ingrese el IVA % : ");
        iva = sc.nextDouble();
        iva = bImp * (iva/100);
        bImp = bImp + iva;
        System.out.println("Total a pagar: " + bImp + " €");
        System.out.println("El IVA es " + iva + " €");

    }
}