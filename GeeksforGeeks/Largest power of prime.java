public class LargestPower {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int p=sc.nextInt();
			int sum=0;
			while(n!=0){
				n=n/p;
				sum+=n;
			}
			System.out.println(sum);
		}
	}

}