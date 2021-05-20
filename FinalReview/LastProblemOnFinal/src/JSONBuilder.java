
public class JSONBuilder extends Builder {
	JSONProduct product = new JSONProduct(); String name;
	String address;
	String phone;
	public JSONBuilder setName(String name) { this.name = name;
	return this;
	}
	public JSONBuilder setAddress(String address) { this.address = address;
	return this;
	}
	public JSONBuilder setPhone(String phone) { this.phone = phone;
	return this;
	}
	public void build() {
	product.append("\"NAME\": \"" + this.name + "\", "); product.append("\"ADDRESS\": \"" + this.address + "\", "); product.append("\"PHONE\": \"" + this.phone + "\""); product.setData("{JSON: {" + product.getData() + "}}");
	}
	public Product getProduct() { return this.product;
	}
}
