public class BitonicSubSeq {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int lis[]=new int[n];
			for(int i=0;i<n;i++){
				lis[i]=1;
			}
			for(int i=1;i<n;i++){
				for(int j=0;j<i;j++){
					if(a[j]<a[i]&&lis[i]<lis[j]+1){
						lis[i]=lis[j]+1;
					}
				}
			}
			int dis[]=new int[n];
			for(int i=0;i<n;i++){
				dis[i]=1;
			}
			for(int i=n-2;i>=0;i--){
				for(int j=n-1;j>i;j--){
					if(a[i]>a[j]&&dis[i]<dis[j]+1){
						dis[i]=dis[j]+1;
					}
				}
			}
			int max=lis[0]+dis[0]-1;
			for(int i=1;i<n;i++){
				if(max<lis[i]+dis[i]-1){
					max=lis[i]+dis[i]-1;
				}
			}
			System.out.println(max);
		}
	}

}