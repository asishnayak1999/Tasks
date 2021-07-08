package p2;

public class MobilePhone extends ElectronicDevice {
	
	Memory m;
	Bluetooth b;
	
	public MobilePhone() {
		super();
	}
	
	public MobilePhone(int power) {
		super(power);
	}

	public MobilePhone(Memory m, Bluetooth b) {
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
		power -= 10;
		System.out.println("Mobile After Used: "+power+"\n");
	}
	
	
	
	
	
}
