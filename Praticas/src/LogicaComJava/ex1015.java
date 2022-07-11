package LogicaComJava;

import java.util.Scanner;
import java.util.Locale;

public class ex1015 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ex = new Scanner(System.in);

        double x1, y1, x2, y2, r;

        x1 = ex.nextDouble();
        y1 = ex.nextDouble();
        x2 = ex.nextDouble();
        y2 = ex.nextDouble();

        r = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));

        System.out.printf("%.4f%n", r);

        ex.close();
    }
}
