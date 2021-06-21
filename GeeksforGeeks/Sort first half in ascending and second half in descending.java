public class AscendingDescending {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			int k;
			k=n/2;
			for(int i=0;i<k;i++){
				System.out.print(a[i]+" ");
			}
			for(int i=n-1;i>=k;i--){
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
	}

}