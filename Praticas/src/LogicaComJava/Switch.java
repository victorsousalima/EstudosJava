package LogicaComJava;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);


        int d;

        d = ex.nextInt();

        switch (d){
            case 1:
                System.out.println("Dia da semana = domingo");
                break;
            case 2:
                System.out.println("Dia da semana = segunda");
                break;
            case 3:
                System.out.println("Dia da semana = terça-feira");
                break;
            case 4:
                System.out.println("Dia da semana = quarta-feira");
                break;
            case 5:
                System.out.println("Dia da semana = quinta-feira");
                break;
            case 6:
                System.out.println("Dia da semana = sexta-feira");
                break;
            case 7:
                System.out.println("Dia da semana = sabado");
                break;
            default:
                System.out.println("Dia Invalido");
        }


        ex.close();
    }
}
