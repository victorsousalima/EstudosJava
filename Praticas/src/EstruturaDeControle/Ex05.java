package EstruturaDeControle;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
Scanner entrada = new Scanner(System.in);
		
		int cd = 0;
		System.out.println("Digite um número: ");
		int n = entrada.nextInt();
		
		for(int i = 2; i < n ; i++) {
			if(n % i == 0) {
				cd++;
			}
		}
		
		
		switch(cd) {
		case 0:
			System.out.println("O número " + n + " é PRIMO");
			break;
		default:
			System.out.println("O número " + n + " não é Primo!");
		}
		
		
		entrada.close();
	}
}
