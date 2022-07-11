package LogicaComJava;

import java.util.Scanner;
import java.util.Locale;

public class ex02EC {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ex = new Scanner(System.in);

        double a, b ,c, r1, r2, delta;

        System.out.println("Valor de A: ");
        a = ex.nextDouble();

        System.out.println("Valor de B: ");
        b = ex.nextDouble();

        System.out.println("Valor de C: ");
        c = ex.nextDouble();

        delta = Math.pow(b, 2.0) - 4 * a * c;

        if(a == 0.0 || delta < 0){
            System.out.println("Impossivel calcular");
        }
        else {
            r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("R2 = %.5f%n", r2);

            ex.close();
        }
    }
}
