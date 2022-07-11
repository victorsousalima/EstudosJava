package LogicaComJava;

import java.util.Scanner;
import java.util.Locale;

public class ex01 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner tr = new Scanner(System.in);

        double l, c, m, area, p;

        System.out.println("Digite a largura com Uma Casa Decimal: ");
        l = tr.nextDouble();

        System.out.println("Digite o Comprimento com Uma Casa Decimal: ");
        c = tr.nextDouble();

        System.out.println("Valor do Metro Quadrado: ");
        m = tr.nextDouble();

        area = l * c;
        p = area * m;

        System.out.printf("O valor da AREA =  %.2f %n", area);
        System.out.printf("O Preço do Terreno = R$%.2f %n", p);

        tr.close();
    }
}
