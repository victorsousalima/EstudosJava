package LogicaComJava;

import java.util.Scanner;

public class ex1114 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        int x = ex.nextInt();


        while (x != 2002){
            System.out.println("Senha Invalida");
            x = ex.nextInt();
        }

        if(x == 2002){
            System.out.println("Acesso permitido");
        }

        ex.close();
    }
}
