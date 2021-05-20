
public interface IObserver {
	void update();
	void subscribeChannel(ISubject subject);
	void unsubChannel(ISubject subject);
}
