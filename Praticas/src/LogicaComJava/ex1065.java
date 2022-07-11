package LogicaComJava;

import java.util.Scanner;

public class ex1065 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        int n1, n2, n3, n4, n5;
        int t = 0;

        n1 = ex.nextInt();
        n2 = ex.nextInt();
        n3 = ex.nextInt();
        n4 = ex.nextInt();
        n5 = ex.nextInt();


        if (n1 % 2 == 0) {
            t++;
        }
        if (n2 % 2 == 0) {
            t++;
        }
        if (n3 % 2 == 0) {
            t++;
        }
        if (n4 % 2 == 0) {
            t++;
        }
        if (n5 % 2 == 0) {
            t++;
        }

        System.out.println(t + " valores pares");


        ex.close();
    }
}
