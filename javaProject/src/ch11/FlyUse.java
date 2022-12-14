package ch11;

public class FlyUse {

	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.takeoff();
		bird.fly();
		bird.land();
		
		Airplane air = new Airplane();
		air.takeoff();
		air.fly();
		air.land();
		
		Flyer f = new Bird();
		f.takeoff();
		f.fly();
		f.land();
		
		f = new Airplane();
		f.takeoff();
		f.fly();
		f.land();

	}

}
