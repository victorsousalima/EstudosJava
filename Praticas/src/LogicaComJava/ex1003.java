package LogicaComJava;

import java.util.Scanner;

public class ex1003 {

    public static void main(String[] args) {

        Scanner ex = new Scanner(System.in);

        int a, b, soma;

        a = ex.nextInt();
        b = ex.nextInt();

        soma = a + b;

        System.out.println("SOMA = " + soma);

        ex.close();
    }
}
