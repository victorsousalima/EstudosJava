package ListaExercicios;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		
		Scanner rend = new Scanner(System.in);
		
		System.out.println("Qual o valor depositado esse mês: ");
		double va = rend.nextDouble();
		
		final double txr = 0.070;
		
		double tx = va * txr;
		double rendimento = va + tx;
		
		System.out.println("O valor depositado com redimento será de: " + rendimento);
		
		rend.close();
	}
}
