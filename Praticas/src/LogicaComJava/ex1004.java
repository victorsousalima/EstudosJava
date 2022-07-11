package LogicaComJava;

import java.util.Scanner;

public class ex1004 {

    public static void main(String[] args) {

        Scanner ex = new Scanner(System.in);

        int a, b, prod;

        a = ex.nextInt();
        b = ex.nextInt();

        prod = a * b;

        System.out.println("PROD = " + prod);

        ex.close();
    }
}
