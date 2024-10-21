package assignment2;

public class CreditCardProcessor implements PaymentProcessor {

	public void processPayment(double amount) {
		System.out.println("Processing credit card payment Rs." + amount);

	}

	public void refundPayment(double amount) {
		System.out.println("Refunding credit card payment Rs." + amount);
	}

}
