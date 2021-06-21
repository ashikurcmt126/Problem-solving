public class SetOddBit {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			String s="";
			while(n!=0){
				s=s+n%2;
				n=n/2;
			}
			String ashik="";
			for(int i=0;i<s.length();i++){
				if(i%2==0){
					ashik=ashik+'1';
				}else{
					ashik=ashik+s.charAt(i);
				}
			}
			String rashid="";
			for(int i=ashik.length()-1;i>=0;i--){
				rashid+=ashik.charAt(i);
			}
			System.out.println(Integer.parseInt(rashid,2));
		}
	}

}