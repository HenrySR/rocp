import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        String regex = "<(.+)>.+</(.+)>";
        Pattern p = Pattern.compile(regex);
        String start;
        String end;

		while(testCases>0){
            String line = in.nextLine();
			Matcher m = p.matcher(line);
			
			System.out.println(line);
            
			
			testCases--;
		}
	}
}



