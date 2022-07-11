package LogicaComJava;

import java.util.Scanner;
import java.util.Locale;

public class ex1051 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ex = new Scanner(System.in);

        double sl, cs;

        sl = ex.nextDouble();


        if (sl >= 0.00 && sl <= 2000.00) {
            System.out.println("Isento");
        } else if (sl > 2000.00 && sl <= 3000.00) {
            cs = (sl - 2000.0) * 0.8;
            System.out.printf("R$ %.2f%n", cs);
        } else if (sl > 3000.00 && sl <= 4500.00) {
            cs = (sl - 3000.0) * 0.18 + 1000.0 * 0.08;
            System.out.printf("R$ %.2f%n", cs);
        } else {
            cs = (sl - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
            System.out.printf("R$ %.2f%n", cs);
        }


        ex.close();
    }
}
