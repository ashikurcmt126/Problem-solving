import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
    	Scanner stdin = new Scanner(System.in);
        StringBuffer s = new StringBuffer(stdin.nextLine());
        
   
        for(int i = 1; i < s.length(); i++) {
        	//System.out.println(i);
        	//System.out.println(s.charAt(i-1)+" "+s.charAt(i));
            if(s.charAt(i-1) == s.charAt(i)) {
                s.delete(i-1, i+1);
                i = 0;
            }
        }
        if(s.length() == 0) System.out.println("Empty String");
        else System.out.println(s);
        
    }
}