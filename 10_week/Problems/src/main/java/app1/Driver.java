package app1;

import java.util.Scanner;

public class Driver {
	/* ****************************************************************************
	*
	* BRIEF //
	*
	*   Your firm is implementing its student management prototype in Java.
	*   It's a command-line program, which the registrar's office will use to
	*   add students to the database upon enrollment.
	*
	*   The program should prompt the user for a student's first name; last name;
	*   middle initial; physical address; email address; and phone number.
	*	
	*   After each prompt, the program should wait for the user's input. 
	*
	*   Once the user has entered every piece of information, the program should
	*   print it all back to the console, and prompt the user to enter Y if the
	*   information is correct, or any other key otherwise.
	*
	*   For now, you should collect the user's response--i.e., y or otherwise--but
	*   don't worry about handling it. We'll get to that shortly.
	*
	*****************************************************************************/
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Student's first name");
		String firstName = input.next();
		System.out.println("Enter the Student's last name");
		String lastName = input.next();
		System.out.println("Enter the Student's middle initial");
		String mInitial = input.next();
		System.out.println("Enter the Student's address");
		String Address = input.next() + input.nextLine();
		System.out.println("Enter the Student's email");
		String email = input.next();
		System.out.println("Enter the Student's phone number");
		String phoneNumber = input.next();
		
		System.out.println(String.format("Is this correct Y/N? \n Name: %s %s %s \n Address: %s \n Email: %s \n Phone Number: %s"
				,firstName, mInitial, lastName, Address, email, phoneNumber));
		String confirmation = input.next();
	}

}
