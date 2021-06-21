public class Pronic {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int i=0,k=0;
			while(i<=n){
				k=k+2;
				System.out.print(i+" ");
				i=i+k;
			}
			System.out.println();
		}
	}

}