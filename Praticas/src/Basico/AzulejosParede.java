package Basico;

import java.util.Scanner;

public class AzulejosParede {

	public static void main(String[] args) {
		
		Scanner azulejo = new Scanner(System.in);
		
		double lp, hp, ha, la, qtd;
		
		System.out.println("Altura da parede �: ");
		hp = azulejo.nextDouble();
		
		System.out.println("Largura da parede �: ");
		lp = azulejo.nextDouble();
		
		System.out.println("Altura do azulejo �: ");
		ha = azulejo.nextDouble();
		
		System.out.println("Largura do azulejo �: ");
		la = azulejo.nextDouble();
		
		qtd = (hp * lp)/(ha * la);
		
		System.out.println("A Quantidade de azulejos �: " + qtd);
		
		azulejo.close();
	}
}
