package LogicaComJava;

import java.util.Scanner;

public class ex1046 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        int hi, hf, c;


        hi = ex.nextInt();
        hf = ex.nextInt();

        if(hi < hf){
            c = hf - hi;
        }
        else{
            c = 24 - (hi - hf);
        }

        System.out.println("O JOGO DUROU "+ c + " HORA(S)");

        ex.close();
    }
}
