public class CountOccour {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			String s1=sc.next();
			int count=0;
			HashMap<Character,Integer> map1=new HashMap<Character,Integer>();
			for(int i=0;i<s1.length();i++){
				if(map1.containsKey(s1.charAt(i))){
					int x=map1.get(s1.charAt(i))+1;
					map1.put(s1.charAt(i),x);
				}else{
					map1.put(s1.charAt(i),1);
				}
			}
			for(int i=0;i<=s.length()-s1.length();i++){
				String si=s.substring(i,i+s1.length());
				//System.out.println(si);
				HashMap<Character,Integer> map2=new HashMap<Character,Integer>();
				for(int j=0;j<si.length();j++){
					if(map2.containsKey(si.charAt(j))){
						int x=map2.get(si.charAt(j))+1;
						map2.put(si.charAt(j),x);
					}else{
						map2.put(si.charAt(j),1);
					}
				}
				char ch;
				int check=0;
				for(int k=0;k<si.length();k++){
					ch=si.charAt(k);
					if(map1.get(ch)==map2.get(ch)){
						check=check+map1.get(ch);
						//System.out.println(check);
						//map1.put(ch,0);
						map2.put(ch,0);
					}
				}
				if(check==si.length()){
					count++;
				}
				map2.clear();
				si="";
			}
			System.out.println(count);
		}
	}

}