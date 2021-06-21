public class SumOfDia {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[][]=new int[n][n];
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					a[i][j]=sc.nextInt();
				}
			}
			int sum=0,sum1=0;
			for(int i=0,j=n-1;i<n;i++,j--){
				for(int k=0,l=n-1;k<n;k++,l--){
					if(i==k){
						sum+=a[i][k];
					}
					if(j==l){
						sum1+=a[i][l];
					}
				}
			}
			System.out.println(sum+" "+sum1);
		}
	}

}