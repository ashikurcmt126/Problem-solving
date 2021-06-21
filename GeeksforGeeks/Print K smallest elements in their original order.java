public class SmallElementOrginalOrder {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[n];
			int k=sc.nextInt();
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
				b[i]=a[i];
			}
			
			int h[]=new int[100001];
			Arrays.sort(a);
			for(int i=0;i<k;i++){
				h[a[i]]++;
			}
			for(int i=0;i<n;i++){
				if(h[b[i]]>=1){
					System.out.print(b[i]+" ");
					h[b[i]]--;
				}
			}
			System.out.println();
			
		}
	}

}