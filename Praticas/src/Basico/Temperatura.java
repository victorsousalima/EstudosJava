package Basico;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		
		Scanner temperatura = new Scanner(System.in);
		
		System.out.println("Digite uma temperatura em Graus(c): ");
		double c = temperatura.nextDouble();
		
		double f = c * 1.8 + 32;
		
		double k = c + 273.15;
		
		double re = c * 0.8;
		
		double ra = c * 1.8 + 32 + 479.67;
		
		System.out.println("A temperatura convertidade de Graus(c) para Fahrenheit �: " + f);
		System.out.println("A temperatura convertidade de Graus(c) para Kelvin �: " + k);
		System.out.println("A temperatura convertidade de Graus(c) para R�aumur �: " + re);
		System.out.println("A temperatura convertidade de Graus(c) para Rankine �: " + ra);
		
		temperatura.close();
	}
}
