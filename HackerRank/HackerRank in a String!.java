import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {
static String check(String s2,String s){
		int j=0;
		if(s2.length()>s.length()){
			return "NO";
		}
		else
		{
			
			for(int i=0;i<s.length();i++){
				if(j<s2.length()&&s.charAt(i)==s2.charAt(j)){
					j++;
				}
			}
		}
		return (j==s2.length())?"YES":"NO";
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s2="hackerrank";
	int n=sc.nextInt();
	for(int i=0;i<n;i++){
		String s=sc.next();
		String k=check(s2,s);
		System.out.println(k);
	}
	 
	}
    
}