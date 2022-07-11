package LogicaComJava;

import java.util.Scanner;
import java.util.Locale;

public class ex1010 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ex = new Scanner(System.in);

        double vp1, vp2, pp1, pp2;
        int np1, qp1, np2, qp2;

        np1 = ex.nextInt();
        qp1 = ex.nextInt();
        pp1 = ex.nextDouble();

        vp1 = qp1 * pp1;

        np2 = ex.nextInt();
        qp2 = ex.nextInt();
        pp2 = ex.nextDouble();

        vp2 = qp2 * pp2;

        double vf = vp1 + vp2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", vf);

        ex.close();
    }
}
