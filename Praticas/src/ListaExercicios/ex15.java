package ListaExercicios;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int n1 = num.nextInt();
		
		if(n1 > 100 && n1 < 200) {
			System.out.println("O n�mero " + n1 + " est� entre 100 e 200!!");
		} else {
			System.out.println("O n�mero " + n1 + " n�o est� entre  100 e 200!!");
		}
		
		num.close();
	}
}
