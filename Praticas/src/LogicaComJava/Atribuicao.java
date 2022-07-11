package LogicaComJava;

import java.util.Scanner;

public class Atribuicao {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);


        int n;

        n = ex.nextInt();
        double c = 50.00;
        if(n > 100){
            c += (n - 100) * 2;
        }

        System.out.printf("Valor da conta = R$%.2f%n", c);

        ex.close();
    }
}
