package bankslip;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Bank slip test class")
public class TestBankSlip {

	private BankSlip bankSlip;
	
	@Before
	public void setUp() {
		bankSlip = new BankSlip("9F86D081884C7D659A2FEAA0C55AD0", new Date(), 50.00);
	}
	
	@Test
	public void testCheckBankSlipData() {
		assertEquals(bankSlip.getCode(), "9F86D081884C7D659A2FEAA0C55AD0");
		assertTrue(bankSlip.getDate() instanceof Date);
		assertEquals(bankSlip.getValue(), 50.00);
	}
	
}
