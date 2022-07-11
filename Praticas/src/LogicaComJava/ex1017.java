package LogicaComJava;

import java.util.Scanner;
import java.util.Locale;

public class ex1017 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ex = new Scanner(System.in);

        int tg, vm;
        double m;

        tg = ex.nextInt();
        vm = ex.nextInt();

        m = (double)(tg * vm) / 12;

        System.out.printf("%.3f%n", m);

        ex.close();
    }
}
