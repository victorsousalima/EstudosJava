package Basico;

import java.util.Scanner;

public class AzulejosParede {

	public static void main(String[] args) {
		
		Scanner azulejo = new Scanner(System.in);
		
		double lp, hp, ha, la, qtd;
		
		System.out.println("Altura da parede é: ");
		hp = azulejo.nextDouble();
		
		System.out.println("Largura da parede é: ");
		lp = azulejo.nextDouble();
		
		System.out.println("Altura do azulejo é: ");
		ha = azulejo.nextDouble();
		
		System.out.println("Largura do azulejo é: ");
		la = azulejo.nextDouble();
		
		qtd = (hp * lp)/(ha * la);
		
		System.out.println("A Quantidade de azulejos é: " + qtd);
		
		azulejo.close();
	}
}
