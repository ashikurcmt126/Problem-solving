import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		GFG g=new GFG();
		Scanner reader=new Scanner(System.in);
		int t=reader.nextInt();
		reader.nextLine();
		while(t>0){
		    String a1=reader.nextLine();
		    String a2=reader.nextLine();
		    String c=a1.substring(2, a1.length())+a1.substring(0,2);
		    String d=a1.substring(a1.length()-2,a1.length())+a1.substring(0, a1.length()-2);
		    if(a2.equals(c) || a2.equals(d))
		        System.out.println("1");
		    else
		        System.out.println("0");
		    t--;
		}
	}
}