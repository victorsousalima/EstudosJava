package LogicaComJava;

import java.util.Scanner;
import java.util.Locale;

public class ex1037 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ex = new Scanner(System.in);

        double v;

        v = ex.nextDouble();

        if( v > 0 && v <= 25.0){
            System.out.println("Invtervalo [0,25]");
        }
        else if(v > 25.0 && v <= 50.0){
            System.out.println("Intervalo [25,50]");
        }
        else if(v > 50.0 && v <= 75.0){
            System.out.println("Intervalo [50,75]");
        }
        else if(v > 75.0 && v <= 100.0){
            System.out.println("Intervalo [75,100]");
        }
        else{
            System.out.println("Fora de intervalo");
        }


        ex.close();
    }
}
