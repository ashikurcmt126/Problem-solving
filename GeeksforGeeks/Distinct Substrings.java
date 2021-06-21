public class DistinctSubstr {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			
			String s=sc.next();
			HashMap hm=new HashMap();
			String si="";
			for(int i=0;i<s.length()-1;i++){
				si=si+s.charAt(i);
				si=si+s.charAt(i+1);
				hm.put(si,1);
				si="";
			}
			System.out.println(hm.size());
		}
	}

}