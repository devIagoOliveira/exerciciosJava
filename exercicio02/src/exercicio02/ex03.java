package exercicio02;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int A, B, C, D;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		int dif = A * B - C * D;
		
		System.out.println("DIFERENCA = " + dif);
		
		sc.close();
	}

}
