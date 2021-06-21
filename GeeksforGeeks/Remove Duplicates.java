public class RemoveDupl {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0){
			String s=sc.nextLine();
			
			HashMap<Character,Integer> map=new HashMap<Character,Integer>();
			
			for(int i=0;i<s.length();i++){
				if(map.containsKey(s.charAt(i))){
					int x=map.get(s.charAt(i));
					map.put(s.charAt(i),x);
				}else{
					map.put(s.charAt(i),1);
				}
			}
			boolean b=true;
			for(int i=0;i<s.length();i++){
				char c=s.charAt(i);
				if(c==' '&&b==true){
					System.out.print(s.charAt(i));
				}
			else if(map.get(s.charAt(i))>=1){
					System.out.print(s.charAt(i));
					map.put(s.charAt(i),0);
					b=false;
				}
				
			}
			System.out.println();
			
			
			
		}
	}

}