package ch14;

import java.util.LinkedList;

public class LinkedExam {

	public static void main(String[] args) {
		String[] fruits = {"사과","배","포도","딸기","수박"};
		LinkedList<String> list = new LinkedList<>();
		for(String str : fruits) {
			list.offer(str);
		}
		String str="";
		while((str=(String)list.poll()) !=null) {
			System.out.println(str+"삭제되었습니다.");
		}
	}
}
