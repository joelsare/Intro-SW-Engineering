
public class Computer {
	private String cpu;
	private String os;
	private String screensize;
	private String color;
	private int ram;
	private int harddisk;
	
	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", os=" + os + ", screensize=" + screensize + ", color=" + color + ", ram="
				+ ram + ", harddisk=" + harddisk + "]";
	}

	public Computer(String cpu, String os, String screensize, String color, int ram, int harddisk) {
		super();
		this.cpu = cpu;
		this.os = os;
		this.screensize = screensize;
		this.color = color;
		this.ram = ram;
		this.harddisk = harddisk;
	}

	
}
