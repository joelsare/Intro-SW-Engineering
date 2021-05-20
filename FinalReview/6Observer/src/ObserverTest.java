
public class ObserverTest {

	public static void main(String[] args) {
		ISubject youtuber = new Subject();
		
		IObserver tom = new Observer("Tom");
		IObserver tim = new Observer("Tim");
		IObserver bob = new Observer("Bob");
		IObserver jon = new Observer("Jon");
		IObserver jac = new Observer("Jac");
		
		youtuber.subscribe(tom);
		youtuber.subscribe(tim);
		youtuber.subscribe(bob);
		youtuber.subscribe(jon);
		youtuber.subscribe(jac);
		
		youtuber.unsub(jon);
		
		tom.unsubChannel(youtuber);
		tim.unsubChannel(youtuber);
		
		youtuber.upload("The Secret World of Jefree Star");
		

	}

}
