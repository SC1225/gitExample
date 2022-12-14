package ch18;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {
	public static void main(String[] args) {
		InputStream is = System.in;
		System.out.println("문자를 입력하세요 : ");
		try {
			int code = is.read();
			System.out.println(code);
			char ch = (char)code;
			System.out.println("char : "+ch);
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

}
