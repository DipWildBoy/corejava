package MethodOverriding;

public class NMBbank extends CentralBank{
	   @Override
	protected void bank() {
		System.out.println("NMB Bank");

	   }
	   @Override
	protected void interestRate() {
		System.out.println("12%");
	}
	   }
