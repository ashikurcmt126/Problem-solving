public class SortedA {
	public static void main(String args[]){
		Scanner sc=new  Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int count=0;
			int check=0;
			for(int i=0;i<n;i++){
				if(a[i]==1){
					check=1;
					count++;
				}
			}
			if(check==1)System.out.println(n-count);else{
				System.out.println("-1");
			}
		}
	}

}