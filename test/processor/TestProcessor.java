package processor;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import bankslip.BankSlip;
import invoice.Invoice;
import payment.Payment;

@DisplayName("Processor test class")
public class TestProcessor {

	private Processor processor;
	
	@Before
	public void setUp() {
		processor = new Processor();
	}
	
	@DisplayName("Check payments type")
	@Test
	public void testCheckPaymentsType() {
		Invoice invoice = new Invoice(new Date(), 100.00, "Julie");
		
		BankSlip bankSlip1 = new BankSlip("9F86D081884C7D659A2FEAA0C55AD0", new Date(), 30.00);
		BankSlip bankSlip2 = new BankSlip("DAD080581984A0D6FEAA26C559C7F8", new Date(), 50.00);
		BankSlip bankSlip3 = new BankSlip("A0DC559C07D6F88FEADA8A26094581", new Date(), 20.00);
		
		List<BankSlip> bankSlips = new ArrayList<BankSlip>();
		
		bankSlips.add(bankSlip1);
		bankSlips.add(bankSlip2);
		bankSlips.add(bankSlip3);
		
		List<Payment> payments = processor.process(invoice, bankSlips);
		
		for (Payment payment : payments) {
			assertTrue(payment.getType() == "BANK_SLIP");
		}
	}
	
	@DisplayName("Check the bank slips with the same value of invoice")
	@Test
	public void testPayTheSameValueOfInvoice() {
		Invoice invoice = new Invoice(new Date(), 100.00, "Julie");
		
		BankSlip bankSlip1 = new BankSlip("9F86D081884C7D659A2FEAA0C55AD0", new Date(), 30.00);
		BankSlip bankSlip2 = new BankSlip("DAD080581984A0D6FEAA26C559C7F8", new Date(), 50.00);
		BankSlip bankSlip3 = new BankSlip("A0DC559C07D6F88FEADA8A26094581", new Date(), 20.00);
		
		List<BankSlip> bankSlips = new ArrayList<BankSlip>();
		
		bankSlips.add(bankSlip1);
		bankSlips.add(bankSlip2);
		bankSlips.add(bankSlip3);
		
		processor.process(invoice, bankSlips);
		
		assertTrue(invoice.isPaid());
	}

	@DisplayName("Check the bank slips with a value lower than invoice")
	@Test
	public void testPayLessThanTheValueOfInvoice() {
		Invoice invoice = new Invoice(new Date(), 100.00, "Julie");
		
		BankSlip bankSlip1 = new BankSlip("9F86D081884C7D659A2FEAA0C55AD0", new Date(), 30.00);
		BankSlip bankSlip2 = new BankSlip("DAD080581984A0D6FEAA26C559C7F8", new Date(), 50.00);
		
		List<BankSlip> bankSlips = new ArrayList<BankSlip>();
		
		bankSlips.add(bankSlip1);
		bankSlips.add(bankSlip2);
		
		processor.process(invoice, bankSlips);
		
		assertFalse(invoice.isPaid());
	}

	@DisplayName("Check the bank slips with a value greater than invoice")
	@Test
	public void testPayMoreThanTheValueOfInvoice() {
		Invoice invoice = new Invoice(new Date(), 100.00, "Julie");
		
		BankSlip bankSlip1 = new BankSlip("9F86D081884C7D659A2FEAA0C55AD0", new Date(), 30.00);
		BankSlip bankSlip2 = new BankSlip("DAD080581984A0D6FEAA26C559C7F8", new Date(), 50.00);
		BankSlip bankSlip3 = new BankSlip("A0DC559C07D6F88FEADA8A26094581", new Date(), 50.00);
		
		List<BankSlip> bankSlips = new ArrayList<BankSlip>();
		
		bankSlips.add(bankSlip1);
		bankSlips.add(bankSlip2);
		bankSlips.add(bankSlip3);
		
		processor.process(invoice, bankSlips);
		
		assertTrue(invoice.isPaid());
	}
	
}
