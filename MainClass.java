package p2;

public class MainClass {

	
	public void electricDeviceWorks(ElectronicDevice ed) {
		
		
		if(ed instanceof MobilePhone) {
			
			System.out.print("Mobile ");ed.charged();
			MobilePhone mp = (MobilePhone)ed;
			mp.discharge();
		}
		if(ed instanceof Computer) {
			
			System.out.print("Computer ");ed.charged();
			Computer c = (Computer)ed;
			c.discharge();
		}
		if(ed instanceof Camera) {
			
			System.out.print("Camera ");ed.charged();
			Camera cm = (Camera)ed;
			cm.discharge();
		}
		
	}
	
	public static void main(String[] args) {
		
		MainClass obj = new MainClass();
		
		ElectronicDevice MobilePhone = new MobilePhone(60);
		ElectronicDevice Computer = new Computer(90);
		ElectronicDevice Camera = new Camera(100);
		
		obj.electricDeviceWorks(MobilePhone);
		obj.electricDeviceWorks(Camera);
		obj.electricDeviceWorks(Computer);
				
		Memory SD = new Memory("SanDisk",64);
		Bluetooth BT = new Bluetooth(5.2);
		
		MobilePhone MB = new MobilePhone(SD,BT);
		System.out.println("\nMobile Bluetooth Ver. :"+ MB.getB().getVersion());
		System.out.println("Mobile Memory Brand :"+MB.getM().getBrand());
		System.out.println("Mobile Memory Size :"+MB.getM().getSize());

		
		Computer C = new Computer(SD,BT);
		System.out.println("\nComputer Bluetooth Ver. :"+ C.getB().getVersion());
		System.out.println("Computer Memory Brand :"+C.getM().getBrand());
		System.out.println("Computer Memory Size :"+C.getM().getSize());
		
		Camera CA = new Camera(SD,BT);
		System.out.println("\nCamera Bluetooth Ver. :"+ CA.getB().getVersion());
		System.out.println("Camera Memory Brand :"+CA.getM().getBrand());
		System.out.println("Camera Memory Size :"+CA.getM().getSize());
	}

}
