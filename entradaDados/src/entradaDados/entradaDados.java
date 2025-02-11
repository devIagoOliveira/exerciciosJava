package entradaDados;

import java.util.Locale;
import java.util.Scanner;

public class entradaDados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		String x;
		System.out.println("Digite seu nome:");
		x = sc.next();
		System.out.println("Você digitou: " + x);
		System.out.println();
		
		int y;
		System.out.println("Digite sua idade:");
		y = sc.nextInt();
		System.out.println("Você digitou: " + y);
		System.out.println();
		
		double z;
		System.out.println("Digite sua altura:");
		z = sc.nextDouble();
		System.out.printf("Você digitou: %.2f%n",  z);
		System.out.println();
		
		char w;
		System.out.println("Digite seu sexo (M ou F):");
		w = sc.next().charAt(0);
		System.out.println("Você digitou: " +  w);
		System.out.println();
		
		//ler vários dados na mesma linha
		String s;
		int i;
		double d;
		System.out.println("Digite na mesma linha seu nome, idade e altura:");
		s = sc.next();
		i = sc.nextInt();
		d = sc.nextDouble();
		System.out.println("Você digitou: ");
		System.out.println(s);
		System.out.println(i);
		System.out.printf("%.2f%n", d);
		System.out.println();
		
		//ler vários dados na mesma linha e guardar na mesma váriavel
		//quebra de linha pendente, usar comando abaixo para resolver
		
		sc.nextLine();
		System.out.println("Digite 3 nomes completos:");
		
		String s1, s2, s3;
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Você digitou:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
		
	}

}
