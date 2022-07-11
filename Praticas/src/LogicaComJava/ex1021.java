package LogicaComJava;

import java.util.Scanner;
import java.util.Locale;

public class ex1021 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ex = new Scanner(System.in);

        double n, r, nota, moeda, qo;

        n = ex.nextDouble();

        r = n;

        System.out.println("NOTAS: ");

        nota = 100;
        qo = n / nota;
        System.out.println((int)qo + " nota(s) R$ 100.00");
        r %= nota;

        nota = 50;
        qo = r / nota;
        System.out.println((int)qo + " nota(s) R$ 50.00");
        r %= nota;

        nota = 20;
        qo = r / nota;
        System.out.println((int)qo + " nota(s) R$ 20.00");
        r %= nota;

        nota = 10;
        qo = r / nota;
        System.out.println((int)qo + " nota(s) R$ 10.00");
        r %= nota;

        nota = 5;
        qo = r / nota;
        System.out.println((int)qo + " nota(s) R$ 5.00");
        r %= nota;

        nota = 2;
        qo = r / nota;
        System.out.println((int)qo + " nota(s) R$ 2.00");
        r %= nota;

        System.out.println("MOEDAS: ");

        moeda = 1;
        qo = r / moeda;
        System.out.println((int)qo + " moeda(s) R$ 1.00");
        r %= moeda;

        moeda = 0.50;
        qo = r / moeda;
        System.out.println((int)qo + " moeda(s) R$ 0.50");
        r %= moeda;

        moeda = 0.25;
        qo = r / moeda;
        System.out.println((int)qo + " moeda(s) R$ 0.25");
        r %= moeda;

        moeda = 0.10;
        qo = r / moeda;
        System.out.println((int)qo + " moeda(s) R$ 0.10");
        r %= moeda;

        moeda = 0.05;
        qo = r / moeda;
        System.out.println((int)qo + " moeda(s) R$ 0.05");
        r %= moeda;

        moeda = 0.01;
        qo = r / moeda;
        System.out.println((int)qo + " moeda(s) R$ 0.01");
        r %= moeda;

        ex.close();
    }
}
