package ListaExercicios;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		
		Scanner nota = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double n1 = nota.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double n2 = nota.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		double n3 = nota.nextDouble();
		
		double media = (n1 + n2 + n3)/ 3;
		
		System.out.printf("A média do aluno foi: %.2f\n", media);
		
		if(media > 10 && media < 0){
			System.out.println("Media Invalida!");
		}else if(media >= 7) {
			System.out.println("Aluno Aprovado!");
		} else if(media > 5.1 && media < 6.9) {
			System.out.println("Aluno de Recuperação!");
		} else if(media <= 5) {
			System.out.println("Aluno Reprovado");
		}
		
		nota.close();
	}
}
