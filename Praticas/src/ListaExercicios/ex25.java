package ListaExercicios;

import java.util.Scanner;

public class ex25 {

	public static void main(String[] args) {
		
		try(Scanner emp = new Scanner(System.in)){ 
			
		String nome;
		double sl, sm ,sf;
		double fp = 0;
		double sf2 = 0;
		int c = 0;
			
		for(; c < 5 ; c++) {
				
			System.out.println("Digite seu nome: ");
			nome = emp.next();
				
			System.out.println("Digite o seu sálario atual: ");
			sl = emp.nextDouble();
				
			System.out.println("Digite o sálario minimo atual: ");
			sm = emp.nextDouble();
				
			System.out.println("Nome do funcionário: " + nome);
				
			if(sl < sm * 3) {
				sf = sl * 0.50;
				sf2 = sl + sf;
				System.out.printf("O seu sálario final (Ganho de 50%) é: R$%.2f", sf2);
			} else if(sl > sm * 3 && sl < sm * 10) {
				sf = sl * 0.20;
				sf2 = sl + sf;
				System.out.printf("O seu sálaro final (Ganho de 20%) é de: R$%.2f", sf2);
			} else if(sl > sm * 10 && sl < sm * 20) {
				sf = sl * 0.15;
				sf2 = sl + sf;
				System.out.printf("O seu sálario final (Ganho de 15%) é de: R$%.2f", sf2);
			} else if(sl > sm * 20) {
				sf = sl * 0.10;
				sf2 = sl + sf;
				System.out.printf("O seu sálario final é (Ganho de 10%) de: R$%.2f", sf2);
			}
				
			fp += sf2;	
			
			}
			
			
		System.out.println("Fim");
		System.out.printf("A folha de pagamento da empresa depois dos Acrecimos é: R$%.2f" , fp);
			
		}
	}
}

