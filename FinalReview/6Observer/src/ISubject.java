
public interface ISubject {
	
	void upload(String title);
	void subscribe(IObserver ob);
	void unsub(IObserver ob);
	void notifyObservers();
}
