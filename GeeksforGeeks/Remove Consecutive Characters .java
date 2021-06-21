public class Consicutive {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			char ch=s.charAt(0);
			String sm="";
			sm+=s.charAt(0);
			for(int i=1;i<s.length();i++){
				if(ch==s.charAt(i)){
					
				}else{
					sm+=s.charAt(i);
					ch=s.charAt(i);
				}
			}
			System.out.println(sm);
		}
	}

}