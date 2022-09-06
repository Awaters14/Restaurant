package Test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
/**  
* @author Alex Waters - Awaters6
* CIS175 - Fall 2021
* Sep 5, 2022  
*/
public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Result result = JUnitCore.runClasses(TestCheckout.class, TestCheckoutBadResults.class);
		
		for (Failure failure: result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println(result.wasSuccessful());
		
		
	}

}
