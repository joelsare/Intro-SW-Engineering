import java.util.List;
import java.util.ArrayList;

public class Subject implements ISubject {

	List<IObserver> subscribers = new ArrayList<>();
	
	@Override
	public void upload(String title) {
		System.out.println("Upload "+ title);
		this.notifyObservers();
	}

	@Override
	public void subscribe(IObserver ob) {
		subscribers.add(ob);
	}

	@Override
	public void unsub(IObserver ob) {
		subscribers.remove(ob);
	}

	@Override
	public void notifyObservers() {
		for (IObserver ob : subscribers) {
			ob.update();
		}

	}

}
