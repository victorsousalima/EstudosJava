package ListaExercicios;

import java.util.Scanner;

public class ex23 {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		int n ;
		String c = "";
		
		while(!"Não".equalsIgnoreCase(c)) {
			
			System.out.println("Digite um número: ");
			n = num.nextInt();
			
			if(n > 80) {
				System.out.println("O número "+ n + " é Maior que 80!");
			} else if(n == 40) {
				System.out.println("O número digitado é igual a 40!!");
			} else if(n < 25) {
				System.out.println("O número " + n + " é menor que 25");
			} 
			
			System.out.println("Quer continuar? Sim/Não");
			c = num.next();
		}
		
		System.out.println("Fim!");
		
		num.close();
	}
}
