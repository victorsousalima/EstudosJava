package LogicaComJava;

import java.util.Scanner;

public class ex1018 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        int n, nota, qo, r;

        n = ex.nextInt();

        r = n;

        nota = 100;
        qo = n / nota;
        System.out.println(qo + " nota(s) de R$ 100,00");
        r = r % nota;

        nota = 50;
        qo = r / nota;
        System.out.println(qo + " nota(s) de R$ 50,00");
        r = r % nota;

        nota = 20;
        qo = r / nota;
        System.out.println(qo + " nota(s) de R$ 20,00");
        r = r % nota;

        nota = 10;
        qo = r / nota;
        System.out.println(qo + " nota(s) de R$ 10,00");
        r = r % nota;

        nota = 5;
        qo = r / nota;
        System.out.println(qo + " nota(s) de R$ 5,00");
        r = r % nota;

        nota = 2;
        qo = r / nota;
        System.out.println(qo + " nota(s) de R$ 2,00");
        r = r % nota;

        nota = 1;
        qo = r / nota;
        System.out.println(qo + " nota(s) de R$ 1,00");
        r = r % qo;

        ex.close();
    }
}
