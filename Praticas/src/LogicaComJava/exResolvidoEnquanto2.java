package LogicaComJava;

import java.util.Scanner;
import java.util.Locale;

public class exResolvidoEnquanto2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ex = new Scanner(System.in);
        int x = ex.nextInt();
        int sm = 0;
        int sv = 0;
        double m;

        if (x < 0) {
            System.out.println("impossivel calcular");
        } else {
            while (x > 0) {
                sv++;
                sm += x;
                x = ex.nextInt();
            }
            m = (double) sm / sv;

            System.out.printf("%.2f%n", m);
        }


        ex.close();
    }
}
