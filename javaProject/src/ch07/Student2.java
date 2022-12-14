package ch07;

public class Student2 {
	private String name;
	private String major;
	private int year;
	private String num;
	private double point;
	private int money;
	private int save;

	public void input(String name, String major, int year, String num, double point, int money) {
		this.name=name;
		this.major=major;
		this.year=year;
		this.num=num;
		this.point=point;
		this.money=money;
		
		if(point >= 4.3) {
			save = money;
		}else if(point >= 4.0) {
			save = 250;
		}else if(point >= 3.5) {
			save = 100;
		}
	}
	public void print() {
		System.out.println("이름\t전공\t학년\t학번\t평점평균\t등록금\t장학금");
		System.out.println(name+"\t"+major+"\t"+year+"\t"+num+"\t"+String.format("%.1f", point)+"\t"+money+"\t"+save);
	}
	@Override
	public String toString() {
		return "Student2 [name=" + name + ", major=" + major + ", year=" + year + ", num=" + num + ", point=" + point
				+ ", money=" + money + ", save=" + save + "]";
	}

}
