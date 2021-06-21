public class LargestNumPossible {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int k=sc.nextInt();
			if(k==0){
				System.out.println(-1);
			}
			else if(k>9*n){
				System.out.println(-1);
			}else{
				
				int a[]=new int[n];
				for(int i=0;i<n;i++){
					if(k>=9){
						a[i]=9;
						k=k-9;
					}else{
						a[i]=k;
						k=0;
					}
				}
				for(int i=0;i<n;i++){
					System.out.print(a[i]);
				}
				System.out.println();
			}
		}
	}

}