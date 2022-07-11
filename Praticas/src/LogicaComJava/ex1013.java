package LogicaComJava;

import java.util.Scanner;

public class ex1013 {

    public static void main(String[] args) {

        Scanner ex = new Scanner(System.in);

        int a, b, c;

        a = ex.nextInt();
        b = ex.nextInt();
        c = ex.nextInt();

        int mab = (a + b + Math.abs(a - b)) / 2;
        int mc = (mab + c + Math.abs(mab - c))/ 2;

        System.out.println(mc + " eh o maior");

        ex.close();
    }
}
