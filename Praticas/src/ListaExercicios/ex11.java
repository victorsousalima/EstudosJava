package ListaExercicios;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		
		Scanner preco = new Scanner(System.in);
		
		System.out.println("Digite o preço de custo do produto: ");
		double pc = preco.nextDouble();
		
		System.out.println("Digite o preço de venda do produto: ");
		double pv = preco.nextDouble();
		
		double lu = pv - pc;
		
		System.out.printf("O lucro do produto é de: R$%.2f" , lu);
		
		preco.close();
	}
}
