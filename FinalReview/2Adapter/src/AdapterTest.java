
public class AdapterTest {

	public static void main(String[] args) {
		
		IChromeDriver chromeDriver = new WebDriverAdapter();
		
		chromeDriver.getElement("Submit Button");
		chromeDriver.selectElement("Submit Button");

	}

}
