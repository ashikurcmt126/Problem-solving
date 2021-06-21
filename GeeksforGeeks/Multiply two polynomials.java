public class Multiply {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int m=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[m];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			for(int j=0;j<m;j++){
				b[j]=sc.nextInt();
			}
			int c[]=new int[n+m];
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					c[i+j]+=a[i]*b[j];
				}
			}
			for(int i=0;i<c.length-1;i++){
				System.out.print(c[i]+" ");
			}
			System.out.println();
		}
	}

}