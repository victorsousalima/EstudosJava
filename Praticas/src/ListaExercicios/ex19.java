package ListaExercicios;

import java.util.Scanner;

public class ex19 {

	public static void main(String[] args) {
		
		Scanner is = new Scanner(System.in);
		
		String nome, sexo;
		int c = 0;
		int qth = 0;
		int qtm = 0;
		
		while(c < 10) {
			
			System.out.println("Digite o seu Nome: ");
			nome = is.nextLine();
			
			System.out.println("Digite o Sexo: ");
			sexo = is.nextLine();
			
			if("Masculino".equalsIgnoreCase(sexo)) {
				qth++ ;
			} else if("Feminino".equalsIgnoreCase(sexo)) {
				qtm++;
			}
			
			System.out.println("Nome: " + nome);
			System.out.println("Sexo: " + sexo);
			
			c++;
		}
		
		System.out.println("Total de Homens = " + qth);
		System.out.println("Total de Mulheres = " + qtm);
		
		is.close();
	}
}
