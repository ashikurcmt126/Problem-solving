public class Anang {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			String s1=sc.next();
			HashMap<Character,Integer> mp=new HashMap<Character,Integer>();
			HashMap<Character,Integer> mp1=new HashMap<Character,Integer>();
			for(int i=0;i<s.length();i++){
				if(mp.containsKey(s.charAt(i))){
					int x=mp.get(s.charAt(i))+1;
					mp.put(s.charAt(i),x);
				}else{
					mp.put(s.charAt(i),1);
				}
			}
			for(int i=0;i<s1.length();i++){
				if(mp1.containsKey(s1.charAt(i))){
					int x=mp1.get(s1.charAt(i))+1;
					mp1.put(s1.charAt(i),x);
				}else{
					mp1.put(s1.charAt(i),1);
				}
			}
			int check=0;
			if(s.length()==s1.length()){
				for(int i=0;i<s.length();i++){
					if(mp.get(s.charAt(i))!=mp1.get(s.charAt(i))){
						check=1;break;
					}
				}
				if(check==1)System.out.println("NO");else{
					System.out.println("YES");
				}
			}else{
				System.out.println("NO");
			}
		}
	}

}