public class MergeString {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0){
			String s1=sc.next();
			String s2=sc.next();
			int k;
			if(s1.length()<s2.length())k=s2.length();else k=s1.length();
			String str="";
			int i=0,amar=0,tomar=0;
			while(i<k){
			if(amar<s1.length()){
				str=str+s1.charAt(amar);
				amar++;
			}
			if(tomar<s2.length()){
				str=str+s2.charAt(tomar);
				tomar++;
			}
			i++;
			}
			System.out.println(str);
		}
	}

}