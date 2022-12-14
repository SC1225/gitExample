package ch11;

public class SInfo implements Student {
	String name="홍길동", adr="서울 강남구", em="hong@gmail.com";
	int kor=90, eng=85, mat=79, tot;
	double avg;
	@Override
	public void address() {
		System.out.println("==============================================");
		System.out.println("이름\t주소\t\t이메일");
		System.out.println(name+"\t"+adr+"\t"+em);
		System.out.println("----------------------------------------------");	
	}
	@Override
	public void point() {
		tot = kor+eng+mat;
		avg = tot/3.0;
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+String.format("%.1f", avg));
		System.out.println("==============================================");
	}
}
