import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PInf = 15.50;
        final double PAdu = 20.00;
        final double desc = 5.00;
        System.out.print("Numero de entradas infantiles: ");
        int eInf = sc.nextInt();
        System.out.print("Numero de entradas adultos: ");
        int eAdu = sc.nextInt();
        double iTotal = (PInf * eInf) + (PAdu * eAdu);
        boolean descuento = iTotal >= 100;
        double totalFinal = descuento ? iTotal - desc : iTotal;
        System.out.println("Total a pagar:" + totalFinal +" €");
    }
}
