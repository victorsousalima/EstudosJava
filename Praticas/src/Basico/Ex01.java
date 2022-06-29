package Basico;

public class Ex01 {
	
	public static void main(String[] args) {
		
		var nome = "Victor";
		var Sobrenome = "Sousa";
		var AnodeN= 2005;
		var AnoA= 2022;
		var Cidade = "Osasco";
		
		var idade = AnoA - AnodeN;
		
		System.out.println("Nome: " + nome +" "+ Sobrenome);
		System.out.println("Idade: " + idade);
		System.out.println("Cidade Natal: " + Cidade);
		
		//Sem Inferência
		
		String nome2 = "Paulo";
		String Sobrenome2 = "Silva";
		int AnoN = 2002;
		int AnoA2 = 2022;
		String Cidade2 = "Barueri";
		
		int Idade2 = AnoA2 - AnoN;
		
		System.out.println("\nNome: " + nome2 + " " + Sobrenome2);
		System.out.println("Idade: " + Idade2);
		System.out.println("Cidade Natal: " + Cidade2);
	}
}
