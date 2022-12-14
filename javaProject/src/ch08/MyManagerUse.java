package ch08;

public class MyManagerUse {

	public static void main(String[] args) {
		MyManager mgrobj = MyManager.getInstance();
		System.out.println(mgrobj);
		System.out.println("mgrobj.getScore() : "+mgrobj.gerScore());
		mgrobj.setScore(100);
		System.out.println("mgrobj.getScore() : "+mgrobj.gerScore());

		
		MyManager newobj = MyManager.getInstance();
		System.out.println(newobj);
		System.out.println("newobj.getScore() : "+newobj.gerScore());

	}

}
