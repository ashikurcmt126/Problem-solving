public class Isom {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s1=sc.next();
			String s2=sc.next();
			
		
			System.out.println(check(s1,s2));
			
		}
	}

	private static int check(String str1, String str2) {
		if(str1.length()!=str2.length()){
            return 0;
        }
        char[] str1_=str1.toCharArray();
        char[] str2_=str2.toCharArray();
        boolean vis1[]=new boolean[26];
        boolean vis2[]=new boolean[26];
        HashMap<Character,Character> h1=new HashMap<Character,Character>(); 
     
        
        for(int i=0;i<str1.length();i++){
            if(vis1[str1_[i]-'a']==false){
                h1.put(str1_[i],str2_[i]);
                vis1[str1_[i]-'a']=true;
            }
            else{
                if(h1.get(str1_[i])!=str2_[i]){
                    return 0;
                }
            }
        }
        h1.clear();
        for(int i=0;i<str2.length();i++){
            if(vis2[str2_[i]-'a']==false){
                h1.put(str2_[i],str1_[i]);
                vis2[str2_[i]-'a']=true;
            }
            else{
                if(h1.get(str2_[i])!=str1_[i]){
                    return 0;
                }
            }
        }
        return 1;
	}

}