public class MaxOfAllsub {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int m=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)a[i]=sc.nextInt();
			
			int max=0;
			for(int i=0;i<=n-m;i++){
				max=a[i];
				for(int j=1;j<m;j++){
					if(a[i+j]>max){
						max=a[i+j];
					}
				}
				System.out.print(max+" ");
			}
			System.out.println();
		}
	}

}