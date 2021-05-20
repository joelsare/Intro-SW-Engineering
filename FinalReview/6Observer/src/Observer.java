
public class Observer implements IObserver {

	private String name;
	
	public Observer(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update() {
		System.out.println("Hello " + name + " I uploaded one video!");

	}

	@Override
	public void subscribeChannel(ISubject subject) {
		subject.subscribe(this);

	}

	@Override
	public void unsubChannel(ISubject subject) {
		subject.unsub(this);

	}

}
