public class MinimumProduct {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int k=sc.nextInt();
			Arrays.sort(a);
			long sum=1;
			for(int i=0;i<k;i++){
				sum=(sum*a[i])%1000000007;
			}
			System.out.println(sum);
		}
	}

}
