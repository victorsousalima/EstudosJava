package LogicaComJava;

import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        int s;

        s = ex.nextInt();

        int h = s / 3600;
        int resto = s % 3600;
        int m = resto / 60;
        int se = resto % 60;

        System.out.printf("%d:%d:%d", h, m, se);

        ex.close();
    }
}
