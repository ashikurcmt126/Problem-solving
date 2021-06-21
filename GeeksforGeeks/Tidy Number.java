public class TiddyNumber {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			long n=sc.nextLong();
			long k=n%10;
			n=n/10;int c=0;
			while(n!=0){
				long b=n%10;
				if(k<b){
					c=1;
					break;
				}else{
					k=b;
				}
				n=n/10;
			}
			if(c==1){
				System.out.println("0");
			}else{
				System.out.println("1");
			}
		}
	}

}