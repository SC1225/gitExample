package ch14;

import java.util.Stack;

public class StackExam {

	public static void main(String[] args) {
		String[] nation= {"한국","일본","중국","미국","영국"};
		Stack<String> s = new Stack<>();
		for(String str : nation) {
			s.push(str);
		}
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}

	}

}
