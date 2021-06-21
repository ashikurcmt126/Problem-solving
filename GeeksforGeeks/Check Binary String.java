public class CheckBinary {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			int c1=0,c2=0;
			int check=1;
			int d=0,m=0,n=0;
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)=='1'&&d==0){
					m=1;
				}
				if(s.charAt(i)=='0'&&m==1){
					n=1;
				}
				if(s.charAt(i)=='1'&&n==1){
					check=0;
					break;
				}
			}
			if(check==1){
				System.out.println("VALID");
			}else{
				System.out.println("INVALID");
			}
		}
	}

}