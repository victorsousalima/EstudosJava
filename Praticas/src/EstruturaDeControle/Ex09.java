package EstruturaDeControle;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner ex9 = new Scanner(System.in);
		
		int n = 0;
		int s = 0;
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("Digite um número: ");
			n = ex9.nextInt();
			
			if(n > s) {
				s = n;
			}
		}
		
		System.out.println("O maior número digitado foi: " + s);
		
		ex9.close();
	}
}
