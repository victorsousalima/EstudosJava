package LogicaComJava;

import java.util.Scanner;
import java.util.Locale;

public class ex1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ex = new Scanner(System.in);

        float n1, n2, n3, n4, m, ne, mf;

        n1 = ex.nextFloat();
        n2 = ex.nextFloat();
        n3 = ex.nextFloat();
        n4 = ex.nextFloat();

        m = ((n1 * 2) + (n2 * 3) + (n3 * 4) +(n4 * 1)) / 10;
        System.out.printf("Media: %.1f%n", m);

        if(m >= 7.0){
            System.out.println("Aluno aprovado");
        }
        else if(m < 5.0){
            System.out.println("Aluno reprovado");
        }
        else if(m > 5.0 && m < 7.0){
            System.out.println("Aluno em exame");
            ne = ex.nextFloat();
            mf = (m + ne) / 2;
            System.out.printf("Nota exame: %.1f%n", ne);
            if(m > 5.0){
                System.out.println("Aluno aprovado");
            }
            else{
                System.out.println("Aluno reprovado");
            }
            System.out.printf("Media final: %.1f%n", mf);
        }

        ex.close();
    }
}
