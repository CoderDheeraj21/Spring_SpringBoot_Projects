package in.Dheeraj;

public class BillCollector {
	private IPayment payment;
	
//	public void setPayment(IPayment payment) {
//		this.payment = payment;
//	}
	
	
//	public BillCollector() {
//		
//	}
	
	public BillCollector(IPayment payment) {
		this.payment = payment;
	}


	void collectPayment(double amount) {
		String status = payment.pay(amount);
		System.out.println(status);
	}
}
