public class SearchInRo2 {
	public static void main(String args[]){
		Scanner sc=new  Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int k=sc.nextInt();
			int check=0,b=0;
			for(int i=0;i<n;i++){
				if(a[i]==k){
					check=1;b=i;
				}
			}
			if(check==1)System.out.println(b);else{
				System.out.println("-1");
			}
		}
	}

}