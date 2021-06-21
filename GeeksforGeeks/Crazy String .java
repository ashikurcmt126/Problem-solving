public class CrazyString {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			String st="";
			st=st+s.charAt(0);
			if(Character.isLowerCase(s.charAt(0))){
				for(int i=1;i<s.length();i++){
					if(i%2==1){
						st=st+Character.toUpperCase(s.charAt(i));
					}else{
						st=st+Character.toLowerCase(s.charAt(i));
					}
				}
			}
			else{
				for(int i=1;i<s.length();i++){
					if(i%2==1){
						st=st+Character.toLowerCase(s.charAt(i));
					}else{
						st=st+Character.toUpperCase(s.charAt(i));
					}
				}
			}
			System.out.println(st);
		}
	}

}