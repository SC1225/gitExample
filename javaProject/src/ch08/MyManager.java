package ch08;

public class MyManager {
	private int score;
	
	private MyManager(int score) {
		this.score = score;
	}
	private static MyManager mgr;
	
	public static MyManager getInstance() {
		if(mgr==null) {
			mgr = new MyManager(10);
		}
		return mgr;
	}
	
	public int gerScore() {
		return score;
	}
	public void setScore(int score) {
		this.score=score;
	}

}
