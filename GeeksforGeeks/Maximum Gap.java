public class MaxGap {
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
			int m=0;
			for(int i=0;i<n-1;i++){
				if(Math.abs(a[i]-a[i+1])>m){
					m=Math.abs(a[i]-a[i+1]);
				}
			}
			System.out.println(m);
		}
	}

}