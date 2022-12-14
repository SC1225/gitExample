package ch11;

public class Bird implements Flyer {

	@Override
	public void takeoff() {
		System.out.println("Bird 이륙");
	}
	@Override
	public void fly() {
		System.out.println("Bird 비행");
	}
	@Override
	public void land() {
		System.out.println("Bird 착륙");
	}
}
