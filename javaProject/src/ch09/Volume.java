package ch09;

public class Volume extends Area {
	private int height;
	public Volume() {
		
	}
	public Volume(int height, int length, int width) {
		super(width, length);
		this.height = height;
	}
	public int getVolume() {
		return getArea()*height;
	}
	

}
