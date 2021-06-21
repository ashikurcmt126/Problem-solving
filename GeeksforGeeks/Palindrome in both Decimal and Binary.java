public class PalinDeciAndBin {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			String b=Integer.toString(n);
			String s=doBin(n);
			if(Checkst(s)==true&&CheckDi(b)==true){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}

	private static boolean CheckDi(String n) {
		for(int i=0,j=n.length()-1;i<n.length()/2;i++,j--){
			if(n.charAt(i)==n.charAt(j)){
				
			}else{
				return false;
			}
		}
		return true;
	}

	private static boolean Checkst(String s) {
		for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--){
			if(s.charAt(i)==s.charAt(j)){
				
			}else{
				return false;
			}
		}
		return true;
	}

	private static String doBin(int n) {
		String s="";
		while(n!=0){
			s=s+n%2;
			n/=2;
		}
		return s;
	}

}