public class ChangeString {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			boolean b=Character.isLowerCase(s.charAt(0));
			if(b){
				s=s.toLowerCase();
			}else{
				s=s.toUpperCase();
			}
			System.out.println(s);
		}
	}

}