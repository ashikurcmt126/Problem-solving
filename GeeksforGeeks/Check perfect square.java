public class sqr {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			double d=Math.sqrt(n);
			int ti=(int)d;
			if(ti*ti==n){
				System.out.println(1);
			}else{
				System.out.println(0);
			}
			
			
		}
	}

}