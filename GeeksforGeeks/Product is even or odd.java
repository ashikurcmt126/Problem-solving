public class ProductEoO {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s1=sc.next();
			String s2=sc.next();
			char ch1=s1.charAt(s1.length()-1);
			char ch2=s2.charAt(s2.length()-1);
			int b1=ch1-48;
			int b2=ch2-48;
			if((b1*b2)%2==0){
				System.out.println(1);
			}else{
				System.out.println(0);
			}
			
			
		}
	}

}
