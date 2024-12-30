package edu.stpeters;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		int res = factorial(n);
		System.out.println(res);
	}
	
	private static int factorial(int n) {
		return n> 1 ? n * factorial(n-1):1;
	}

}
