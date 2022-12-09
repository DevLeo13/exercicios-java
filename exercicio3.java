package src.exercicio1;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		A = sc.nextInt();
		
		System.out.print("Digite o primeiro valor: ");
		B = sc.nextInt();
		
		System.out.print("Digite o primeiro valor: ");
		C = sc.nextInt();
		
		System.out.print("Digite o primeiro valor: ");
		D = sc.nextInt();
		
		int conta = ((A*B)-(C*D));
		
		System.out.println("DIFERENCA = " + conta);
	}

}
