package model.services;

public class PayPalService implements OnlinePayment{

	@Override
	public Double paymentFee(Double amount) {
		
		return (amount * 1.02);
	}

	@Override
	public Double interest(Double amount, Integer months) {
		
		
		return amount*(1 + 0.01*months);
	}

	
	
}
