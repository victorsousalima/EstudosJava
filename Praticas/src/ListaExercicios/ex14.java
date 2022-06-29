package ListaExercicios;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		
		Scanner dnum = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n1 = dnum.nextInt();
		
		System.out.println("Digite outro número: ");
		int n2 = dnum.nextInt();
		
		if(n1 > n2) {
			System.out.println("O " + n1 + " é maior que " + n2 + " !!");
		} else if(n1 == n2){
			System.out.println("O " + n1 + " é igual a " + n2 + " !!");
		} else {
			System.out.println("O " + n2 + " é maior que " + n1 + " !!");
		}
		
		dnum.close();
	}
}
