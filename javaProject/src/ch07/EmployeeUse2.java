package ch07;

public class EmployeeUse2 {

	public static void main(String[] args) {
		Employee2 s1 = new Employee2();
		s1.setName("김철수");
		s1.setPart("관리부");
		s1.setPosition("과장");
		s1.setBasic(300);
		s1.calc();
		s1.print();

	}

}
