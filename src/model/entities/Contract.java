package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

	private Integer numberContract;
	private Date date;
	private Double totalValue;
	
	private List<Installment> installments = new ArrayList<Installment>();
	
	public Contract(Integer numberContract, Date date, Double totalValue) {
	
		this.numberContract = numberContract;
		this.date = date;
		this.totalValue = totalValue;
		
	}

	public Integer getNumberContract() {
		return numberContract;
	}

	public void setNumberContract(Integer numberContract) {
		this.numberContract = numberContract;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}
	
	public void addContract(Installment installment) {
		installments.add(installment);
	}
	
	public void removeContract(Installment installment) {
		installments.remove(installment);
	}
	
	public List<Installment> getInstallment(){
		
		return installments;		
		
	}
	
}
