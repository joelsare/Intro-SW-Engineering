
public interface IChromeDriver { // we dont want to rewrite these because theyre implemented in IEDriver
	void getElement(String name);
	void selectElement(String name);
}
