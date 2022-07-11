package LogicaComJava;

import java.util.Scanner;

public class ex1113 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        int x = ex.nextInt();
        int y = ex.nextInt();

        while(x != y){
            if(x > y){
                System.out.println("Descrecente");
            } else if(y > x){
                System.out.println("Crecente");
            }
            x = ex.nextInt();
            y = ex.nextInt();
        }



        ex.close();
    }
}
