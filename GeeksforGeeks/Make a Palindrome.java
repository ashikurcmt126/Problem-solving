public class MakePali {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			int ch[]=new int[26];
			for(int i=0;i<s.length();i++){
				ch[s.charAt(i)-97]++;
			}
			int count=0,c=0;
			for(int i=0;i<26;i++){
				if(ch[i]%2==1){
					if(c==0){
						
					}
					else{
						count++;
					}
					c=1;
				}
			}
			System.out.println(count);
		}
	}

}