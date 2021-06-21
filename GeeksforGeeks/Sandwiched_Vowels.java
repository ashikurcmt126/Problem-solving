public class Sandwitch {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			String fs="";
			fs=fs+s.charAt(0);
			for(int i=0,j=2;j<s.length();j++,i++){
				if(isCcheck(s.charAt(i))==true&&isVcheck(s.charAt(i+1))==true&&isCcheck(s.charAt(j))==true){
					
				}else{
					fs=fs+s.charAt(i+1);
				}
					
				
			}
			fs=fs+s.charAt(s.length()-1);
			System.out.println(fs);
		}
	}

	private static boolean isVcheck(char charAt) {
		if(charAt=='a'||charAt=='e'||charAt=='i'||charAt=='o'||charAt=='u'){
			return true;
		}
		return false;
	}

	private static boolean isCcheck(char charAt) {
		if(charAt=='a'||charAt=='e'||charAt=='i'||charAt=='o'||charAt=='u'){
			return false;
		}
		return true;
	}

}