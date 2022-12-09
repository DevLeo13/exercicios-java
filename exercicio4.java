package src.exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		int id, hours ;
		double VH;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o numero do funcionario: ");
		id =sc.nextInt();
		
		System.out.print("Digite a quantidade de horas trabalhadas: ");
		hours =sc.nextInt();
		
		System.out.print("Digite quanto esse funcionario recebe por hora: ");
		VH =sc.nextDouble();
		
		double salario = hours * VH;
		
		System.out.println("NUMBER = " + id);
		System.out.printf("SALARY = U$ %.2f" , salario);
	
	}
}
