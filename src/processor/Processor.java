package processor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import bankslip.BankSlip;
import invoice.Invoice;
import payment.Payment;

public class Processor {

	public Processor() {

	}

	public List<Payment> process(Invoice invoice, List<BankSlip> bankSlips) {
		double totalBankSlips = 0;
		List<Payment> payments = new ArrayList<Payment>();
		
		for (BankSlip bankSlip : bankSlips) {
			totalBankSlips += bankSlip.getValue();
			
			Payment payment = new Payment(bankSlip.getValue(), new Date(), "BANK_SLIP");
			payments.add(payment);
		}
		
		if (totalBankSlips >= invoice.getTotal())
			invoice.setPaid(true);
		
		return payments;
	}
	
}
