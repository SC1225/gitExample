package ch18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		OutputStream os = null;
		try {
			os = new FileOutputStream("C:\\test\\aa.txt");
			System.out.println("입력하세요 : ");
			while (true) {
				int ch=System.in.read();
				if(ch==13) break;
				os.write(ch);
			}
			System.out.println("저장되었습니다.");
		} catch (FileNotFoundException e) {
			System.out.println("파일저장이 실패했습니다.");
			e.printStackTrace();
		}

	}

}
