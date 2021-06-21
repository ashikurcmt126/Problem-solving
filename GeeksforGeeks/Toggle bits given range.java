public class ToggleBit {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			
			String s;
			s=Integer.toBinaryString(n);
			int a=sc.nextInt();
			int b=sc.nextInt();
			String s1="";
			for(int i=s.length()-1;i>=0;i--){
				s1+=s.charAt(i);
			}
			char ch[]=s1.toCharArray();
			for(int i=a-1;i<b;i++){
				if(ch[i]=='0'){
					ch[i]='1';
				}else{
					ch[i]='0';
				}
			}
			String bangla="";
			for(int i=ch.length-1;i>=0;i--){
				bangla+=ch[i];
			}
			System.out.println(Integer.parseInt(bangla,2));
			
		}
	}

}