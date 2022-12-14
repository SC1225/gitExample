package ch07;

public class TelevisionTest5 {

	public static void main(String[] args) {
		Television myTv = new Television();
		myTv.setChannel(24);
		int ch = myTv.getChanner();
		System.out.println("현재 채널은 " + ch + "입니다.");

	}

}
