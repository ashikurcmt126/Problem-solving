public class removeDup {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			
			HashMap<Character,Integer> map=new HashMap<Character,Integer>();
			for(int i=0;i<s.length();i++){
				if(map.containsKey(s.charAt(i))){
					int x=map.get(s.charAt(i))+1;
					map.put(s.charAt(i),x);
				}
				else{
					map.put(s.charAt(i),1);
				}
			}
			for(int i=0;i<s.length();i++){
				if(map.get(s.charAt(i))>=1){
					System.out.print(s.charAt(i));
					map.put(s.charAt(i),0);
				}
			}
			System.out.println();
		}
	}

}