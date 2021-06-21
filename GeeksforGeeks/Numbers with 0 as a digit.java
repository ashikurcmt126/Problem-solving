public class NumberWith0 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();int count=0;
			for(int i=1;i<=n;i++){
				
				
				int b=i;
				while(b!=0){
					if(b%10==0){
						
						count++;
						break;
					}
					b=b/10;
				}
			}
			System.out.println(count);
		}
	}

}