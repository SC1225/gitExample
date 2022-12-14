package ch02;

public class MyNameUnicode {

	public static void main(String[] args) {
		char aValue = '\uC774';
		char bValue = '\uC2B9';
		char cValue = '\uC8FC';
		
		System.out.println(aValue +" "+ bValue + " " + cValue);
		System.out.println("char형(\'\\uC774\') : " + aValue);
		System.out.println("char형(\'\\uC2B9\') : " + bValue);
		System.out.println("char형(\'\\uC8FC\') : " + cValue);


	}

}
