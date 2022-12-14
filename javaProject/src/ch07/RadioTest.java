package ch07;

public class RadioTest {

	public static void main(String[] args) {
		Radio b = new Radio();
		b.model = "브리츠 라디오";
		b.onOff = true;
		b.channel = 89.1;
		b.volume = 12;
		b.print();
		System.out.println();
		
		Radio i = new Radio();
		i.model = "아이리버 라디오";
		i.onOff = false;
		i.channel = 95.1;
		i.volume = 9;
		i.print();

	}

}
