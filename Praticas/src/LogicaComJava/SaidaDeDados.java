package LogicaComJava;

import java.util.Locale;

public class SaidaDeDados {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

       System.out.println("Olá, Mundo!");

       int y = 32;
       double x = 10.3458;
       System.out.println(y);
        System.out.println(x);
       System.out.printf("%.2f %n", x);
       System.out.printf("%.4f %n", x);

       System.out.printf("O resultado é = %.2f Metros %n", x);

       String nome = "Victor";
       int idade = 32;
       double salario = 2500.89;

       System.out.printf("O nome é %s e Idade é %d anos %n Recebe: %.2f", nome, idade, salario);



    }
}
