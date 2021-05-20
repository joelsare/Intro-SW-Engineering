
public class WebDriverAdapter implements IChromeDriver {

	IEDriver ieDriver = new IEDriver();
	
	@Override
	public void getElement(String name) {
		ieDriver.findElement(name);

	}

	@Override
	public void selectElement(String name) {
		ieDriver.clickElement(name);

	}

}
