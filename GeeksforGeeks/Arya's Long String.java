public class LongString {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			int n=sc.nextInt();
			int sub=sc.nextInt();
			char ch=sc.next().charAt(0);
			int c=0;
			int l=s.length();
			int to=sub/l;
			int to1=sub%l;
			for(int i=0;i<l;i++){
				if(s.charAt(i)==ch){
					c++;
				}
			}
			int ashik=to*c;
			int rashid=0;
			for(int i=0;i<to1;i++){
				if(s.charAt(i)==ch){
					rashid++;
				}
			}
			System.out.println(ashik+rashid);
			
			
		}
	}

}