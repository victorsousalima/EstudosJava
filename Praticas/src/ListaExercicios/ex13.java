package ListaExercicios;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int n1 = num.nextInt();
		
		if(n1 > 10) {
			System.out.println("O n�mero digitado � maior que 10");
		} else {
			System.out.println("O n�mero digitado � menor que 10");
		}
		
		num.close();
	}
}
