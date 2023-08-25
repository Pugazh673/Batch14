package com.ex;

public class ReverseAString {

	public static void main(String[] args) {
		String word = "Hello";
		char c;
		String reverString = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			c = word.charAt(i);
			reverString = reverString + c;
		}
		System.out.println(reverString);

		System.out.println(reverString.length());
	}
	
public void add() {
	
}

public void m1() {
	
	
}

}
