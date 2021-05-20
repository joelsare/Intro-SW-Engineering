import java.util.ArrayList;

public class Group implements SendMessage {

	
	String groupName;
	
	ArrayList<SendMessage> composites = new ArrayList<>();
	
	public Group(String name) {
		groupName = name;
	}
	
	public void addComposite(SendMessage composite) {
		composites.add(composite);
	}
	
	//can also do delete
	
	@Override
	public void sendMessage(String message) {
		for(SendMessage composite: composites) {
			composite.sendMessage(message);
		}

	}

}
