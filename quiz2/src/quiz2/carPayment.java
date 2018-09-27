package quiz2;

import java.lang.*;


public class carPayment {
	
	int CarCost;
	int CarDownPayment;
	int lengthOfLoan;
	int interestRate;
	int MonthlyCarPayment;
	int TotalInterest;
	
	public double monthlyCarPayment () {
		return ((interestRate/12)*(CarCost - CarDownPayment))/(1-Math.pow(1+(interestRate/12),-lengthOfLoan));
	}
	public double totalInterest () {
		return (monthlyCarPayment() * lengthOfLoan) - (-CarDownPayment + CarCost);
	}
	
	
	public double APR () {
		return (interestRate / 12 *100);
	}
	
	public int getCarCost() {
		return CarCost;
	}
	
	public void setCarCost(int CarCost) {
		this.CarCost = CarCost;
	}
	
	
	public int getCarDownPayment() {
		return CarDownPayment;
	}
	
	public void setCarDownPayment() {
		this.CarDownPayment = CarDownPayment;
	}
	
	public int getlengthOfLoan() {
		return lengthOfLoan;
	}
	
	public double getinterestRate() {
		return (CarCost * .10);
	}
	
	public double MonthlyCarPayment() {
		return (CarCost / lengthOfLoan);
	}
	
	public double TotalInterest() {
		return TotalInterest;
	}
	
	
	
	
	
	
	}
	
	/*
	  monthlypayment =35000 * (.0085(1+.0085)^60)/((1+.0085)^60 -1)
*/

