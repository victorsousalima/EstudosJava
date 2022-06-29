package Basico;

import java.util.Scanner;

public class DesafioIMC {

		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Digite sua altura: ");
			double altura = entrada.nextDouble();
			
			System.out.println("Digite seu peso: ");
			double peso = entrada.nextDouble();
			
			double imc = peso / (altura * altura);
			
			System.out.println("Seu Imc é: " + imc);
			
			if(imc < 18.5) {
				System.out.println("Abaixo do Peso");
			} else if(imc >=18.5 && imc <=24.9) {
				System.out.println("Peso Normal");
			} else if(imc >=25.0 && imc <=29.9) {
				System.out.println("Sobrepeso");
			} else if(imc >=30.0 && imc <=34.9) {
				System.out.println("Obesidade Grau 1");
			} else if(imc >=35.0 && imc <=39.9) {
				System.out.println("Obesidade Grau 2");
			} else if(imc >= 40) {
				System.out.println("Obesidade Mórbida");
			} else {
				System.out.println("Imc Inválido");
			}
				
		
			entrada.close();
		}
}
