package p2;

public class Computer extends ElectronicDevice {
	
	Memory m;
	Bluetooth b;
	
	
	public Computer(int power) {
		super(power);
	}
	
	public Computer(Memory m, Bluetooth b) {
		super();
		this.m = m;
		this.b = b;
	}

	public Memory getM() {
		return m;
	}

	public void setM(Memory m) {
		this.m = m;
	}

	public Bluetooth getB() {
		return b;
	}

	public void setB(Bluetooth b) {
		this.b = b;
	}


	public void discharge()
	{
		power -= 20;
		System.out.println("Computer After Used: "+power+"\n");
	}
	
	
	
	
	
}
