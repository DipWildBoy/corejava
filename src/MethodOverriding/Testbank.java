package MethodOverriding;

public class Testbank {
public static void main(String[] args) {
	//static or early binding of object
	NCCbank nb = new NCCbank();
	nb.bank();
	nb.interestRate();
	//up casting
	//leads to dynamic binding
	CentralBank b =new NCCbank();
}
//dynamic or late binding of object 
//also called runtime  polymorphism
static void printbank(CentralBank b) {
	b.bank();
	b.interestRate();
	          
}
}
