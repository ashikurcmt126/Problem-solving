public class Narcissistic {
	public static void main(String args[]){
		Scanner sc=new  Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			long n=sc.nextInt();
			long k=n;
			long total=0;
			int c=count(n);
			while(n!=0){
				long b=n%10;
				total=(long) (total+Math.pow(b, c));
				n=n/10;
			}
			//System.out.println(total);
			if(total==k){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}

	private static int count(long n) {
		int c=0;
		while(n!=0){
			c++;
			n/=10;
		}
		return c;
	}

}