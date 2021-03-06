
public class ComputerBuilder {
	private String cpu;
	private String os;
	private String screensize;
	private String color;
	private int ram;
	private int harddisk;
	
	public ComputerBuilder setCpu(String cpu) {
		this.cpu = cpu;
		return this;
	}
	public ComputerBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public ComputerBuilder setScreensize(String screensize) {
		this.screensize = screensize;
		return this;
	}
	public ComputerBuilder setColor(String color) {
		this.color = color;
		return this;
	}
	public ComputerBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public ComputerBuilder setHarddisk(int harddisk) {
		this.harddisk = harddisk;
		return this;
	}
	
	public Computer getComputer() {
		return new Computer(cpu, os,screensize,color,ram,harddisk);
	}
}
