package ListaExercicios;

import java.util.Scanner;

public class ex21 {

	public static void main(String[] args) {
		
		Scanner inf = new Scanner(System.in);
		
		String nome, sexo, saude;
		int idade;
		int tot = 0;
		
		for(String c = ""; !"N�o".equalsIgnoreCase(c); ) {
			
			System.out.println("Digite o seu nome: ");
			nome = inf.nextLine();
			
			System.out.println("Digite o seu sexo: ");
			sexo = inf.nextLine();
			
			System.out.println("Digite a sua Idade: ");
			idade = inf.nextInt();
			
			inf.nextLine();
			
			System.out.println("Situa��o de saude: ");
			saude = inf.nextLine();
			
			if(idade >= 18 && "Boa".equalsIgnoreCase(saude)) {
				System.out.println("Voc� est� apto a fazer o Servi�o Militar!");
				tot++ ;
			} else if(idade < 0) {
				System.out.println("Idade Invalida");
			} else {
				System.out.println("Voc� n�o est� apto a Fazer o Servi�o Militar");
			}
			
			System.out.println("Nome: " + nome);
			System.out.println("Sexo: " + sexo);
			System.out.println("Idade: " + idade);
			System.out.println("Saude:  " + saude);
			
			System.out.println("Quer continuar?");
			c = inf.nextLine();
		}
		
		System.out.println("O total de pessoas apta a Fazer o Servi�o Militar �: " + tot);
		
		inf.close();
	}
}
