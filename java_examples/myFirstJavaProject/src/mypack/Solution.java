package mypack;

import java.lang.*;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);



String input;
input = sc.nextLine();
    
for(int i = 0; i<input.length();i++){
    String check = input.charAt(i)+"";
    //System.out.println(check);
    input =input.replaceAll(check,"");
    
}


//OUTPUT [uncomment & modify if required]
System.out.println(input); 
    }
}

