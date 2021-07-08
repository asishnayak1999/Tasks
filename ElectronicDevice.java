package p2;
public class ElectronicDevice {
	
	int power;
	
	public ElectronicDevice() {
		super();
		
	}

	
	public int getPower() {
		return power;
	}


	public void setPower(int power) {
		this.power = power;
	}


	public ElectronicDevice(int power) {
		super();
		this.power = power;
	}


	public void charged() {
		power +=(power/20);
		System.out.println("After charged : "+power);
		
	}
}
