package processor;

import java.util.List;

import bankslip.BankSlip;
import invoice.Invoice;

public class Processor {

	private Invoice invoice;
	private List<BankSlip> bankSlips;
	
	public Processor(Invoice invoice, List<BankSlip> bankSlips) {
		this.invoice = invoice;
		this.bankSlips = bankSlips;
	}

	public Invoice getInvoice() {
		return invoice;
	}
	
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	public List<BankSlip> getBankSlips() {
		return bankSlips;
	}
	
	public void setBankSlips(List<BankSlip> bankSlips) {
		this.bankSlips = bankSlips;
	}
	
}
