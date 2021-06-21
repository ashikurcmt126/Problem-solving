public class Twisted {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		int n=sc.nextInt();
		int c=0;
		if(isp(n)){
			String ashik=Integer.toString(n);
			String rashid="";
			for(int i=ashik.length()-1;i>=0;i--){
				rashid+=ashik.charAt(i);
			}
			int k=Integer.valueOf(rashid);
			if(isp(k)){
				System.out.println("Yes");
				c=1;
			}else{
				System.out.println("No");
			}
		}
		else{
			System.out.println("No");
		}
		}
	}

	private static boolean isp(int n) {
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0)return false;
		}
		return true;
	}

}