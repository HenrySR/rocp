package pack1;

import java.util.Scanner;

public class Relational {
	
	public String equal(int a, int b) {
		if(a==b) {
			return " is equal to ";
		}
		return " is not equal to ";
	}
	public String notEqual(int a, int b) {
		if(a!=b) {
			return " is not equal to ";
		}
		return " is equal to ";
	}
	public String greater(int a, int b) {
		if(a>b) {
			return " is greater than ";
		}
		return " is less than ";
	}
	public String lessThan(int a, int b) {
		if(a<b) {
			return " is less than ";
		}
		return " is greater than ";
	}
	public String greaterEqual(int a, int b) {
		if(a>=b) {
			return " is greater or equal to ";
		}
		return " is less than or equal to ";
	}
	public String lessThanEqual(int a, int b) {
		if(a<=b) {
			return " is less than or equal to ";
		}
		return " is greater than or equal to ";
	}

	public static void main(String[] args) {
		Relational R = new Relational();
		System.out.println("Enter two numbers");
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println(a + R.equal(a, b)+ b);
		System.out.println(a + R.notEqual(a, b)+ b);
		System.out.println(a + R.greater(a, b)+ b);
		System.out.println(a + R.lessThan(a, b)+ b);
		System.out.println(a + R.greaterEqual(a, b)+ b);
		System.out.println(a + R.lessThanEqual(a, b)+ b);
		input.close();
	}

}
