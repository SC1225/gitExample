package ch18;

import java.io.RandomAccessFile;

public class RandomFile2 {

	public static void main(String[] args) {
		String str=null;
		try {
			RandomAccessFile file = new RandomAccessFile("c:\\test\\rand2.txt", "rw");
			file.seek(10);
			file.write("park".getBytes());
			while(file.getFilePointer() < file.length()) {
				str=file.readLine();
				str = new String(str.getBytes("8859_1"),"utf-8");
			}
			file.close();
		} catch (Exception e) {
		}
	}
}
