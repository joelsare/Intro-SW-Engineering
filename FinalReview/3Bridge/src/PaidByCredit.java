
public class PaidByCredit extends PaymentSystem {

	public PaidByCredit(IProcessPayment process) {
		super(process);
	}

	@Override
	public void paidby() {
		System.out.println("Paid by credit card via " + process.processPayment());

	}
}
