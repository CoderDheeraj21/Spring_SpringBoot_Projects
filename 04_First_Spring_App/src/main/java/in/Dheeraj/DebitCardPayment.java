package in.Dheeraj;

public class DebitCardPayment implements IPayment {

	@Override
	public String pay(double amount) {
		// some logic for payment
		return "Debit Card Payment Successfull";
	}

}
