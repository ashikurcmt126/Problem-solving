public class NonRepeat {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			String s=sc.next();
			HashMap<Character,Integer> mp=new HashMap<Character,Integer>();	
			for(int i=0;i<s.length();i++){
				if(mp.containsKey(s.charAt(i))){
					int x=mp.get(s.charAt(i))+1;
					mp.put(s.charAt(i),x);
				}else{
					mp.put(s.charAt(i),1);
				}
			}
			int check=0;
			char ch=' ';
			for(int i=0;i<s.length();i++){
				if(mp.get(s.charAt(i))==1){
					check=1;
					ch=s.charAt(i);
					break;
				}
			}
			if(check==1)System.out.println(ch);else{
				System.out.println("-1");
			}
		}
	}

}