package pack5;

import java.util.Scanner;

public class Conditional {

	public String conditional(int a) {
		int b = 35;
		if(a == b) {
			return "That's it";
		}
		String c = (a < b) ? "Higher":"Lower";
		return c;
	}
	
	public static void main(String[] args) {
		Conditional c = new Conditional();
		System.out.println("Type the Hidden number in");
		Scanner input = new Scanner(System.in);
		int a;
		
		do{
		a = input.nextInt();
		System.out.println(c.conditional(a));
		
		}while(a != 35);
		input.close();
	}

}
