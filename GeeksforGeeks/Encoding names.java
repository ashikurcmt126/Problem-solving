public class EncodingName {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			for(int i=0;i<s.length();i++){
				System.out.print((int)s.charAt(i)+(i-10));
			}
			System.out.println();
		}
	}

}