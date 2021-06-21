public class printPat {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int b=n;
			while(n>0){
				System.out.print(n+" ");
				n=n-5;
			}
			while(n<=b){
				System.out.print(n+" ");
				n=n+5;
			}
			System.out.println();
		}
	}

}