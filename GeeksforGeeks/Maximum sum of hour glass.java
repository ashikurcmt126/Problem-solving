public class SumOfHour {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int m=sc.nextInt();
			int a[][]=new int[n][m];
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					a[i][j]=sc.nextInt();
				}
			}
			int sum=0;
			if(n<=2||m<=2){
				System.out.println(-1);
			}else{
			for(int i=0;i<n-2;i++){
				for(int j=0;j<m-2;j++){
					int r=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
					if(sum<r){
						sum=r;
					}
				}
			}
			System.out.println(sum);
			}
		}
	}

}