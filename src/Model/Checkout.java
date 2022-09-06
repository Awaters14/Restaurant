package Model;

import java.text.DecimalFormat;

/**
 * @author Alex Waters - Awaters6 
 * CIS175 - Fall 2021 
 * Sep 4, 2022
 */
public class Checkout {

	private double bill;
	private final double TAX = .07;

	/**
	 * 
	 */
	public Checkout() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param bill
	 */
	public Checkout(double bill) {
		super();
		setBill(bill);
	}

	/**
	 * @return the bill
	 */
	public double getBill() {
		return bill;
	}

	/**
	 * @param bill the bill to set
	 */
	public void setBill(double bill) {
		this.bill = bill;
	}

	public String Payment() {

		final DecimalFormat df = new DecimalFormat("0.00");
		double taxVariable = bill * TAX;
		double total = bill + taxVariable;

		return df.format(total);
	}

	public String Recepit() {

		String total = Payment();
		String recepit;
		recepit = "Subtotal ............. " + bill + "\nTax ..................  " + TAX + "\nTotal ................ "
				+ total;

		return recepit;
	}
	
	
}
