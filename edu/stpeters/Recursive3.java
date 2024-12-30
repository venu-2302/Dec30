package edu.stpeters;

public class Recursive3 {

	public static void main(String[] args) {
		
		int num = 7;
		even(num);
		//long res = fact(n,1);
		//System.out.println(res);
	}
	private static void even(int num) {
		
	if(num >0) {
		if(num % 2 == 0) System.out.println(num);
		even(num-1);
	}
	return;
	}
}


