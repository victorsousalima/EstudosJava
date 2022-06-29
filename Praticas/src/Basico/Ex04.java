package Basico;

import java.util.Scanner;


public class Ex04 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int c = 1;
		
		System.out.println("Qual tabuada você quer ver? ");
		int t = entrada.nextInt();
		
		while(c <= 10) {
			
			int m = c* t;
			System.out.println(t + " x " + c +" = " + m);
			c++;
		}
		
		
		
		entrada.close();
	}
}
