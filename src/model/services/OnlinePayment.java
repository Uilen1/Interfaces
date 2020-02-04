package model.services;

public interface OnlinePayment {
	
	public Double paymentFee(Double amount);
	public Double interest(Double amount, Integer months);

}
