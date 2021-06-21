public class LongestDistintChar {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			HashMap<Character,Integer> map=new HashMap<Character,Integer>();
			int max=0;
			for(int i=0;i<s.length();i++){
				map.clear();
				for(int j=i;j<s.length();j++){
					if(map.containsKey(s.charAt(j))){
						int size=map.size();
						if(max<size){
							max=size;
						}
						map.clear();
						map.put(s.charAt(j),1);
					}else{
						map.put(s.charAt(j),1);
					}
				}
				if(max<map.size()){
					max=map.size();
				}
			}
			if(max<map.size()){
				max=map.size();
			}
			System.out.println(max);
			
		}
	}

}