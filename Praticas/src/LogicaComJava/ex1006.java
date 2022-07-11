package LogicaComJava;

import java.util.Scanner;
import java.util.Locale;

public class ex1006 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ex = new Scanner(System.in);

        double a, b, c, m;

        a = ex.nextDouble();
        b = ex.nextDouble();
        c = ex.nextDouble();

        m = ((a * 2) + (b * 3) + (c * 5)) / 10;

        System.out.printf("MEDIA = %.1f%n", m);

        ex.close();
    }
}
