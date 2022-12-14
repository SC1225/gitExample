package ch14;

import java.util.Vector;

public class VectorExam {

	public static void main(String[] args) {
		Vector<Object> v = new Vector<>();
		System.out.println("초기 사이즈 : "+v.capacity());
		v.add("first");
		v.add(2);
		v.add(3.5);
		v.add(true);
		v.add(100);
		v.add(101);
		v.add(103);
		v.add(104);
		v.add(105);
		v.add(106);
		v.add(107);
		System.out.println("중간 사이즈 : "+v.capacity());
		System.out.println("데이터의 갯수 : "+v.size());
		System.out.println("초기 데이터");
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+"\t");
		}
		System.out.println();
		v.remove(0);
		//v.add(6, 102);
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+"\t");
		}

	}

}
