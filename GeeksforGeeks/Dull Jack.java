public class DullJack {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			long a=sc.nextLong();
			long b=sc.nextLong();
			long i=1;
			long sum=0,bangla=1;
			while(i<a){
				
				bangla=(bangla*b)%1000000007;
				
				i++;
			}
			
			System.out.println(bangla);
		}
	}

}