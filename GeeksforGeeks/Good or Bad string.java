public class VowelConso {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			int vo=0;
			int co=0;int ashik=0;
			for(int i=0;i<s.length();i++){
				if(v(s.charAt(i))==1){
					ashik=0;
					co++;
					if(co>5){
						vo=1;
						//System.out.println("A");
						System.out.println(0);break;
					}
				}
				else if(s.charAt(i)=='?'){
					ashik++;co++;
					 if(ashik>5||co>3)
		                {
						 vo=1;
		                    System.out.println(0);break;
		                }
				}
				else if(v(s.charAt(i))==0){
					co=0;
					ashik++;
					if(ashik>3){
						vo=1;
						//System.out.println("B");
						System.out.println(0);
						break;
					}
					}
				
				}
			if(vo==0){
				System.out.println(1);
			}
		}
	}

	private static int v(char charAt) {
		if(charAt=='a'||charAt=='e'||charAt=='i'||charAt=='o'||charAt=='u'){
			return 1;
		}
		return 0;
	}

}