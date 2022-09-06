package Model;
/**  
* @author Alex Waters - Awaters6
* CIS175 - Fall 2021
* Sep 4, 2022  
*/
public class Restaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double meal1 = 14.99;
		Checkout recepit = new Checkout(meal1);
		
		System.out.println(recepit.Payment());
		System.out.println(recepit.Recepit());
		
		double meal2 = 13.99;
		
		recepit.setBill(meal2);
		
		System.out.println();
		System.out.println(recepit.Payment());
		System.out.println(recepit.Recepit());
		
	}

}
