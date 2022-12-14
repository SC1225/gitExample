package ch12;

public class InnerExam1 {
	class Cal {
		int value=0;
		public void plus() {
			value++;
		}
	}
	public static void main(String[] args) {
		InnerExam1 t = new InnerExam1();
		InnerExam1.Cal c = t.new Cal();
		c.plus();
		System.out.println(c.value);
	}

}
