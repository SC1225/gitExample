package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		list.add("하나");
		list.add(2);
		list.add(5.5);
		list.add(false);
		list.add(2, 4);
		list.remove(3);
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+"\t");
		}

	}

}
