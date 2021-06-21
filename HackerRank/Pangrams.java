import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int j,k;
		int count=0,check=0;
		for(j=65,k=97;j<=90;j++,k++){
			for(int i=0;i<s1.length();i++){
				if((s1.charAt(i)==j)||(s1.charAt(i)==k)){
					count++;
					check=1;
					break;
				}
			}
			if(check!=1){
				break;
			}
		}
		if(count==26){
			System.out.println("pangram");
		}
		else
		{
			System.out.println("not pangram");
		} 
    }
}
