package EstruturaDeControle;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner s07 = new Scanner(System.in);
		
		int c = 0;
		int s = 0;
		
		while(c >= 0){
			System.out.println("Digite um número positivo: (0 ou negativo para encerrar o Programa!)");
			c = s07.nextInt();
			
			if(c >= 0) {
				s+=c;
				System.out.println("A soma dos numeros é: " + s);
			}
		}
		
		System.out.println("O programa encerrou!");
		
		s07.close();
	}
}
