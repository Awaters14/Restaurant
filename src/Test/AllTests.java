package Test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**  
* @author Alex Waters - Awaters6
* CIS175 - Fall 2021
* Sep 5, 2022  
*/
@RunWith(Suite.class)
@SuiteClasses({ TestCheckout.class, TestCheckoutBadResults.class })
public class AllTests {

}
