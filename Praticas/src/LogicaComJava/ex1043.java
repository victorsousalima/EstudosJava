package LogicaComJava;

import java.util.Scanner;
import java.util.Locale;

public class ex1043 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ex = new Scanner(System.in);

        double a, b, c;
        double p, ar;

        a = ex.nextDouble();
        b = ex.nextDouble();
        c = ex.nextDouble();


        if (a + b > c && b + c > a && a + c > b) {
            p = a + b + c;
            System.out.printf("Perimetro = %.1f%n", p);
        } else {
            ar = ((a + b) * c) / 2;
            System.out.printf("Area = %.1f%n", ar);
        }

        ex.close();
    }
}
