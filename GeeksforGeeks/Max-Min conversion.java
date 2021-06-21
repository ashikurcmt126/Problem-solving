
import java.util.*;
public class MaxConversion {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			if(check(n)){
				int k=sum(n)+n;
				System.out.println(k);
			}else{
				System.out.println(n+n);
			}
		}
	}

	private static int sum(int n) {
		int sum=0,c=1;
		while(n!=0){
			int b=n%10;
			if(b==5){
				sum=(c*6)+sum;
			}else if(b==6){
				sum=(c*5)+sum;
			}
			else{
				sum=(c*b)+sum;
			}
			c=c*10;
			n=n/10;
		}
		return sum;
	}

	private static boolean check(int n) {
		while(n!=0){
			int b=n%10;
			if(b==5||b==6)return true;
			n/=10;
		}
		return false;
	}

}