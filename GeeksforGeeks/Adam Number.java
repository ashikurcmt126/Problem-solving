public class Adam {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			long n=sc.nextLong();
			String s=Long.toString(n);
			String s1="";
			for(int i=s.length()-1;i>=0;i--){
				s1=s1+s.charAt(i);
			}
			long n1=Integer.valueOf(s1);
			 n=n*n;
			n1=n1*n1;
			String ashik="",rashid="";
			ashik=Long.toString(n);
			rashid=Long.toString(n1);
			int check=0;
			if(ashik.length()==rashid.length()){
				for(int i=0,j=rashid.length()-1;i<rashid.length();i++,j--){
					if(ashik.charAt(i)!=rashid.charAt(j)){
						check=1;break;
					}
				}
				if(check==1){
					System.out.println("NO");
				}else{
					System.out.println("YES");
				}
			}
			else{
				System.out.println("NO");
			}
			
		}
	}

}