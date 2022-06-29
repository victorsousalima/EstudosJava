package ListaExercicios;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n1 = num.nextInt();
		
		if(n1 > 100 && n1 < 200) {
			System.out.println("O número " + n1 + " está entre 100 e 200!!");
		} else {
			System.out.println("O número " + n1 + " não está entre  100 e 200!!");
		}
		
		num.close();
	}
}
