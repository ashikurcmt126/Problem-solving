public class ZeroNumber {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			int check=0;
			for(int i=1;i<s.length();i++){
				if(s.charAt(i)=='0'){
					check=1;
					break;
				}
			}
			if(s.charAt(0)=='0'){
				System.out.println("NO");
			}
			else if(check==1){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}

}