package LogicaComJava;

import java.util.Scanner;

public class ex1047 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        int horaInicial = ex.nextInt();
        int minutoInicial = ex.nextInt();
        int horaFinal = ex.nextInt();
        int minutoFinal = ex.nextInt();

        int instanteInicial = horaInicial * 60 + minutoInicial;
        int instanteFinal = horaFinal * 60 + minutoFinal;

        int duracao;
        if (instanteInicial < instanteFinal) {
            duracao = instanteFinal - instanteInicial;
        }
        else {
            duracao = (24 * 60 - instanteInicial) + instanteFinal;
        }

        int duracaoHoras = duracao / 60;
        int duracaoMinutos = duracao % 60;

        System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");

        ex.close();
    }
}
