package Basico;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		
		Scanner pratica = new Scanner(System.in);
		
		System.out.println("Digite o primeiro S�lario: ");
		String n1 = pratica.nextLine().replace(",", ".");
		
		System.out.println("Digite o segundo S�lario: ");
		String n2 = pratica.nextLine().replace(",", ".");
		
		System.out.println("Digite o terceiro S�lario: ");
		String n3 = pratica.nextLine().replace(",", ".");
		
		double s1 = Double.parseDouble(n1);
		double s2 = Double.parseDouble(n2);
		double s3 = Double.parseDouble(n3);
		
		double media = (s1 + s2 + s3) / 3;
		
		System.out.println("A m�dia s�larial foi de: " + media);
		
		
		
		
		pratica.close();	
		
	}
}
