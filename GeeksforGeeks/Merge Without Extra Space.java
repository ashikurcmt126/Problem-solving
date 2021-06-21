public class SortedArr {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int m=sc.nextInt();
			int a[]=new int[n];
			int ab[]=new int[n];
			int b[]=new int[m];
			int bb[]=new int[m];
			for(int i=0,j=n-1;i<n;i++,j--){
				ab[i]=sc.nextInt();
				a[j]=ab[i];
			}
			for(int i=0,j=m-1;i<m;i++,j--){
				bb[i]=sc.nextInt();
				b[j]=bb[i];
			}
			int d=0,s=0,k=0;
			while(d<=n+m){
				if(a[s]<=b[k]){
					System.out.print(b[k]+" ");k++;
					if(k>=m){
						break;
					}
				}else{
					System.out.print(a[s]+" ");s++;
					if(s>=n){
						break;
					}
				}
				d++;
			}
			for(int i=s;i<n;i++){
				System.out.print(a[i]+" ");
			}
			for(int i=k;i<m;i++){
				System.out.print(b[i]+" ");
			}
			System.out.println();
			
		}
	}

}