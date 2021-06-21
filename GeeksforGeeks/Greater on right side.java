public class greaterR8 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			
			int max=a[n-1];
			a[n-1]=-1;
			for(int i=n-2;i>=0;i--){
				int tme=a[i];
				a[i]=max;
				
				if(max<tme){
					max=tme;
				}
				
			}
			for(int i=0;i<n;i++){
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
	}

}
