
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new  Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String str=sc.next();
			char ch[]=new char[26];
			for(int i=str.length()-1;i>=0;i--){
				ch[str.charAt(i)-97]++;
			}
			int k=0;
			for(int i=0;i<26;i++){
				if(ch[i]>1){
					 k=1;
					break;
				}
			}
			if(k==1){
				System.out.println("0");
			}else{
				System.out.println("1");
			}
		}
	}
}