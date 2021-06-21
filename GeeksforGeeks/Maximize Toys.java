public class MaximizeToy {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int k=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			int b=0;int count=0;
			for(int i=0;i<n;i++){
				b+=a[i];
				if(b<=k){
					count++;
				}else{
					break;
				}
			}
			System.out.println(count);
		}
	}

}