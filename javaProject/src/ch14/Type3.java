package ch14;

public class Type3<T> {//자료형이 미정인 상태로<아무문자나 가능>
	T t;
	public void setT(T t) {
		this.t=t;
	}
	public T getT() {
		return t;
	}
	public static void main(String[] args) {
		Type3<String> t = new Type3<String>();  // 우변 <안에 형>은 생략가능
		t.setT("Hello");
		System.out.println(t.getT());
		
		Type3<Integer> t2 = new Type3<Integer>();
		t2.setT(100);
		System.out.println(t2.getT());
		
		Type3<Double> t3 = new Type3<Double>();
		t3.setT(100.1);
		System.out.println(t3.getT());
	}

}
