
public class StrategyTest {
	
	public static void main(String[]args) {
		int[] numbers = {4,2,5,1};
		
		Context context = new Context(new InsertionSorting());
		context.arrange(numbers);
	}
}
