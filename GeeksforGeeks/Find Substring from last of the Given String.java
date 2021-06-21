public class SubString {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s1=sc.next();
			String s2=sc.next();
			int l1=s1.length();
			int l2=s2.length();
			int c=0;
			int posi=0;
			for(int i=0;i<=l2-l1;i++){
				int k=i,count=0;
				for(int j=0;j<l1;j++){
					if(s2.charAt(k)==s1.charAt(j)){
						count++;k++;
					}else{
						break;
					}
				}
				if(count==l1){
					c=1;
					posi=(i)+1;
					
				}
			}
			if(c==0){
				System.out.println(-1);
			}else{
				System.out.println(posi);
			}
		}
	}

}