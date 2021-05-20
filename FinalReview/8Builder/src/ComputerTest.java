
public class ComputerTest {

	public static void main(String[] args) {
		//Computer laptop = new Computer("Intel core i7", "Windows", "15.6", "Silver", 8, 256);
		
		Computer laptop = new ComputerBuilder().setColor("silver").setCpu("intel core i7").setRam(16).setHarddisk(256).getComputer();
		System.out.println(laptop);
	}

}
