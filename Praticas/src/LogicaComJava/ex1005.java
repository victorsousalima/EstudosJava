package LogicaComJava;

import java.util.Scanner;
import java.util.Locale;

public class ex1005 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ex = new Scanner(System.in);

        double a, b, m;

        a = ex.nextDouble();
        b = ex.nextDouble();

        m = ((a * 3.5) + (b * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f%n", m);

        ex.close();
    }
}
