public class sumOf2Num {
	public static void main(String args[]){
		Scanner sc=new  Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int m=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[m];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			for(int i=0;i<m;i++)b[i]=sc.nextInt();
			int s=0;
			int result=0;
			String si="";
			int x=n-1;int y=m-1;
			while(x>=0||y>=0||s==1){
				if(x>=0){
					result+=a[x];
				}
				if(y>=0){
					result+=b[y];
				}
				result+=s;
				s=result/10;
				si+=result%10;
				result=0;
				x--;y--;
				//System.out.println(si);
			}
			for(int i=si.length()-1;i>=0;i--){
				System.out.print(si.charAt(i)+" ");
			}
			System.out.println();
		}
	}

}