package ListaExercicios;

import java.util.Scanner;

public class ex07 {
	
	public static void main(String[] args) {
		
		Scanner temp = new Scanner(System.in);
		
		
		System.out.println("Digite a temperatura em Celsius: ");
		double c = temp.nextDouble();
		
		double f = (c * 1.8) + 32;
		
		System.out.println("A conversão de Celsius para Fahrenheit é: " + f);
		
		
		temp.close();
	}
}
