public class MaximumSumIncre {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
				b[i]=a[i];
			}
			
			int max=0;
			for(int i=1;i<n;i++){
				for(int j=0;j<i;j++){
					if(a[i]>a[j]&&b[i]<a[i]+b[j]){
						b[i]=a[i]+b[j];
					}
				}
			}
			for(int i=0;i<n;i++){
				if(max<b[i]){
					max=b[i];
				}
			}
			System.out.println(max);
		}
	}

}