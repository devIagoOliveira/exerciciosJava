import java.util.Locale;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo, qtd;
		double valorTotal;

		codigo = sc.nextInt();
		qtd = sc.nextInt();

		if (codigo == 1) {
			valorTotal = qtd * 4.00;
			System.out.printf("Total: R$ %.2f%n", valorTotal);
		} else if (codigo == 2) {
			valorTotal = qtd * 4.50;
			System.out.printf("Total: R$ %.2f%n", valorTotal);
		} else if (codigo == 3) {
			valorTotal = qtd * 5.00;
			System.out.printf("Total: R$ %.2f%n", valorTotal);
		} else if (codigo == 4) {
			valorTotal = qtd * 2.00;
			System.out.printf("Total: R$ %.2f%n", valorTotal);
		} else if (codigo == 5) {
			valorTotal = qtd * 1.50;
			System.out.printf("Total: R$ %.2f%n", valorTotal);
		} else {
			System.out.println("ERROR");
		}

		sc.close();

	}

}
