
public abstract class PaymentSystem {

	IProcessPayment process;
	
	public PaymentSystem(IProcessPayment process) {
		super();
		this.process = process;
	}

	public abstract void paidby();
	
}
