class XMLBuilder extends Builder {
XMLProduct product = new XMLProduct();
String name; String address; String phone;
public XMLBuilder setName(String name) { 
	this.name = name;
	return this;
}
public XMLBuilder setAddress(String address) { 
	this.address = address;
	return this;
}
public XMLBuilder setPhone(String phone) { 
	this.phone = phone;
	return this;
}
public void build() {
product.append("<NAME>" + this.name + "</NAME>"); product.append("<ADDRESS>" + this.address + "</ADDRESS>"); product.append("<PHONE>" + this.phone + "</PHONE>"); product.setData("<XML>" + product.getData() + "</XML>");
}
public Product getProduct() { return this.product;
} }