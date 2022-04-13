package processor;

import java.util.List;

import bankslip.BankSlip;
import invoice.Invoice;

public class Processor {

	public Processor() {

	}

	public boolean process(Invoice invoice, List<BankSlip> bankSlips) {
		double totalBankSlips = 0;

		for (BankSlip bankSlip : bankSlips)
			totalBankSlips += bankSlip.getValue();

		if (totalBankSlips >= invoice.getTotal())
			invoice.setPaid(true);

		return invoice.isPaid();
	}
	
}
