package pack4;

import java.util.Scanner;

public class Bitwise {

	public int bitAND(int a,int b) {
		int c = a & b;
		return c;	
	}
	
	public int bitOR(int a,int b) {
		int c = a | b;
		return c;
	}
	
	public int bitXOR(int a,int b) {
		int c = a ^ b;
		return c;	
	}
	
	public int bitComplement(int a) {
		int c = ~a;
		return c;	
	}
	public int bitLeftShift(int a,int b) {
		int c = a << b;
		return c;	
	}
	public int bitRightShift(int a,int b) {
		int c = a >> b;
		return c;	
	}
	public int bitRightZeroShift(int a,int b) {
		int c = a >>> b;
		return c;	
	}
	
	
	public static void main(String[] args) {
		Bitwise B = new Bitwise();

		System.out.println("Enter two numbers");
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println("Bitwise AND: " +a + " & " + b + " = " + B.bitAND(a, b));
		System.out.println("Bitwise OR " + a + " | " + b + " = " + B.bitOR(a, b));
		System.out.println("Bitwise exclusive or " + a + " ^ " + b + " = " + B.bitXOR(a, b));
		System.out.println("Bitwise Complement of " + a + " is " + B.bitComplement(a));
		System.out.println(a + " << " + b + " = " + B.bitLeftShift(a, b));
		System.out.println(a + " >> " + b + " = " + B.bitRightShift(a, b));
		System.out.println(a + " >>> " + b + " = " + B.bitRightZeroShift(a, b));
		input.close();
	}

}
