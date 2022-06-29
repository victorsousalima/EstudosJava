package ListaExercicios;

import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
	
		Scanner carro = new Scanner(System.in);
		
		int ano;
		int tot2 = 0;
		int tot = 0;
		double desc,pe;
		double vf = 0;
		
		for(String c = "";!"Não".equalsIgnoreCase(c); ) {
			
			System.out.println("Qual o ano do Carro em que deseja comprar: ");
			ano = carro.nextInt();
			
			System.out.println("Qual o preco do Carro: ");
			pe = carro.nextDouble();
			
			if(ano <= 2000) {
				desc = pe * 0.12;
				vf = pe - desc;
				tot2++ ;
			} else if(ano > 2000) {
				desc = pe * 0.07;
				vf = pe - desc;
			} else {
				System.out.println("Carro Invalido");
			}
			
			tot++ ;
			
			System.out.println("Preço final com desconto é de: " + vf);
			System.out.println("Deseja Continuar? ");
			c = carro.next();
			
		}
		
		System.out.println("O total de carros abaixo dos anos 2000 foi de: " + tot2);
		System.out.println("O total de carros digitados foram: " + tot);
		
		
		carro.close();
	}
	
}
