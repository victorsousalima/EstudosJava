package EstruturaDeControle;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int n = entrada.nextInt();
		
		if(n >0 && n <10) {
			if(n % 2 == 0) {
				System.out.println("O n�mero est� entre 0 e 10 e � PAR");
			} else {
				System.out.println("O n�mero est� entre 0 e 10 e n�o � PAR");
			}
		}else {
			System.out.println("O n�mero � Invalido");	
		}
		
		entrada.close();
	}
}
