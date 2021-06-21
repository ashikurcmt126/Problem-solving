public class pwerof2 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			long n=sc.nextLong();
			long sum=0;
			long c=0;
			for(int i=0;i<n;i++){
				sum=(long)Math.pow(2,i);
				if(sum==n){
					c=1;
					System.out.println("YES");
					break;
				}
				if(sum>n){
					
					break;
				}
			}
			if(c==0){
				System.out.println("NO");
			}
		}
	}

}