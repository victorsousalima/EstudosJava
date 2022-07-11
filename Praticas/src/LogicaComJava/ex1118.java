package LogicaComJava;

import java.util.Scanner;
import java.util.Locale;

public class ex1118 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ex = new Scanner(System.in);

        double n1;
        double s = 0;
        double m;
        int q = 0;
        int c = 0;

        while (c != 2){
            s = 0;
            q = 0;
            while(q != 2){
                n1 = ex.nextDouble();
                if(n1 < 0 || n1 > 10){
                    System.out.println("nota invalida");
                } else{
                    s += n1;
                    q++;
                }
                if(q == 2){
                    m = s / q;

                    System.out.printf("media = %.2f%n", m);
                    break;
                }
            }

            System.out.println("novo calculo (1-sim 2-nao)");
            c = ex.nextInt();
        }

        ex.close();
    }
}
