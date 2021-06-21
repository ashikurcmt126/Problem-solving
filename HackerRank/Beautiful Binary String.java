import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		
		int count=0;
		int j=3;
		for(int i=0;i<s.length()-2;){
			if(s.substring(i,j).equals("010")){
				count++;
				i=i+3;
				j=j+3;
			}
			else
				
			{
				i+=1;
				j+=1;
			}
		}
		
		System.out.println(count); 
    }
}