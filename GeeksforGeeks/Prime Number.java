public class PrimNum {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int k=0;
			if(n==1){
				System.out.println("No");
			}
			else{
				for(int i=2;i<=Math.sqrt(n);i++){
					if(n%i==0){
						k=1;
						System.out.println("No");break;
					}
				}
				if(k==0){
					System.out.println("Yes");
				}
			}
		}
	}

}