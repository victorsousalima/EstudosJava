package LogicaComJava;

import java.util.Scanner;

public class ex1134 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        int c = ex.nextInt();
        int sa = 0;
        int sg = 0;
        int sd = 0;

        while (c != 4){
            if(c == 1){
                sa ++;
            }
            else if (c == 2){
                sg ++;
            }
            else if (c == 3){
                sd++;
            }
            c = ex.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + sa);
        System.out.println("Gasolina: " + sg);
        System.out.println("Disel: " + sd);

        ex.close();
    }
}
