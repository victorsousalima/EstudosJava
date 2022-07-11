package LogicaComJava;

import java.util.Scanner;
import java.util.Locale;

public class ex1014 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ex = new Scanner(System.in);

        int x;
        double y, km;

        x = ex.nextInt();
        y = ex.nextDouble();

        km = x / y;

        System.out.printf("%.3f km/l%n", km);

        ex.close();
    }
}
