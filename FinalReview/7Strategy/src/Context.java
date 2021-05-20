
public class Context {

	private final SortingStrategy sorting;

	public Context(SortingStrategy sorting) {
		super();
		this.sorting = sorting;
	}
	
	public void arrange(int[] numbers) {
		sorting.sort(numbers);
	}
}
