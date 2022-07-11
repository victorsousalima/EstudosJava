package LogicaComJava;

import java.util.Scanner;

public class ex1020 {

    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);
        int n, r, a, q;

        n = ex.nextInt();

        r = n;

        a = 365;
        q = n / a;
        System.out.println(q + " ano(s)");
        r = r % a;

        a = 30;
        q = r / a;
        System.out.println(q + " mes(es)");
        r %= a;

        a = 1;
        q = r / a;
        System.out.println(q + " dia(s)");
        r %= a;


    }
}
