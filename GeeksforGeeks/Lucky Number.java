public class LuckyGf {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			HashSet<Integer> hs=new HashSet<Integer>();
			int g=0;
			for(int i=0;i<s.length();i++){
				int b=Character.getNumericValue(s.charAt(i));
				if(hs.contains(b)){
					g=1;break;
				}else{
					hs.add(b);
				}
				int mul=b;
				for(int j=i+1;j<s.length();j++){
					mul=mul*Character.getNumericValue(s.charAt(j));
					if(hs.contains(mul)){
						g=1;break;
					}else{
						hs.add(mul);
					}
				}
				if(g==1)break;
			}
			if(g==1)System.out.println(0);else{
				System.out.println(1);
			}
		}
	}

}