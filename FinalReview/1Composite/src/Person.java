
public class Person implements SendMessage{
	
	String name;
	
	public Person(String name) {
		this.name = name;
	}
	@Override
	public void sendMessage(String message) {
		System.out.println("Hello " + name + " " + message);
	}
}
