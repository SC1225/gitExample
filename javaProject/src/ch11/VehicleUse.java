package ch11;

public class VehicleUse {

	public static void main(String[] args) {
		Car c = new Car();
		c.speedUp();
		c.speedDown();
		c.handle();
		
		Vehicle p = new Plane();
		p.speedUp();
		p.speedDown();
		p.handle();
		
		Vehicle b = new Boat();
		b.speedUp();
		b.speedDown();
		b.handle();
	}

}
