package invoice;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Invoice test class")
public class TestInvoice {
	
	private Invoice invoice;
	
	@Before
	public void setUp() {
		invoice = new Invoice(new Date(), 100.00, "Julie");
	}
	
	@DisplayName("Check invoice data")
	@Test
	public void testCheckInvoiceData() {
		assertTrue(invoice.getDate() instanceof Date);
		assertEquals(invoice.getTotal(), 100.00);
		assertEquals(invoice.getClientName(), "Julie");
		assertFalse(invoice.isPaid());
	}
	
}
