package ch09;

public class Employee {
	 private int num;//사원번호 get필요
	 public String name;//이름
	 String address;//주소
	 String email;//이메일주소
	 protected int salary;//연봉 get필요
	 private String rrn; //주민번호 get필요
	 
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getRrn() {
		return rrn;
	}
	public void setRrn(String rrn) {
		this.rrn = rrn;
	}
	public Employee(String name, String address, String email) {
		this.name = name;
		this.address = address;
		this.email = email;
	}
}
