package LogicaComJava;

import java.util.Scanner;

public class ex1007 {

    public static void main(String[] args) {

        Scanner ex = new Scanner(System.in);

        int a, b, c, d, diferenca;

        a = ex.nextInt();
        b = ex.nextInt();
        c = ex.nextInt();
        d = ex.nextInt();

        diferenca = (a * b) - (c * d);

        System.out.println("DIFERENCA = " + diferenca);

        ex.close();
    }
}
