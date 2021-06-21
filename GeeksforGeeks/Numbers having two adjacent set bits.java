public class TwoAdjacenSet {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		/*
		 * 2
			1 no
			3 yes
		 */
		while(t-->0){
			long n=sc.nextLong();
			String s=Long.toString(n,2);
			//System.out.println(s);
			int l=s.length();
			int c=0;
			if(l==1){
				c=1;
				System.out.println("No");
			}else{
				for(int i=1;i<l;i++){
					 if(s.charAt(i-1)=='1'&&s.charAt(i)=='1'){
						c=1;
						System.out.println("Yes");break;
					}
				}
			}
			if(c==0){
				System.out.println("No");
			}
		}
	}

}