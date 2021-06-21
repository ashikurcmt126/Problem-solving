public class Palindrom {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			long n=sc.nextLong();
			String s=Long.toBinaryString(n);
			int k=0;
			for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--){
				if(s.charAt(i)==s.charAt(j)){
					
				}else{
					k=1;break;
				}
			}
			if(k==1){
				System.out.println(0);
			}else{
				System.out.println(1);
			}
		}
	}

}