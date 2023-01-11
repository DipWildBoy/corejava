package MethodOverriding;

public class PrabhuBank extends CentralBank {
	@Override
	protected void bank() {
		System.out.println("Prabhu Bank");
	}
	@Override
	protected void interestRate() {
		System.out.println("8%");
	}

}
