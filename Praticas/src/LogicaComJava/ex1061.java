package LogicaComJava;

import java.util.Scanner;

public class ex1061 {

    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        int dc, dt, r, qo, c, ht, mt, st, hc, mc, sc, h;

        System.out.print("Dia ");
        dc = ex.nextInt();
        hc = ex.nextInt();
        mc = ex.nextInt();
        sc = ex.nextInt();

        System.out.println("Dia ");
        dt = ex.nextInt();
        ht = ex.nextInt();
        mt = ex.nextInt();
        st = ex.nextInt();

        c = ((dt * ht) - (dc * hc)) / 4;

        System.out.println(c + " dia(s)");

        r = c;

        h = 24;
        qo = r / h;
        System.out.println(qo + " hora(s)");


        ex.close();
    }
}
