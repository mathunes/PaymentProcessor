package payment;

import java.util.Date;

import org.junit.Before;

public class TestPayment {

	private Payment payment;
	
	@Before
	public void setUp() {
		payment = new Payment(20.00, new Date(), "BANK_SLIP");
	}
	
}
