package LogicaComJava;

import java.util.Scanner;
import java.util.Locale;

public class ex02 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ex = new Scanner(System.in);

        double b, al, a, p, d, d1;

        System.out.println("Digite a base de um retângulo: ");
        b = ex.nextDouble();

        System.out.println("Digite a altura de um retângulo: ");
        al = ex.nextDouble();

        a = b * al;
        p = (b + a) * 2;
        d1 = (Math.pow(b, 2)) + (Math.pow(al , 2));
        d = Math.sqrt(d1);

        System.out.printf("AREA = %.4f%n", a);
        System.out.printf("PERIMETRO = %.4f%n", p);
        System.out.printf("DIAGONAL = %.4f%n", d);

        ex.close();
    }
}
