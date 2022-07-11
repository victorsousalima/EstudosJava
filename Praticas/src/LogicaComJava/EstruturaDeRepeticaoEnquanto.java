package LogicaComJava;

import java.util.Scanner;

public class EstruturaDeRepeticaoEnquanto {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        int x = 1;
        int s = 0;

        while (x != 0){
            x = ex.nextInt();
            s += x;
        }

        System.out.println("A soma dos números digitados é : "  + s);

        ex.close();
    }
}
