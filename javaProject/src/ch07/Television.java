package ch07;

public class Television {
	int channel;
	int volume;
	boolean onOff;
	void print() {
		System.out.println("채널은" + channel + "이고 볼륨은" + volume + "입니다.");
	}
	int getChanner() {
		return channel;
	}
	void setChannel(int ch) {
		channel = ch;
	}

}
