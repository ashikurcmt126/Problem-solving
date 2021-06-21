public class makeOdd {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			
			if(n%2==1){
				System.out.println(1);
			}else{
				for(int i=2;i<=n;i++){
					if(n%i==0){
						if((n/i)%2==1){
							System.out.println(i);break;
						}
					}
				}
			}
		}
	}

}