import java.util.*;
public class YShaped {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int b=0;
			int p=0,q=n;
			int ashik=0,rashid=0;
			for(int i=0;i<n;i++){
				for(int k=0;k<=n;k++){
					if((i>=n/2)&&(k==n/2)){
						System.out.print("*");b=1;
					}
					else if(i>=n/2){
						System.out.print(" ");b=1;
					}
					if(b==0){
						if(k==p){
							System.out.print("*");rashid=1;
						}
						else if(k==q){
							System.out.print("*");ashik=1;
						}
						else{
							System.out.print(" ");
						}
						
					}
					
				}
				if(ashik==1){
					q--;
				}
				if(rashid==1)p++;
				//System.out.println();
			}
			System.out.println();
		}
	}

}