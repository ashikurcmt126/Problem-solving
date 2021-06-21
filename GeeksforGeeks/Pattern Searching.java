public class PatternSea {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s1=sc.next();
			String s2=sc.next();
			int count=0,check=0;
			for(int i=0;i<s1.length()-s2.length()+1;i++){
				int k=i;
				int ashik=0;
				count=0;
				if(s1.charAt(k)==s2.charAt(ashik)){
					k++;count=1;
					for(int j=1;j<s2.length();j++){
						if(s1.charAt(k)==s2.charAt(j)){
							count++;
							
						}else{
							break;
						}
						k++;
					}
				}
				if(count==s2.length()){
					check=1;break;
				}
			}
			if(check==1)System.out.println("found");else{
				//System.out.println(count);
				System.out.println("not found");
			}
		}
	}

}