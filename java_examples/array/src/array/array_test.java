package array;

import java.util.Arrays;
public class array_test {

	public static void main(String[] args) {
		/*char[] name = {'h','e','l','l','o',' ','W','o','r','l','d'};
		System.out.println(name);
		name[0] = 'H';
		System.out.println(name);*/
		int[] ar= {10,8, 5, 9, 1232, 11, 121, 33, 143, 65, 127};
		ar[0]= 5;

		
		//odd 
	for(int i = 0; i< ar.length; i++) {
		if(ar[i]%2 == 1) {
			System.out.println(ar[i]);
		}
	}
	//prime
	for(int i = 0; i< ar.length; i++) {
		int check = ar[i];
		String prime = "is prime";
		for (int j = 2; j < check/2; j++) {
			if(check%j == 0) {
				prime= "is not prime";
			}
		}
		System.out.println("This " + ar[i]+ " " + prime);
	}
	//palindrome
	for(int i = 0; i< ar.length; i++) {
		
		}
	
	}
}
