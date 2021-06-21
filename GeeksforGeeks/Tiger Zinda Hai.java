public class TigerZindaHay {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Vector<String> v=new Vector<String>();
			String s[]=new String[n];
			for(int i=0;i<n;i++){
				s[i]=sc.next();
			}
			for(int i=0;i<n;i++){
				if(s[i].equals("END")){
					v.clear();
				}
			else if(v.contains(s[i])){
					v.remove(s[i]);
				}
				else{
					v.add(s[i]);
				}
			}
			System.out.println(v.size());
		}
	}

}