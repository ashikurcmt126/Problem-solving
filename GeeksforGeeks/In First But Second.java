public class InFirstBut2nd {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int m=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[m];
			int ashikur[]=new int[1001];
			int rashid[]=new int[1001];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
				//ashikur[a[i]]++;
			}
			for(int i=0;i<m;i++){
				b[i]=sc.nextInt();
				rashid[b[i]]++;
			}
			for(int i=0;i<n;i++){
				if(rashid[a[i]]==0){
					System.out.print(a[i]+" ");
				}
			}
			System.out.println();
		
		}
	}

}