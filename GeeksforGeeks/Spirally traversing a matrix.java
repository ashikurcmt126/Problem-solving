public class MaTra {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int a[][]=new int[4][4];
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					a[i][j]=sc.nextInt();
				}
			}
			int r=3,g=0;
			for(int i=0;i<4;i++){
				for(int j=g;j<r;j++){
					System.out.print(a[i][j]+" ");
				}
				for(int k=g;k<r;k++){
					System.out.print(a[k][r]+" ");
				}
				for(int m=r;m>g;m--){
					System.out.print(a[r][m]+" ");
				}
				for(int n=r;n>g;n--){
					System.out.print(a[n][g]+" ");
				}
				r--;
				g++;
			}
			System.out.println();
		}
	}

}