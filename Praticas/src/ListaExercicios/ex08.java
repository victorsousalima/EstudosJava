package ListaExercicios;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		
		Scanner dolar = new Scanner(System.in);
		
		System.out.println("Quantos dolars voc� tem? ");
		double dol = dolar.nextDouble();
		
		System.out.println("Qual o pre�o da cota��o do dolar atualmente: ");
		double pdol = dolar.nextDouble();
		
		double real = dol * pdol;
		
		System.out.println("O valor do dolar convertido em real �: " + real);
		
		dolar.close();
	}
}
