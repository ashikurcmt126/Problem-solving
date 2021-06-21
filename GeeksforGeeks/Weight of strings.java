
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			int sum=0;
			for(int i=s.length()-1;i>=0;i--){
				sum=sum+((int)s.charAt(i)-96);
			}
			String s1=sc.next();
			int sum1=0;
			for(int i=s1.length()-1;i>=0;i--){
				sum1=sum1+((int)s1.charAt(i)-96);
			}
			if(sum>sum1){
				System.out.println("1");
			}else if(sum<sum1)System.out.println("2");else{
				System.out.println("equal");
			}
			
		}
	}
}