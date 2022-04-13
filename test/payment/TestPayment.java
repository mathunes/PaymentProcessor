package payment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Payment test class")
public class TestPayment {

	private Payment payment;
	
	@Before
	public void setUp() {
		payment = new Payment(20.00, new Date(), "BANK_SLIP");
	}
	
	@DisplayName("Check payment data")
	@Test
	public void testCheckPaymentData() {
		assertEquals(payment.getValue(), 20.00);
		assertTrue(payment.getDate() instanceof Date);
		assertEquals(payment.getType(), "BANK_SLIP");
	}
	
}
