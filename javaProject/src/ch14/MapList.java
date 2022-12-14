package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {
	static void print(Map<String, Object> map) {
		ArrayList<Student> list2 = (ArrayList<Student>)map.get("list");
		for(Student s : list2) {
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
		}	
}
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		List<Student> list = new ArrayList<>();
		list.add(new Student("201801", "kim", "전산", 1, "park"));
		list.add(new Student("201902", "choi", "영문", 3, "hong"));
		list.add(new Student("202003", "lee", "경제", 2, "min"));
		map.put("list", list);
		
		print(map);

	}

}
