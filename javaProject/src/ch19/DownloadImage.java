package ch19;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadImage {

	public static void main(String[] args) throws MalformedURLException {
		String website="https://cdn-lostark.game.onstove.com/EFUI_IconAtlas/use/use_9_55.png";
		System.out.println("다운로드를 시작합니다.");
		URL url = new URL(website);
		byte[] buffer = new byte[2048];
		try(InputStream in=url.openStream(); OutputStream out=new FileOutputStream("c:\\test\\test.jpg")) {
			int length=0;
			while((length=in.read(buffer)) != -1) {
				System.out.println(length+"바이트 읽음.");
				out.write(buffer, 0, length);
			}
			System.out.println("다운로드가 완료되었습니다.");
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
