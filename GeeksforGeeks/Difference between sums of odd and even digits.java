public class Difference {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			int sum1=0,sum2=0;
			for(int i=0;i<s.length();i++){
				int b=s.charAt(i)-48;
				if(i%2==0){
					sum1=sum1+b;
				}else{
					sum2=sum2+b;
				}
			}
			if(sum1-sum2==0){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
			
		}
	}

}