import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		long t=sc.nextInt();
		while(t-->0){
			long n=sc.nextInt();
			long k=n;
			long sum=n*n*n;
			//System.out.println(sum);
			long ki=findLength(n);
			//System.out.println(ki);
			int check=0;
			int ashik=0;
			while(ki-->0){
				ashik++;
				//System.out.println("A");
				if(n%10==sum%10){
					//System.out.println(n%10+" "+sum%10);
					n=n/10;sum=sum/10;
				}
				else{
					//System.out.println("A");
					check=1;
					break;
				}
				
			}
			//System.out.println(" "+ki);
			//System.out.println(ashik);
			if(check==0){
				System.out.println("1");
			}else{
				System.out.println("0");
			}
			
		}
	}

	private static int findLength(long sum) {
		int count=0;
		while(sum!=0){
			sum=sum/10;
			count++;
		}
		return count;
		
	}
		
}