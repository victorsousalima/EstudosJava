package EstruturaDeControle;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int ng = 89;
		int n = 0;
		
		for(int i = 10; i >=0 ; i--) {
			
			System.out.println("Digite um numero de 0--100 \nSe quiser encerrar o programa digite 0");
			n = entrada.nextInt();
			
			
			
			if(n == 0) {
				System.out.println("O programa foi finalizado!");
				break;
			} else if(n == ng) {
				System.out.println("Voc� Advinhou o n�mero certo!  { "+ ng + " = " + n + " }");
				break;
			} else if(n > ng) {
				System.out.println("O numero que voc� quer advinhar � Menor que "+ n);
				System.out.println("Voc� tem mais "+ i + " tentativas para advinhar!");
			} else if(n < ng) {
				System.out.println("O numero que voc� quer advinhar � Maior que "+ n);
				System.out.println("Voc� tem mais "+ i + " tentativas para advinhar!");
			}
			
			if(i == 0) {
				System.out.println("Suas chances acabaram!");
			}
			
		}
		
		
		
		entrada.close();
	}
}
