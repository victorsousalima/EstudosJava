package ListaExercicios;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		Scanner salario = new Scanner(System.in);
		
		
		System.out.println("Digite o nome: ");
		String nome = salario.nextLine();
		
		System.out.println("Digite seu sal�rio fixo: ");
		double salf = salario.nextDouble();
		
		System.out.println("Vendas efetuadas no m�s em dinheiro: ");
		double vm = salario.nextDouble();
		
		var bn = vm * 0.15;
		var sf = salf + bn;
		
		System.out.println("Nome: " + nome);
		System.out.println("S�lario Fixo: " + salf);
		System.out.println("S�lario Final: " + sf);
		
		
		salario.close();
	}
}
