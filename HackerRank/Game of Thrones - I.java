import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		int arr[]=new int[26];
		
		for(int i=0;i<str.length();i++){
			arr[str.charAt(i)-97]++;
		}
		
		int count=0;
		
		for(int i=0;i<26;i++){
			if(arr[i]%2==1){
				count++;
			}
		}
		int flag=0;
		if(count>1){
			flag=1;
		}
		if(flag==0){
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		
    }
}