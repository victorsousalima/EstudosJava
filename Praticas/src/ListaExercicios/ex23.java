package ListaExercicios;

import java.util.Scanner;

public class ex23 {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		int n ;
		String c = "";
		
		while(!"N�o".equalsIgnoreCase(c)) {
			
			System.out.println("Digite um n�mero: ");
			n = num.nextInt();
			
			if(n > 80) {
				System.out.println("O n�mero "+ n + " � Maior que 80!");
			} else if(n == 40) {
				System.out.println("O n�mero digitado � igual a 40!!");
			} else if(n < 25) {
				System.out.println("O n�mero " + n + " � menor que 25");
			} 
			
			System.out.println("Quer continuar? Sim/N�o");
			c = num.next();
		}
		
		System.out.println("Fim!");
		
		num.close();
	}
}
