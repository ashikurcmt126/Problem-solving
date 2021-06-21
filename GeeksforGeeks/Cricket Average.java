public class CricketAvg {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int c=0;
			int n=sc.nextInt();long sum=0;
			while(n-->0){
				int k=sc.nextInt();
				String s=sc.next();
				
				
				if(s.equals("notout")){
					sum=sum+k;
					
				}else{
					sum=sum+k;c++;
				}
			}
			if(c==0){
			    System.out.println(-1);
			}else{
			    double d=(double)sum/(double)c;
			System.out.println((int)Math.ceil(d));
			}
		}
	}

}