package LogicaComJava;

import java.util.Scanner;
import java.util.Locale;

public class ex1154 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ex = new Scanner(System.in);

        int i = ex.nextInt();
        int s = 0;
        int qi = 0;
        double m;

        while (i > 0){
          s += i;
          qi++;
          i = ex.nextInt();
        }

        m = (double)s / qi;

        System.out.printf("%.2f%n", m);

        ex.close();
    }
}
