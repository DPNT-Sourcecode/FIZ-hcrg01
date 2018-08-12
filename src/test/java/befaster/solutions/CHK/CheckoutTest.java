package befaster.solutions.CHK;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CheckoutTest {

	private CheckoutSolution checkout;
	
	@Before 
	public void setup() {
		checkout = new CheckoutSolution();
	}
	
	@Test
	public void checkoutTest() {
		assertEquals(checkout.checkout("5"),Integer.valueOf(5));
	}
}
