package src.exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2  {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double x = 0; 
		double pi = 3.14159;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do raio: ");
		x = sc.nextDouble();
		
		double area = pi * (x*x);
		
		//Sysout para delimitar casas decimais
		System.out.printf("A= %.4f" , area);
	}
}
