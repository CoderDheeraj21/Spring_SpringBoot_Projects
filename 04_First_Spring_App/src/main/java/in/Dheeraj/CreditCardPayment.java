package in.Dheeraj;

public class CreditCardPayment implements IPayment {


	@Override
	public String pay(double amount) {
		// Some logic for the payment
		return "Credit Card Payment Successfull";
	}
}
