public class TwoSComp {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			char ch[]=s.toCharArray();
			int i=0;
			for(i=s.length()-1;i>=0;i--){
				if(s.charAt(i)=='1')break;
			}
			if(i==-2){
				System.out.println("1"+s);
			}else{
				for(int j=i-1;j>=0;j--){
					if(ch[j]=='0'){
						//System.out.println("Am");
						ch[j]='1';
					}else{
						ch[j]='0';
					}
				}
				for(int l=0;l<ch.length;l++){
					System.out.print(ch[l]);
					
				}
				System.out.println();
			}
		}
	}

}