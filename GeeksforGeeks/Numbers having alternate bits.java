public class AlterNativBits {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			long n=sc.nextLong();
			String s=Long.toBinaryString(n);
			char ch=s.charAt(0);
			int check=0;
			for(int i=0;i<s.length();i++){
				if(i%2==0&&s.charAt(i)==ch){
					
				}
				else if(i%2==1&&s.charAt(i)!=ch){
					
				}else{
					check=1;break;
				}
			}
			if(check==0){
				System.out.println(1);
			}else{
				System.out.println(0);
			}
		}
	}

}