package ListaExercicios;

import java.util.Scanner;

public class ex24 {

	public static void main(String[] args) {
		
		Scanner n1 = new Scanner(System.in);
		
		int n ;
		
		for(int c = 0; c < 10; c++) {
			
			System.out.println("Digite um n�mero: ");
			n = n1.nextInt();
			
			if(n > 1) {
				System.out.println("O n�mero " + n + " � POSITIVO");
			} else if(n == 0) {
				System.out.println("O n�mero digitado � NULO");
			} else if(n < 0) {
				System.out.println("O n�mero " + n + " � NEGATIVO");
			}
		}
		
		System.out.println("Fim");
		
		n1.close();
	}
}
