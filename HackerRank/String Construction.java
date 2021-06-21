import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			String s1=sc.next();
			char cArr[]=s1.toCharArray();
			Arrays.sort(cArr);
			int count=1;
			char ch=cArr[0];
			for(int j=0;j<s1.length();j++){
				
				if(cArr[j]==ch){
					
				}
				else
				{
					ch=cArr[j];
					count++;
					
				}
			}
			
			System.out.println(count);
			
		}
    }
}