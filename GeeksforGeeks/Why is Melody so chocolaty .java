public class Melody {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int sum=Integer.MIN_VALUE;
			for(int i=1;i<n;i++){
				if(a[i-1]+a[i]>sum){
					sum=a[i-1]+a[i];
				}
			}
			System.out.println(sum);
		}
	}

}