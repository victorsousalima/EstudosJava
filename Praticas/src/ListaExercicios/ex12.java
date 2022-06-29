package ListaExercicios;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		
		Scanner carro = new Scanner(System.in);
		
		System.out.println("Custo de um carro de fábrica: ");
		double cdc = carro.nextDouble();
		
		var api = cdc * 0.45;
		var imp = cdc + api;
		
		var pdd = imp * 0.28;
		var pf = imp + pdd;
		
		System.out.printf("O preço que o Consumidor irá pagar é de: R$%.2f", pf);
		
		
		carro.close();
	}
}
