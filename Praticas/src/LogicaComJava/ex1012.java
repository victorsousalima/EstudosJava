package LogicaComJava;

import java.util.Scanner;
import java.util.Locale;

public class ex1012 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ex = new Scanner(System.in);

        double a, b, c;

        a = ex.nextDouble();
        b = ex.nextDouble();
        c = ex.nextDouble();

        double at = (a * c) / 2;
        double ci = 3.14159 * Math.pow(c , 2);
        double ta = ((a + b) * c) / 2;
        double qa = Math.pow(b, 2);
        double re = a * b;

        System.out.printf("TRIANGULO: %.3f%n", at);
        System.out.printf("CIRCULO: %.3f%n", ci);
        System.out.printf("TRAPEZIO: %.3f%n", ta);
        System.out.printf("QUADRADO: %.3f%n", qa);
        System.out.printf("RETANGULO: %.3f%n", re);

        ex.close();
    }
}
