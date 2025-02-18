
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inicio, fim;

		inicio = sc.nextInt();
		fim = sc.nextInt();

		if (fim <= inicio) {
			System.out.println("O JOGO DUROU " + (fim - inicio + 24) + " HORA(S)");
		} else {
			System.out.println("O JOGO DUROU " + (inicio - fim + 24) + " HORA(S)");
		}

		sc.close();

	}

}
