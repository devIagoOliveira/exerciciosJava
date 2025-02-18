import java.util.Locale;
import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x, taxa;
		
		x = sc.nextDouble();
		
		if (x >= 0 && x <= 2000) {
			System.out.println("Isento");
		} else if (x > 2000 && x <= 3000) {
			taxa = (x - 2000) * 0.08;
			System.out.printf("R$ %.2f%n", taxa);
		} else if (x > 3000 && x <= 4500) {
			taxa = ((x - 3000) * 0.18) + 1000 * 0.08;
			System.out.printf("R$ %.2f%n", taxa);
		} else if (x > 4500) {
			taxa = ((x - 4500) * 0.28) + 1500 * 0.18 + 1000 * 0.08;
			System.out.printf("R$ %.2f%n", taxa);
		} else {
			System.out.println("ERROR");
		}

		sc.close();

	}

}
