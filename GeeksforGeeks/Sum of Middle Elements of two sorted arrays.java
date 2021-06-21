public class SumMiddleEle {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			
			int a[]=new int[n];
			int ab[]=new int[n];
			int b[]=new int[n];
			int bb[]=new int[n];
			int ashikur[]=new int[n+n];
			int g=2*n-1;
			for(int i=0,j=n-1;i<n;i++,j--){
				ab[i]=sc.nextInt();
				a[j]=ab[i];
			}
			for(int i=0,j=n-1;i<n;i++,j--){
				bb[i]=sc.nextInt();
				b[j]=bb[i];
			}
			int d=0,s=0,k=0;
			while(d<=n+n){
				if(a[s]<=b[k]){
					//System.out.print(b[k]+" ");
					ashikur[g]=b[k];g--;
					k++;
					if(k>=n){
						break;
					}
				}else{
					//System.out.print(a[s]+" ");
					ashikur[g]=a[s];g--;
					s++;
					if(s>=n){
						break;
					}
				}
				d++;
			}
			for(int i=s;i<n;i++){
				//System.out.print(a[i]+" ");
				ashikur[g]=a[i];g--;
			}
			for(int i=k;i<n;i++){
				//System.out.print(b[i]+" ");
				ashikur[g]=b[i];g--;
			}
//			for(int i=0;i<2*n;i++){
//				System.out.print(ashikur[i]+" ");
//			}
//			System.out.println();
			int jibon=(2*n);
			if(jibon%2==0){
				System.out.println(ashikur[(2*n)/2-1]+ashikur[(2*n)/2]);
			}else{
				System.out.println(ashikur[(2*n)/2]);
			}
			
		}
	}

}