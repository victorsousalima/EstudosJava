package LogicaComJava;

import java.util.Scanner;

public class ex1066 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        int n1, n2, n3, n4, n5;
        int p = 0;
        int i = 0;
        int po = 0;
        int n = 0;

        n1 = ex.nextInt();
        n2 = ex.nextInt();
        n3 = ex.nextInt();
        n4 = ex.nextInt();
        n5 = ex.nextInt();

        if (n1 % 2 == 0) {
            p++;
        } else {
            i++;
        }
        if (n1 > 0) {
            po++;
        } else if (n1 < 0) {
            n++;
        }


        if (n2 % 2 == 0) {
            p++;
        } else {
            i++;
        }
        if (n2 > 0) {
            po++;
        } else if (n2 < 0) {
            n++;
        }


        if (n3 % 2 == 0) {
            p++;
        } else {
            i++;
        }
        if (n3 > 0) {
            po++;
        } else if (n3 < 0) {
            n++;
        }


        if (n4 % 2 == 0) {
            p++;
        } else {
            i++;
        }
        if (n4 > 0) {
            po++;
        } else if (n4 < 0) {
            n++;
        }


        if (n5 % 2 == 0) {
            p++;
        } else {
            i++;
        }
        if (n5 > 0) {
            po++;
        } else if (n5 < 0) {
            n++;
        }


        System.out.println(p + " valores par(es)");
        System.out.println(i + " valores impar(es)");
        System.out.println(po + " valores positivo(s)");
        System.out.println(n + " valores negativo(s)");


        ex.close();
    }
}
