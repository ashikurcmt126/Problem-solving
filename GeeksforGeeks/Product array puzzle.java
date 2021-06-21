public class ProductArray {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int b=1;
			for(int i=0;i<n;i++){
				b=1;
				for(int j=0;j<n;j++){
					if(i!=j)b*=a[j];
				}
				System.out.print(b+" ");
			}
			System.out.println();
			
		}
	}

}