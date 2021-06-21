public class ShopInCandy {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int m=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			int min=0,max=0;
			int l=n;
			for(int i=0;i<l;i++){
				min+=a[i];
				l=l-m;
			}
			int b=0;
			for(int i=n-1;i>=b;i--){
				
				max+=a[i];
				b=b+m;
			}
			System.out.println(min+" "+max);
			
		}
	}

}