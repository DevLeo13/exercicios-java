package src.exercicio1;

import java.util.Scanner;

public class main{
	
	public static void main(String[] args){
	
	int x = 0;
	int y = 0;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Insira o primeiro valor:");
	x = sc.nextInt();
	
	System.out.print("Insira o segundo valor" );
	y = sc.nextInt();
	
	int sum = x + y;
	
	System.out.println("SOMA = " + sum);
	
	}
}