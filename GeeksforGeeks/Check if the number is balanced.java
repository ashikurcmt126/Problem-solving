public class NumberBalance {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			int k=s.length();
			int sum=0;
			for(int i=0;i<k/2;i++){
				sum+=s.charAt(i)-48;
			}
			int sum1=0;
			for(int i=(k/2)+1;i<s.length();i++){
				sum1+=s.charAt(i)-48;
			}
			
			if(sum==sum1){
				System.out.println(1);
			}else{
				System.out.println(0);
			}
		}
	}

}