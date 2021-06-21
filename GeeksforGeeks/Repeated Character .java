public class RepeatedChar {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			int a[]=new int[26];
			int c=0;
			for(int i=0;i<s.length();i++){
				a[s.charAt(i)-97]++;
			}
			int l=0;
			for(int i=0;i<s.length();i++){
				l=s.charAt(i)-97;
				if(a[l]>=2){
					c=1;
					System.out.println(s.charAt(i));
					break;
				}
			}
			
			if(c==0){
				System.out.println("-1");
			}
		}
	}

}