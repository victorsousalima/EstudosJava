package EstruturaDeControle;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o ano em que está: ");
		int ano = entrada.nextInt();
		
		if(ano % 4 == 0 && ano % 100 !=0) {
			System.out.println("O ano é Bissexto");
		} else {
			System.out.println("O ano não é Bissexto");
		}
		
		
		
		entrada.close();
	}
}
