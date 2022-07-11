package LogicaComJava;

import java.util.Scanner;
import java.util.Locale;

public class ex03 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ex = new Scanner(System.in);

        String n1, n2;
        int id1, id2;

        System.out.println("Nome da Primeira Pessoa: ");
        n1 = ex.nextLine();

        System.out.println("Idade da Primeira Pessoa: ");
        id1 = ex.nextInt();

        System.out.println("Nome da Segunda Pessoa:");
        ex.nextLine();
        n2 = ex.nextLine();

        System.out.println("Idade da Segunda Pessoa: ");
        id2 = ex.nextInt();

        double m = (double)(id1 + id2) / 2;

        System.out.printf("A media de idade de %s e %s é de %.1f", n1, n2, m);

        ex.close();
    }
}
