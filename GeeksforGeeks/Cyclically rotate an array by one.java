public class RotatCycle {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int k=n-1;
			for(int i=1;i<=n;i++){
				System.out.print(a[k]+" ");
				k++;
				k=k%n;
			}
			System.out.println();
		}
	}

}