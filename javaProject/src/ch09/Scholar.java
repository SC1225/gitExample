package ch09;

public class Scholar extends Student{
	private String category;
	private int money;
	
	public void input(String name, String num, String major, int year,String category, int money) {
		setName(name);
		setNum(num);
		setMajor(major);
		setYear(year);
		this.category = category;
		this.money = money;
	}
	public void input2(String name, String num, String major, int year) {
		setName(name);
		setNum(num);
		setMajor(major);
		setYear(year);
	}
	public void print() {
		System.out.println("이름\t학번\t전공\t학년\t구분\t장학금액");
		System.out.println(getName()+"\t"+getNum()+"\t"+getMajor()+"\t"+getYear()+"\t"+category+"\t"+money);
	}
	public void print2() {
		System.out.println("이름\t학번\t전공\t학년");
		System.out.println(getName()+"\t"+getNum()+"\t"+getMajor()+"\t"+getYear());
	}
	

}
