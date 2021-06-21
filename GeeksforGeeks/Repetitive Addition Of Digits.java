public class RepetiveOne {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			
			while(count(n)!=1){
				int b=n;
				int sum=0;
				while(b!=0){
					sum=sum+b%10;
					b=b/10;
				}
				n=sum;
			}
			System.out.println(n);
		}
	}

	private static int count(int n) {
		int count=0;
		while(n!=0){
			n=n/10;
			count++;
		}
		return count;
	}

}