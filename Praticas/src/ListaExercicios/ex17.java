package ListaExercicios;

import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		int n1;
		int qtd = 0;
		
		for(int c = 0; c < 10 ; c++) {
			
			System.out.println("Digite um n�mero: ");
			n1 = num.nextInt();
			
			if(n1 > 10 && n1 < 150) {
				qtd++;
			}
		}
		
		System.out.println("Ao total foram "+ qtd + " n�meros que est�o entre 10 e 150!!");
		
		num.close();
	}
}
