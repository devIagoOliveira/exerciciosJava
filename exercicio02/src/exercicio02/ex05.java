package exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner (System.in);
		
		int codigo1, qtd1, codigo2, qtd2;
		double valorUn1, valorUn2, valorTotal;
		
		codigo1 = sc.nextInt();
		qtd1 = sc.nextInt();
		valorUn1 = sc.nextDouble();
		//sc.nextLine();
				
		codigo2 = sc.nextInt();
		qtd2 = sc.nextInt();
		valorUn2 = sc.nextDouble();
		
		valorTotal = qtd1 * valorUn1 + qtd2 * valorUn2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
		
		sc.close();
	}

}
