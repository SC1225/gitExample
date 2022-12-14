package ch11;

public interface Calculator {
	public int plus(int i , int j);
	public int multipie(int i, int j);
	default int exec(int i, int j) {
	     return i+j;
	}

}
