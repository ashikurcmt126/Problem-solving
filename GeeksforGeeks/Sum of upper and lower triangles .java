public class SumDiagonal {
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
			int sum1=0,sum2=0;
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					if(i==j||i<j){
						sum1+=a[i][j];
					}
					if(i==j||i>j){
						sum2+=a[i][j];
					}
				}
			}
			System.out.println(sum1+" "+sum2);
		}
	}

}