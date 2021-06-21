public class TransPoseMat {
	public static void main(String args[]){
		Scanner sc=new  Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a1[][]=new int[n][n];
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					a1[i][j]=sc.nextInt();
				}
			}
			
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					System.out.print(a1[j][i]+" ");
				}
			}
			System.out.println();
	}
	}
}
