package ListaExercicios;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		Scanner salario = new Scanner(System.in);
		
		
		System.out.println("Digite o nome: ");
		String nome = salario.nextLine();
		
		System.out.println("Digite seu salário fixo: ");
		double salf = salario.nextDouble();
		
		System.out.println("Vendas efetuadas no mês em dinheiro: ");
		double vm = salario.nextDouble();
		
		var bn = vm * 0.15;
		var sf = salf + bn;
		
		System.out.println("Nome: " + nome);
		System.out.println("Sálario Fixo: " + salf);
		System.out.println("Sálario Final: " + sf);
		
		
		salario.close();
	}
}
