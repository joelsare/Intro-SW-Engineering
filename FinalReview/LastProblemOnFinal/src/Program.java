
public class Program {
	public static void main(String [] args) {
		System.out.println("[DBG] Convert a document to two different formats:"); String text = "NAME:customer1,ADDRESS:address1,PHONE:phone1";
		XMLBuilder xmlBuilder = new XMLBuilder();
		DocumentReader docReader = new DocumentReader(xmlBuilder); docReader.build(text);
		System.out.println("\tXML format: " + docReader.getResult());
		
		JSONBuilder jsonBuilder = new JSONBuilder();
		docReader = new DocumentReader(jsonBuilder); docReader.build(text);
		System.out.println("\tJSON format: " + docReader.getResult());
	}
}
