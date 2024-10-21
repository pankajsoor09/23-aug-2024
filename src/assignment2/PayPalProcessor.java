package assignment2;

public class PayPalProcessor implements PaymentProcessor{
	
	  public void processPayment(double amount) {
	        System.out.println("Processing PayPal payment Rs." + amount);
	    }
	  
	  public void refundPayment(double amount) {
	        System.out.println("Refunding PayPal payment Rs." + amount);
	    }

}
