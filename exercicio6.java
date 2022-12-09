package src.exercicio1;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		double A, B, C, pi = 3.14159, raio;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Primeiro digito: ");
		A = sc.nextDouble();
		
		System.out.println("Segundo digito: ");
		B = sc.nextDouble();

		System.out.println("Terceiro digito: ");
		C = sc.nextDouble();
		
		double trian = A * C / 2; 
		double circulo = pi * (C * C);
		double trape = (A + B) * C / 2;
		double quadra = Math.pow(B, 2.0);
		double retan = A * B;
		
		System.out.printf("TRIANGULO: %.3f" , trian);
		System.out.println();
		
		System.out.printf("CIRCULO: %.3f" , circulo);
		System.out.println();

		System.out.printf("TRAPEZIO: %.3f" , trape);
		System.out.println();

		System.out.printf("QUADRADO: %.3f" , quadra);
		System.out.println();
		
		System.out.printf("RETANGULO: %.3f" , retan);
		System.out.println();
	}

}
