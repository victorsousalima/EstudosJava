package LogicaComJava;

import java.util.Scanner;
import java.util.Locale;

public class ex1064 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ex = new Scanner(System.in);

        double n1, n2, n3, n4, n5, n6, m;
        int t = 0;
        double tot = 0;

        n1 = ex.nextDouble();
        n2 = ex.nextDouble();
        n3 = ex.nextDouble();
        n4 = ex.nextDouble();
        n5 = ex.nextDouble();
        n6 = ex.nextDouble();

        if (n1 > 0) {
            t++;
            tot += n1;
        }
        if (n2 > 0) {
            t++;
            tot += n2;
        }
        if (n3 > 0) {
            t++;
            tot += n3;
        }
        if (n4 > 0) {
            t++;
            tot += n4;
        }
        if (n5 > 0) {
            t++;
            tot += n5;
        }
        if (n6 > 0) {
            t++;
            tot += n6;
        }

        m = tot / t;

        System.out.println(t + " valores positivos");
        System.out.printf("%.1f%n", m);

        ex.close();
    }
}

