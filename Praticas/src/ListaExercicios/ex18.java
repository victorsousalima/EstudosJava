package ListaExercicios;

import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		
		Scanner idade = new Scanner(System.in);
		
		int id;
		
		for(int c = 0; c < 5; c++) {
			
			System.out.println("Digite a sua Idade: ");
			id = idade.nextInt();
			
			if(id < 0 && id > 120) {
				System.out.println("Idade Invalida!");
			} else if(id >= 18) {
				System.out.println("é Maior de Idade");
			} else {
				System.out.println("é Menor de Idade");
			}
		}
		
		idade.close();
	}
}
