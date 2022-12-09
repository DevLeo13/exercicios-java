package src.exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int id, quanti, Id, Quanti; 
		double valor, Valor;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o ID da peça 1: ");
		id = sc.nextInt();

		System.out.print("Digite o numero de peças 1: ");
		quanti = sc.nextInt();
		
		System.out.print("Digite o valor da peça 1: ");
		valor = sc.nextDouble();
		
		System.out.print("Digite o ID da peça 2: ");
		Id = sc.nextInt();

		System.out.print("Digite o numero de peças 2: ");
		Quanti = sc.nextInt();
		
		System.out.print("Digite o Valor da peça 2: ");
		Valor = sc.nextDouble();
		
		double total = quanti * valor + Quanti * Valor;;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f " , total);
	}
}
