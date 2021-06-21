public class ConvertStr {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			s=s.replaceAll("[a|A|e|E|i|I|o|O|u|U]","");
			StringBuilder s2=new StringBuilder();int c=0;
			for(int i=0;i<s.length();i++){
				c=1;
					s2.append("#");
					if(Character.isUpperCase(s.charAt(i))){
						char ch=Character.toLowerCase(s.charAt(i));
						s2=s2.append(ch);
					}
					else{
						char ch=Character.toUpperCase(s.charAt(i));
						s2=s2.append(ch);
					}
				
			}
			if(c==0){
				System.out.println(-1);
			}else{
				System.out.println(s2);
			}
			
		}
	}

}