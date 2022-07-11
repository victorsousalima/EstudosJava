package LogicaComJava;

import java.util.Scanner;
import java.util.Locale;

public class ex1008 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ex = new Scanner(System.in);

        int n, ht;
        double vh, sa;

        n = ex.nextInt();
        ht = ex.nextInt();
        vh = ex.nextDouble();

        sa = (double)ht * vh;

        System.out.println("NUMBER = " + n);
        System.out.printf("SALARY = U$ %.2f%n", sa);

        ex.close();
    }
}
