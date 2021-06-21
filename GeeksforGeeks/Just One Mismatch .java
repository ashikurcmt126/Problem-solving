public class JustOneChange {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			String s[]=new String[n];
			for(int i=0;i<n;i++){
				s[i]=sc.next();
			}
			String s1=sc.next();
			int Bangladesh=0;
			for(int i=0;i<n;i++){
				int amar=0;
				if(s1.length()==s[i].length())
				{
					int ki=0;int ash=0,ras=0,c=0;
					for(int j=0;j<s[i].length();j++){
						if(s1.charAt(amar)!=s[i].charAt(j)){
							c=1;
							ash++;
							if(ash>1){
								ras=1;
								break;
							}
							
						}
						amar++;
					}
					if(c==1&&ras!=1){
						Bangladesh=1;
						System.out.println("True");break;
					}
					
				}
				
			}
			if(Bangladesh==0){
				System.out.println("False");
			}
		}
	}

}