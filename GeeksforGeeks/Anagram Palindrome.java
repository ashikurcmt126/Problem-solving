public class AnaPali {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s1=sc.next();
			
			int ch[]=new int[26];
			for(int i=0;i<s1.length();i++){
				ch[s1.charAt(i)-97]++;
			}
			int c=0;
			int check=0;
			if(s1.length()%2==1){
				for(int i=0;i<s1.length();i++){
					if(ch[s1.charAt(i)-97]%2==0){
						
					}else{
						c++;
						if(c>1){
							check=1;
							break;
						}
					}
				}
				if(check==1){
					System.out.println("No");
				}else{
					System.out.println("Yes");
				}
			}else{
				for(int i=0;i<s1.length();i++){
					if(ch[s1.charAt(i)-97]%2==0){
						
					}else{
						c++;
						if(c>0){
							check=1;
							break;
						}
					}
				}
				if(check==1){
					System.out.println("No");
				}else{
					System.out.println("Yes");
				}
			}
		}
	}

}