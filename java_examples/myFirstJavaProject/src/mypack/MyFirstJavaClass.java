package mypack;

import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyFirstJavaClass {

    public static void main(String[] args) {
    	String s ="welcometojava";
    	int k = 3;
    	String smallest = "";
        String largest = "";
        int start = 0;
        int end = k;
        smallest = s.substring(start,end);
        largest = s.substring(start,end);
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        while(end !=s.length()){
        start++;
           end++;
           System.out.println(s.substring(start, end).compareTo(smallest));
        smallest = s.substring(start, end).compareTo(smallest) < 0 ? smallest=s.substring(start, end): smallest;
        	//s.substring(start, end).compareTo(smallest) > 0? smallest=s.substring(start, end):s.substring(start, end).compareTo(largest)<0 ? largest =s.substring(start, end) : ;
        largest = s.substring(start, end).compareTo(largest)>0 ? largest=s.substring(start, end) : largest;
        
        
        }
        
        System.out.println(smallest +" "+largest);
    	
    	
    }
}