package p2;

public class Camera extends ElectronicDevice{
	
	Memory m;
	Bluetooth b;
	public Camera() {
		super();
	}
	public Camera(int power) {
		super(power);
	}
	public Camera(Memory m, Bluetooth b) {
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
		power -= 5;
		System.out.println("Camera After Used: "+power+"\n");
	}
}
