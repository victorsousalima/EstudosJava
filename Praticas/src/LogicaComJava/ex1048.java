package LogicaComJava;

import java.util.Scanner;
import java.util.Locale;

public class ex1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ex = new Scanner(System.in);

        double s, g, sf;

        s = ex.nextDouble();

        if(s <= 400.00){
            g = s * 0.15;
            sf = s + g;
            System.out.printf("Novo Salario: %.2f%n", sf);
            System.out.printf("Reajuste ganho: %.2f%n", g);
            System.out.println("Em percentual: 15 %");
        }
        else if(s > 400.00 && s <= 800.00){
            g = s * 0.12;
            sf = s + g;
            System.out.printf("Novo Salario: %.2f%n", sf);
            System.out.printf("Reajuste ganho: %.2f%n", g);
            System.out.println("Em percentual: 12 %");
        }
        else if(s > 800.00 && s <= 1200.00){
            g = s * 0.10;
            sf = s + g;
            System.out.printf("Novo Salario: %.2f%n", sf);
            System.out.printf("Reajuste ganho: %.2f%n", g);
            System.out.println("Em percentual: 10 %");
        }
        else if(s > 1200.00 && s <= 2000.00){
            g = s * 0.07;
            sf = s + g;
            System.out.printf("Novo Salario: %.2f%n", sf);
            System.out.printf("Reajuste ganho: %.2f%n", g);
            System.out.println("Em percentual: 7 %");
        }
        else{
            g = s * 0.04;
            sf = s + g;
            System.out.printf("Novo Salario: %.2f%n", sf);
            System.out.printf("Reajuste ganho: %.2f%n", g);
            System.out.println("Em percentual: 4 %");
        }


        ex.close();
    }
}
