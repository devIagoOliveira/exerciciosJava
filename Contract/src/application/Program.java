package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Entre com os dados do contrato:");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
		System.out.print("Valor do contrato: ");
		double contractValue = sc.nextDouble();

		Contract contract = new Contract(number, date, contractValue);

		System.out.print("Enter com o número de parcelas: ");
		int numberInstallment = sc.nextInt();

		ContractService onlinePaymentService = new ContractService(new PaypalService());

		onlinePaymentService.processContract(contract, numberInstallment);

		System.out.println("Parcelas:");

		for (Installment installment : contract.getInstallments()) {
			System.out.println(installment);
		}

		sc.close();
	}

}
