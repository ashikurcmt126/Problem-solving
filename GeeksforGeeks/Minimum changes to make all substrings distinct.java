public class Distinct {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			char ch[]=s.toCharArray();
			Arrays.sort(ch);
			char ch1=ch[0];
			int count=0;
			for(int i=1;i<s.length();i++){
				if(ch1==ch[i]){
					count++;
				}
				else{
					ch1=ch[i];
				}
			}
			System.out.println(count);
		}
	}

}