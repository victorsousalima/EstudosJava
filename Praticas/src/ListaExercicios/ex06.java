package ListaExercicios;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		
		
		System.out.println("Digite o valor para a Variavel A = ");
		int a = valor.nextInt();
		
		System.out.println("Digite o valor para a Variavel B = ");
		int b = valor.nextInt();
		
		
		var a1 = b;
		var b1 = a;
		
		
		System.out.println("A variavel A depois da troca Vale = " + a1);
		System.out.println("A variavel B depois da troca Vale = " + b1);
		
		valor.close();
	}
}
