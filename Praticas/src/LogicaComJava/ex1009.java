package LogicaComJava;

import java.util.Scanner;
import java.util.Locale;

public class ex1009 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ex = new Scanner(System.in);

        String nome;
        double sf, ve;

        nome = ex.nextLine();
        sf = ex.nextDouble();
        ve = ex.nextDouble();

        double sff = sf + (ve * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", sff);


        ex.close();
    }
}
