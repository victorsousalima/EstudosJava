package EstruturaDeControle;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner ex8 = new Scanner(System.in);
		
		System.out.println("Digite uma Palavra: ");
		String p = ex8.nextLine();
		
		char letras[] = p.toCharArray();
		
		for(int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
		
		ex8.close();
	}
}
