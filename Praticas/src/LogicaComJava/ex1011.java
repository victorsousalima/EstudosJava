package LogicaComJava;

import java.util.Scanner;
import java.util.Locale;

public class ex1011 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ex = new Scanner(System.in);

        double r, e;

        r = ex.nextDouble();

        e = (double)(4/3) * 3.14159 * Math.pow(r, 3);


        System.out.printf("VOLUME = %.3f%n", e);


        ex.close();
    }
}
