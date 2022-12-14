package ch18;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaderEx1 {

	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("문자열 한줄을 입력하세요 : ");
		String line;
		try {
			line = br.readLine();
			System.out.println("입력한 문자열 : "+line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");

	}

}
