package edu.stpeters;

public class pattern {

	public static void main(String[] args) {
        Pattern(123456789);
    }
    private static void Pattern(int num) {
        if (num== 0) {
            return;
        }
        System.out.println(num);

        Pattern(num / 10);
    }
}
