package test;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		int i =10001;
		int x=1;
		boolean prime= true;
		while (i>0) {
			x++;
			for (int j = 2; j < x; j++) {
				if(x%j ==0) {
					prime=false;
				}
			}
			if(prime==true) {
				System.out.println(x);
				i--;
			}
			prime =true;
			
		}
		System.out.println(x);;
		

	}
}
