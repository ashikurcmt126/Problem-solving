public class ElectionWinner {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			String s1[]=new String[n];
			for(int i=0;i<n;i++){
				s1[i]=sc.next();
			}
			Arrays.sort(s1);
			String s2="";
			int count=1,m=0;
			for(int i=1;i<n;i++){
				if(s1[i-1].equals(s1[i])){
					count++;
				}
				else{
					if(count>m){
						s2=s1[i-1];
						m=count;
					}
					count=1;
					
				}
			}
			if(count>m){
				System.out.println(s1[n-1]+" "+count);
			}else{
				System.out.println(s2+" "+m);
			}
		}
	}

}