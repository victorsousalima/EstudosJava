package Basico;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
			
			System.out.println("Digite o seu Nome: ");
			String nome = entrada.nextLine();
			
			System.out.println("Digite o ano em que se encontra atualmente: ");
			int at = entrada.nextInt();
			
			System.out.println("Digite o ano em que nasceu: ");
			int an = entrada.nextInt();
			
			int idade = at - an;
			
			System.out.println("O " + nome + " tem " + idade + " anos de idade!!");
		
		
			
		
		entrada.close();
	}
}
