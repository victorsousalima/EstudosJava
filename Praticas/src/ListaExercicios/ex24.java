package ListaExercicios;

import java.util.Scanner;

public class ex24 {

	public static void main(String[] args) {
		
		Scanner n1 = new Scanner(System.in);
		
		int n ;
		
		for(int c = 0; c < 10; c++) {
			
			System.out.println("Digite um número: ");
			n = n1.nextInt();
			
			if(n > 1) {
				System.out.println("O número " + n + " é POSITIVO");
			} else if(n == 0) {
				System.out.println("O número digitado é NULO");
			} else if(n < 0) {
				System.out.println("O número " + n + " é NEGATIVO");
			}
		}
		
		System.out.println("Fim");
		
		n1.close();
	}
}
