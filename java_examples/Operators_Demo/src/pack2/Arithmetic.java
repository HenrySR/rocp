package pack2;

import java.util.Scanner;

public class Arithmetic {

	public int add(int a, int b) {
		return a+b;
	}
	public int subtract(int a, int b) {
		return a-b;
	}
	public int multiply(int a, int b) {
		return a*b;
	}
	public int divide(int a, int b) {
		return a/b;
	}
	public int remainder(int a, int b) {
		return a%b;
	}
	public int increment(int a) {
		a++;
		return a;
	}
	public int decrement(int a) {
		a--;
		return a;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter two numbers");
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		//float c =2.2f;
		Arithmetic A = new Arithmetic();
		System.out.println("Adding " + a +" and " + b + " = " +  A.add(a, b));
		System.out.println("Subtracting " + a +" by " + b + " = " +A.subtract(a, b));
		System.out.println("Mutiplying " + a +" and " + b + " = " +A.multiply(a, b));
		System.out.println("Dividing " + a +" by " + b + " = " +A.divide(a, b));
		System.out.println("The remainder of " + a +" and " + b + " = " +A.remainder(a, b));
		
		System.out.println("Increment of " + a + " = " + A.increment(a));
		System.out.println("Decrement of " + a + " = " + A.decrement(a));
		input.close();
	}

}
