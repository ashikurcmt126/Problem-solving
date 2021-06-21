public class CF2 {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			int count[]=new int[n+1];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
				count[a[i]]++;
			}
			for(int i=1;i<=n;i++){
				System.out.print(count[i]+" ");
			}
			System.out.println();
		}
	}

}