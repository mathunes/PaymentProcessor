package processor;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import bankslip.BankSlip;
import invoice.Invoice;

public class TestProcessor {

	private Processor processor;
	
	@BeforeEach
	public void setUp() {
		processor = new Processor();
	}
	
	@Test
	public void testPayTheSameValueOfInvoice() {
		Invoice invoice = new Invoice(new Date(), 100.00, "Julie");
		
		BankSlip bankSlip1 = new BankSlip("9F86D081884C7D659A2FEAA0C55AD0", new Date(), 30.00);
		BankSlip bankSlip2 = new BankSlip("DAD080581984A0D6FEAA26C559C7F8", new Date(), 50.00);
		BankSlip bankSlip3 = new BankSlip("A0DC559C07D6F88FEADA8A26094581", new Date(), 20.00);
		
		List<BankSlip> bankSlips;
		
		bankSlips.add(bankSlip1);
		bankSlips.add(bankSlip2);
		bankSlips.add(bankSlip3);
		
		processor.process(invoice, bankSlips);
	}

}
