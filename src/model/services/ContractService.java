package model.services;

import java.util.Calendar;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private OnlinePayment onlinePayment;
	
	
	
	public ContractService(OnlinePayment onlinePayment) {
	
		this.onlinePayment = onlinePayment;
	}

	public void processContract(Contract contract, Integer months) {
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(contract.getDate());
		
		double amount = contract.getTotalValue()/months;
		
		for(int i = 1 ; i <= months ; i++) {
			
			double amountInstallment = onlinePayment.interest(onlinePayment.paymentFee(amount), i) ;
			
			cal.set(Calendar.MONTH, cal.get(Calendar.MONTH) + 1 );
			
			contract.addContract(new Installment(cal.getTime(), amountInstallment));
			
		}

	}

}
