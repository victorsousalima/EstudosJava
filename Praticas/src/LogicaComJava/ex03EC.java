package LogicaComJava;

import java.util.Scanner;

public class ex03EC {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);


        int n1, n2, n3;

        System.out.println("Valor 1: ");
        n1 = ex.nextInt();

        System.out.println("Valor 2: ");
        n2 = ex.nextInt();

        System.out.println("Valor 3: ");
        n3 = ex.nextInt();

        if(n1 < n2 && n1 < n3){
            System.out.println("MENOR = " + n1);
        }
        else if(n2 < n1 && n2 < n3){
            System.out.println("MENOR = " + n2);
        }
        else if(n3 < n1 && n3 < n2){
            System.out.println("MENOR = " + n3);
        }
        else if(n1 == n2 || n1 == n3){
            System.out.println("MENOR = "+ n1);
        }


        ex.close();
    }
}
