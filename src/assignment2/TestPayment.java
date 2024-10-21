package assignment2;

public class TestPayment {

	public static void main(String[] args) {

		PaymentProcessor creditCard = new CreditCardProcessor();
		PaymentProcessor payPal = new PayPalProcessor();

		creditCard.processPayment(100.50);
		payPal.processPayment(200.75);
		creditCard.processPayment(2000);
		payPal.processPayment(3000.75);
		creditCard.refundPayment(50.25);
		payPal.refundPayment(100);
		creditCard.refundPayment(150);
		payPal.refundPayment(1000);
	}
}
