
public class BridgeTest {

	public static void main(String[] args) {
		
		IProcessPayment process = new processPaymentByVisa();
		
		PaymentSystem payment = new PaidByCredit(process);
		
		payment.paidby();
		
	}

}
