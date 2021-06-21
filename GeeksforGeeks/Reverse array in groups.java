public class SubRevArray {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int b=0;
			int k=sc.nextInt();
			int i=0,pre=0;
			while((i=b+k)<n){
				for(int j=i-1;j>=pre;j--){
					System.out.print(a[j]+" ");
				}
				b=i;
				pre=i;
			}
			i=i-k;
			for(int j=n-1;j>=i;j--){
				System.out.print(a[j]+" ");
			}
			System.out.println();
		}
	}

}