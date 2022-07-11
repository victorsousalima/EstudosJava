package LogicaComJava;

import java.util.Scanner;
import java.util.Locale;

public class ex1002 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ex = new Scanner(System.in);

        double raio, area;

        raio = ex.nextDouble();

        double n = 3.14159;

        area = n * (Math.pow(raio, 2));

        System.out.printf("A=%.4f %n", area);

        ex.close();
    }
}
