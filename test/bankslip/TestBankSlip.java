package bankslip;

import java.util.Date;

import org.junit.Before;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Bank slip test class")
public class TestBankSlip {

	private BankSlip bankSlip;
	
	@Before
	public void setUp() {
		bankSlip = new BankSlip("9F86D081884C7D659A2FEAA0C55AD0", new Date(), 50.00);
	}
	
}
