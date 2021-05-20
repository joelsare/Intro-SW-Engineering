
public class CompositeTest {

	public static void main(String[] args) {
		Person dad = new Person("dad");
		Person mom = new Person("mom");
		Person tom = new Person("tom");
		Person bob = new Person("bob");
		Person tim = new Person("tim");
		Person blake = new Person("blake");
		
		Group parents = new Group("parents");
		parents.addComposite(mom);
		parents.addComposite(dad);
		
		Group coworkers = new Group("coworkers");
		coworkers.addComposite(tom);
		coworkers.addComposite(bob);
		coworkers.addComposite(tim);
		
		Group contact = new Group("contact");
		contact.addComposite(parents);		//container
		contact.addComposite(coworkers);	//container
		contact.addComposite(blake);		//leaf
		
		blake.sendMessage("Can we have dinner together");
		coworkers.sendMessage("I'm tired and will call it a day");
		parents.sendMessage("I will not have dinner tonight");
		
		


	}

}
