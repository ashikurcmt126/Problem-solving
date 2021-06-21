import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++){
			count=0;
			String s=sc.next();
			char ch=s.charAt(0);
			for(int j=1;j<s.length();j++){
				if(ch==s.charAt(j)){
					count++;
				}
				else
				{
					ch=s.charAt(j);
				}
			}
			System.out.println(count);
			
		}
    }
}