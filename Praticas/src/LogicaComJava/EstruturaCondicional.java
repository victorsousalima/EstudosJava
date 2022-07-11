package LogicaComJava;

import java.util.Scanner;
import java.util.Locale;

public class EstruturaCondicional {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ex = new Scanner(System.in);

        double n1, n2, m;

        System.out.println("Nota do primeiro Semestre: ");
        n1 = ex.nextDouble();

        System.out.println("Nota do segundo Semestre: ");
        n2 = ex.nextDouble();

        m = n1 + n2;

        System.out.println("Media = "+ m);

        if(m >= 60){
            System.out.println("APROVADO!");
        }
        else{
            System.out.println("REPROVADO!");
        }

        ex.close();
    }
}
