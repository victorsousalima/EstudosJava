package ListaExercicios;

import java.util.Scanner;

public class ex21 {

	public static void main(String[] args) {
		
		Scanner inf = new Scanner(System.in);
		
		String nome, sexo, saude;
		int idade;
		int tot = 0;
		
		for(String c = ""; !"Não".equalsIgnoreCase(c); ) {
			
			System.out.println("Digite o seu nome: ");
			nome = inf.nextLine();
			
			System.out.println("Digite o seu sexo: ");
			sexo = inf.nextLine();
			
			System.out.println("Digite a sua Idade: ");
			idade = inf.nextInt();
			
			inf.nextLine();
			
			System.out.println("Situação de saude: ");
			saude = inf.nextLine();
			
			if(idade >= 18 && "Boa".equalsIgnoreCase(saude)) {
				System.out.println("Você está apto a fazer o Serviço Militar!");
				tot++ ;
			} else if(idade < 0) {
				System.out.println("Idade Invalida");
			} else {
				System.out.println("Você não está apto a Fazer o Serviço Militar");
			}
			
			System.out.println("Nome: " + nome);
			System.out.println("Sexo: " + sexo);
			System.out.println("Idade: " + idade);
			System.out.println("Saude:  " + saude);
			
			System.out.println("Quer continuar?");
			c = inf.nextLine();
		}
		
		System.out.println("O total de pessoas apta a Fazer o Serviço Militar é: " + tot);
		
		inf.close();
	}
}
