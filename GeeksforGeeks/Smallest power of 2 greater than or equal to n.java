public class SmallestPower {
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			for(int i=0;i<n;i++){
				int k=(int) Math.pow(2,i);
				if(k>=n){
					System.out.println(k);break;
				}
			}
			
		}
	}

}