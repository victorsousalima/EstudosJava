package LogicaComJava;

import java.util.Scanner;

public class ex1115 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        int x = ex.nextInt();
        int y = ex.nextInt();

        while (x != 0 && y != 0){
            if (x > 0 && y > 0){
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0){
                System.out.println("segundo");
            }
            else if (x < 0 && y < 00){
                System.out.println("terceiro");
            }
            else if (x > 0 && y < 0){
                System.out.println("quarto");
            }
            x = ex.nextInt();
            y = ex.nextInt();
        }

        ex.close();
    }
}
