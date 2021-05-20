
public class PaidByDebit extends PaymentSystem {

	public PaidByDebit(IProcessPayment process) {
		super(process);
	}

	@Override
	public void paidby() {
		System.out.println("Paid by debit via " + process.processPayment());
	}

}
