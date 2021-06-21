public class StockBuy {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int check=0;
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int amar=0,g=0;
			for(int i=0;i<n-1;i++){
				if(a[i]<a[i+1]){
					if(g==0){
						amar=i;
						g=1;
					}
				}
				else if(g==1&&a[i]>a[i+1]){
					check=1;
					System.out.print("("+amar+" "+i+")"+" ");
					g=0;
				}
			}
			if(g==1){
				check=1;
				System.out.print("("+amar+" "+(n-1)+")"+" ");
			}
			if(check==0){
				System.out.print("No Profit");
			}
			System.out.println();
		}
	}

}