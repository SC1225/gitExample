package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListMember {

	public static void main(String[] args) {
		List<Member> list = new ArrayList<>();
		
		Member m1 = new Member();
		m1.setName("김철수");
		m1.setUserid("kim");
		m1.setPasswd("1234");
		m1.setTel("02-1234-5678");
		m1.setEmail("kim@naver.com");
		
		list.add(m1);
		System.out.println(list.size());
		
		Member m2 = new Member("hong", "1234", "홍길동", "02-222-3333", "hong@nate.com");
		list.add(m2);
		System.out.println(list.size());
		
		list.add(new Member("cho", "1234", "최철수", "02-111-3333", "choi@gmail.com"));
		System.out.println(list.size());
		
		System.out.println("이름\t아이디\t비번\t전화\t\t이메일");
		for(int i=0; i<list.size(); i++) {
			Member m = list.get(i);
			System.out.println(m.getName()+"\t"+m.getUserid()+"\t"+m.getPasswd()+"\t"+m.getTel()+"\t"+m.getEmail());
		}

	}

}
