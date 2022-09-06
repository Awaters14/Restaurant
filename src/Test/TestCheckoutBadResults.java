package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Model.Checkout;

/**  
* @author Alex Waters - Awaters6
* CIS175 - Fall 2021
* Sep 5, 2022  
*/
public class TestCheckoutBadResults {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPayment() {
		double meal1 = 14.99;
		Checkout recepit = new Checkout();
		recepit.setBill(meal1);
		
		assertNotEquals("16.05", recepit.Payment());
	}
	
	@Test
	public void testRecepit() {
		
		double meal1 = 14.99;
		Checkout recepit = new Checkout(meal1);
		double TAX = .07;
		String total = recepit.Payment();
		
		
		String message = "subtotal ............. " + meal1 +"\ntax ..................  " + TAX + "\ntotal ................ " + total;
		
		assertNotEquals(message, recepit.Recepit());
	}

}
