import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PayPalService;

public class Apliccation {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter Contract data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy):");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		double totalValue = sc.nextDouble();
		System.out.print("Enter number of installments: ");
		int months = sc.nextInt();
		
		Contract contract = new Contract(number, date, totalValue);
		
		ContractService contractService = new ContractService(new PayPalService());
		
		contractService.processContract(contract, months);
		
		
		System.out.println("\nInstallments: ");
		
		for(Installment item: contract.getInstallment()) {
			
			System.out.println(item);
			
		}
	
		sc.close();
	}

}
