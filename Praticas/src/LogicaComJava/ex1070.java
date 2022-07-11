package LogicaComJava;

import java.util.Scanner;

public class ex1070 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        int v, c;

        v = ex.nextInt();


        if (v % 2 == 0) {
            c = v + 1;
            System.out.println(c);
            System.out.println(c + 2);
            System.out.println(c + 4);
            System.out.println(c + 6);
            System.out.println(c + 8);
            System.out.println(c + 10);
        } else {
            c = v + 2;
            System.out.println(c);
            System.out.println(c + 2);
            System.out.println(c + 4);
            System.out.println(c + 6);
            System.out.println(c + 8);
            System.out.println(c + 10);
        }

        ex.close();
    }
}
