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
		String s[]=new String[n];
		for(int i=0;i<n;i++){
			s[i]=sc.next();
		}
		int result=0;
		for(char c='a';c<='z';c++){
			int co=0;
			for(int i=0;i<n;i++){
				if(s[i].contains(Character.toString(c)))
				{
					co++;
				}
				else
				{
					break;
				}
			}
			
			if(co==n){
				result++;
			}
		}
		System.out.println(result);
    }
}