package ListaExercicios;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		
		Scanner compra = new Scanner(System.in);
		
		System.out.println("Qual o valor da compra: ");
		double vc = compra.nextDouble();
		
		double vp = vc / 5;
		
		System.out.println("Os valores das prestações de 5x será de: " + vp);
		
		compra.close();
	}
}
