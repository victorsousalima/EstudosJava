package LogicaComJava;

import java.util.Scanner;
import java.util.Locale;

public class ex1117 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ex = new Scanner(System.in);

        double n1 = ex.nextDouble();
        double s = 0;
        int q = 0;

        while (q != 2){
            if(n1 < 0 || n1 > 10){
                System.out.println("nota invalida");
            }
            else {
                s += n1;
                q++;
                if (q == 2){
                    break;
                }
            }
            n1 = ex.nextDouble();
        }

        double m = s / q;

        System.out.printf("media = %.2f%n", m);

        ex.close();
    }
}
