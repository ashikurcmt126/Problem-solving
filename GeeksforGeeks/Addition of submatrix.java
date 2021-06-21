public class additionMat {
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
			int x=sc.nextInt();
			int x1=sc.nextInt();
			int y=sc.nextInt();
			int y1=sc.nextInt();
			int sum=0;
			for(int i=x-1;i<y;i++){
				for(int j=x1-1;j<y1;j++){
					sum+=a[i][j];
				}
			}
			System.out.println(sum);
		}
	}

}
