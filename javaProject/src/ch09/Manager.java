package ch09;

public class Manager extends Employee {
	public Manager(int num,String name, String address, String email, int salary, String rrn) {
		super(name, address, email);
		setNum(num);
		setSalary(salary);
		setRrn(rrn);
		this.address = address;
		this.email = email;
		this.name = name;
	}
	public void print() {
		System.out.println("-------------------------------");
		System.out.println("사원번호 : "+getNum());
		System.out.println("이름 : "+name);
		System.out.println("주소 : "+address);
		System.out.println("이메일 주소 : "+email);
		System.out.println("연봉 : "+getSalary());
		System.out.println("주민번호 : "+getRrn());
		System.out.println("-------------------------------");
	}
}
