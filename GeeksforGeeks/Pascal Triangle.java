public class PasTri {
	public static void main(String args[]){
		Scanner sc=new  Scanner(System.in);
		int t=sc.nextInt();
		int a[][]=new int[25][25];
		a[0][0]=1;
		a[1][0]=1;
		a[1][1]=1;
		int j=0;
		for(int i=2;i<25;i++){
			a[i][0]=1;
			for( j=1;j<i;j++){
				a[i][j]=a[i-1][j-1]+a[i-1][j];
			}
			a[i][j]=1;
		}
		while(t-->0){
			int n=sc.nextInt();
			
			for(int i=n-1;i<n;i++){
				for(int k=0;k<n;k++){
					System.out.print(a[i][k]+" ");
				}
			}
			System.out.println();
		}
	}

}