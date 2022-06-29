package EstruturaDeControle;

import java.util.Scanner;

public class ConjuntoMascFem {

	public static void main(String[] args) {
		
		Scanner conjunto = new Scanner(System.in);
		
		String sexo;
		double alt;
		double mah = 0;
		double ma = 0;
		double me = 100;
		int nm = 0;
		int qth = 0;
		double soma = 0;
		
		for(int c = 0; c <= 10; c++) {
			
			System.out.println("Digite o sexo: ");
			sexo = conjunto.next();
			
			System.out.println("Digite a altura: ");
			alt = conjunto.nextDouble();
			
			
			if(alt > ma) {
				ma = alt;
			}else if(alt < me){
				me = alt;
			}
			
			if("masculino".equalsIgnoreCase(sexo)) {
				qth ++;
				soma += alt;
				mah = soma / qth;
			}
			
			if("feminino".equalsIgnoreCase(sexo)) {
				nm++;
			}
	
		}
		
		System.out.println("A maior altura do grupo foi: " + ma);
		System.out.println("A menor altura do grupo foi: " + me);
		System.out.println("A media de altura dos Homens foi: " + mah);
		System.out.println("O numero de mulheres foi: " + nm);
		
		
		
		conjunto.close();
	}
}
