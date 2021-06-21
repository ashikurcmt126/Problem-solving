import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			sc.nextLine();
			String str=sc.nextLine();
			str=str.trim();
			str=str.toLowerCase();
			str=str.replace(' ','_');
			
			System.out.println(str);
		}
	}
}