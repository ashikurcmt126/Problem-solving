public class SumOfDigitModi {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int m=n;
			int sum=0;
			while(count(n)>=2){
				while(m!=0){
					sum=sum+m%10;
					m/=10;
				}
				m=sum;
				n=sum;
				sum=0;
			}
			if(m==1){
				System.out.println("Magic");
			}else{
				System.out.println("Not Magic");
			}
		}
	}

	private static int count(int n) {
		int count=0;
		while(n!=0){
			count++;
			n=n/10;
		}
		return count;
	}

}