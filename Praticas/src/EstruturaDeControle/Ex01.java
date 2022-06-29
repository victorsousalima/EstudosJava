package EstruturaDeControle;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n = entrada.nextInt();
		
		if(n >0 && n <10) {
			if(n % 2 == 0) {
				System.out.println("O número está entre 0 e 10 e é PAR");
			} else {
				System.out.println("O número está entre 0 e 10 e não é PAR");
			}
		}else {
			System.out.println("O número é Invalido");	
		}
		
		entrada.close();
	}
}
