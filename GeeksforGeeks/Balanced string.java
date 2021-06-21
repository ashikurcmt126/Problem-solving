public class BalanceStr {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			String s1="abcdefghijklmnopqrstuvwxyz";
			String s2="abcdefghijklmno";
			String s3="lmnopqrstuvwxyz";
			String fs="";
			int k=n/26;
			for(int i=0;i<k;i++){
				fs=fs+s1;
			}
			int k1=n%26;
			//System.out.println(k1);
			int rashid=num(n);
			//System.out.println(rashid);
			if(k1%2==0){
				//System.out.println("A");
				for(int i=0;i<k1/2;i++){
					fs=fs+s2.charAt(i);
				}
				for(int i=(s2.length()-(k1/2));i<s2.length();i++){
					fs=fs+s3.charAt(i);
				}
			}
			else if(rashid%2==0){
				//System.out.println("B");
				for(int i=0;i<k1/2+1;i++){
					fs=fs+s2.charAt(i);
				}
				for(int i=(s2.length()-(k1/2));i<s2.length();i++){
					fs=fs+s3.charAt(i);
				}
			}
			else{
				//System.out.println("C");
				for(int i=0;i<(k1/2);i++){
					fs=fs+s2.charAt(i);
				}
				for(int j=(15-k1/2)-1;j<s3.length();j++){
					fs=fs+s3.charAt(j);
				}
			}
			System.out.println(fs);
		}
	}

	private static int num(int k1) {
		int sum=0;
		while(k1!=0){
			sum=sum+k1%10;
			k1/=10;
		}
		return sum;
	}

}