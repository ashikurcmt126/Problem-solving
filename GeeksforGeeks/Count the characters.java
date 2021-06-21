public class CountTheChar {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			int n=sc.nextInt();
			
			int c[]=new int[26];
			char ch=s.charAt(0);
			for(int i=1;i<s.length();i++){
				if(ch==s.charAt(i)){
					
				}else{
					c[s.charAt(i-1)-97]++;
					ch=s.charAt(i);
				}
			}
			int count=0;
			c[s.charAt(s.length()-1)-97]++;
			for(int i=0;i<26;i++){
				if(c[i]==n){
					count++;
				}
			}
			System.out.println(count);
			
		}
	}
}