package invoice;

import org.junit.Before;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Invoice test class")
public class InvoiceTest {
	
	private Invoice invoice;
	
	@Before
	public void setUp() {
		invoice = new Invoice();
	}
	
}
