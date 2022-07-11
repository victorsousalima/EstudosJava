package LogicaComJava;

import java.util.Scanner;

public class ex1042 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        int a, b, c;
        int p = 0;
        int s = 0;
        int t = 0;

        a = ex.nextInt();
        b = ex.nextInt();
        c = ex.nextInt();

        if (a < b && a < c) {
            p = a;
            if (b < c) {
                s = b;
                t = c;
            } else {
                s = c;
                t = b;
            }
        } else if (b < a && b < c) {
            p = b;
            if (a < c) {
                s = a;
                t = c;
            } else {
                s = c;
                t = a;
            }
        } else if (c < a && c < b) {
            p = c;
            if (a < b) {
                s = a;
                t = b;
            } else {
                s = b;
                t = a;
            }
        }

        System.out.println(p);
        System.out.println(s);
        System.out.println(t);

        System.out.println();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        ex.close();
    }
}
