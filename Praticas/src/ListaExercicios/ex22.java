package ListaExercicios;

import java.util.Scanner;

public class ex22 {

	public static void main(String[] args) {
		
		Scanner produto = new Scanner(System.in);
		
		double pc, pv, mpc, mpv, lc, pd;
		double pcm = 0;
		double pvm = 0;
		
		for(int c = 0; c < 5 ; c++) {
			
			System.out.println("Preço de custo do produto: ");
			pc = produto.nextDouble();
			
			System.out.println("Preço de venda do produto: ");
			pv = produto.nextDouble();
			
			pcm +=pc;
			pvm +=pv;
			
			if(pc < pv) {
				lc = pv - pc;
				System.out.printf("Houve um lucro de R$%.2f\n", lc);
			} else if(pc > pv) {
				pd = pc - pv;
				System.out.printf("Houve uma perda de R$%.2f\n", pd);
			} else if(pc == pv) {
				System.out.println("Houve um empate");
			}
		}
		
		mpc = pcm / 5;
		mpv = pvm / 5;
		
		System.out.printf("A media do preço de Custo é: R$%.2f\n", mpc);
		System.out.printf("A media do preço de Venda é: R$%.2f", mpv);
		
		
		produto.close();
	}
}
