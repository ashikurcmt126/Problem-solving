public class AndOperation {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int m=sc.nextInt();
			int and=n;
			for(int i=n+1;i<=m;i++){
				and=and&i;
			}
			System.out.println(and);
		}
	}

}