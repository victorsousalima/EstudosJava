package EstruturaDeControle;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double n1 = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double n2 = entrada.nextDouble();
		
		double m = (n1 + n2)/ 2;
		
		System.out.println("Sua média é: " + m);
		
		if(m >= 7.0) {
			System.out.println("Aluno Aprovado!");
		} else if(m < 7.0 && m >= 4.0) {
			System.out.println("Aluno de Recuperação!");
		} else {
			System.out.println("Aluno Reprovado!");
		}
		
		entrada.close();
	}
}
