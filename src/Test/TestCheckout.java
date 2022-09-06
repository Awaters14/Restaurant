package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import Model.Checkout;
/**  
* @author Alex Waters - Awaters6
* CIS175 - Fall 2021
* Sep 4, 2022  
*/
public class TestCheckout {
	
	
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPayment() {
		double meal1 = 14.99;
		Checkout recepit = new Checkout();
		recepit.setBill(meal1);
		
		assertEquals("16.04", recepit.Payment());
	}
	
	@Test
	public void testRecepit() {
		
		double meal1 = 14.99;
		Checkout recepit = new Checkout(meal1);
		double TAX = .07;
		String total = recepit.Payment();
		
		
		String message = "Subtotal ............. " + meal1 +"\nTax ..................  " + TAX + "\nTotal ................ " + total;
		
		assertEquals(message, recepit.Recepit());
	}

}
