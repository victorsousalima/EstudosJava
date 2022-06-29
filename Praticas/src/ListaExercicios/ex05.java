package ListaExercicios;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		Scanner nota = new Scanner(System.in);
		
		
		System.out.println("Qual o Nome do Aluno: ");
		String nome = nota.nextLine();
		
		System.out.println("Qual a nota da Primeira prova: ");
		double p1 = nota.nextDouble();
		
		System.out.println("Qual a nota da Segunda prova: ");
		double p2 = nota.nextDouble();
		
		System.out.println("Qual a nota da Terceira prova: ");
		double p3 = nota.nextDouble();
		
		double media = (p1 + p2 + p3) / 3;
		
		System.out.println("Nome do aluno: " + nome);
		System.out.printf("A média da prova foi: %.2f" , media);
		
		
		nota.close();
	}
}
