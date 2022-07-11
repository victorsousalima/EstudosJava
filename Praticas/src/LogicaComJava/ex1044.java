package LogicaComJava;

import java.util.Scanner;

public class ex1044 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        int a, b;

        a = ex.nextInt();
        b = ex.nextInt();

        if(a % b == 0 || b % a == 0){
            System.out.println("Sao Multiplos");
        }
        else{
            System.out.println("Nao sao Multiplos");
        }

        ex.close();
    }
}
