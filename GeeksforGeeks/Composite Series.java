public class CompositNumber {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			for(int i=2;i<=n;i++){
				if(check(i)){
					System.out.print(i+" ");
				}
			}
			System.out.println();
		}
	}

	private static boolean check(int i) {
		for(int k=2;k<=i-1;k++){
			if(i%k==0){
				return true;
			}
		}
		return false;
	}

}