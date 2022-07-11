package LogicaComJava;

import java.util.Scanner;

public class ex1035 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        int a, b, c, d;

        a = ex.nextInt();
        b = ex.nextInt();
        c = ex.nextInt();
        d = ex.nextInt();

        if(b > c && d > a && c + d > a + b && c > 0 && d > 0 && a % 2 == 0){
            System.out.println("Valores aceitos");
        }
        else{
            System.out.println("Valores nao aceitos");
        }


        ex.close();
    }
}
