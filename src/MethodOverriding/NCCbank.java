package MethodOverriding;



public class NCCbank extends CentralBank {
           
      @Override
    protected void bank() {
    	System.out.println("NCC Bank");

}
      @Override
    protected void interestRate() {
    	System.out.println("11%");
    }
}
