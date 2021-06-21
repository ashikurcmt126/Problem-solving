public class SortTheFest {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s1[]=new String[5];
			String s2[]=new String[5];
			for(int i=0;i<5;i++){
				s1[i]=sc.next();
			}
			for(int i=0;i<5;i++){
				s2[i]=sc.next();
			}
			int k=0;
			int b=0;
			for(int i=0;i<5;i++){
				
				for(int j=0;j<5;j++){
					if(s1[i].equals(s2[j])){
						
						b=1;
						k=1;break;
					}
				}
				if(b==1)break;
			}
			if(k==0)System.out.println("BEHAPPY");else{
				System.out.println("CHANGE");
			}
		}
	}

}