public class SumDigitPri {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			n=digit(n);
			//System.out.println(n);
			if(Pri(n)==true){
				System.out.println("P");
			}
			else{
				System.out.println("NP");
			}
		}
	}

	private static boolean Pri(int n) {
		if(n==1){
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}

	private static int digit(int n) {
		int sum=0,count=0;
		int k=0;
		while(true){
			while(n!=0){
				count++;
				k=n%10;
				sum=sum+k;
				n=n/10;
			}
			if(count==1){
				break;
			}
			n=sum;count=0;sum=0;
		}
		
		
		return sum;
	}
	

}