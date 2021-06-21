public class MatMul {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int a[][]=new int[3][3];
			int b[][]=new int[3][3];
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					a[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					b[i][j]=sc.nextInt();
				}
			}
			int sum=0;
			int c[][]=new int[3][3];
			for(int i=0;i<3;i++){
				
				for(int j=0;j<3;j++){
					sum=0;
					for(int k=0;k<3;k++){
						sum=sum+a[i][k]*b[k][j];
						
					}
					c[i][j]=sum;
					sum=0;
				}
			}
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
		}
		
	}

}