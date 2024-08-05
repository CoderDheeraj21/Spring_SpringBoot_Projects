package in.Dheeraj;

public class Test {
	public static void main(String[] args) {
		//BillCollector bc = new BillCollector();
		//Injecting CreditCard object into BillCollector -- Setter Injection
		//bc.setPayment(new CreditCardPayment());

		
		//Injecting CrediCard object into BillCollector -- Constructor Injection
		BillCollector bc = new BillCollector(new CreditCardPayment());
		bc.collectPayment(1000.0);
		

		
	}
}
