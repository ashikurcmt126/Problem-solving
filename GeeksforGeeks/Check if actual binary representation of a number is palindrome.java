public class BinaryRepresent {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			long n=sc.nextLong();
			String s="";
			while(n!=0){
				long b=n%2;
				s=s+b;
				n/=2;
				
			}
			int c=0;
			//System.out.println(s);
			for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--){
				if(s.charAt(i)==s.charAt(j)){
					
				}else{
					c=1;break;
				}
			}
			if(c==1){
				System.out.println(0);
			}else{
				System.out.println(1);
			}
		}
	}

}