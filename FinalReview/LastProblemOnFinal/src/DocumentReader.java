
public class DocumentReader {
	Builder builder;
	public DocumentReader(Builder builder) { this.builder = builder;
	}
	void build(String text) {
		String[] splitedData = text.split(",");
		String name = null, address = null, phone = null; 
		for (String data : splitedData) {
		
			if (data.startsWith("NAME:")) { 
				name = data.substring(5);
			} else if (data.startsWith("ADDRESS:")) { 
				address = data.substring(8);
			} else if (data.startsWith("PHONE:")) { 
				phone = data.substring(6);
			} 
		}
	builder.setName(name).setAddress(address).setPhone(phone).build();
	}
	public Product getResult() {
		return builder.getProduct();
	}
}
