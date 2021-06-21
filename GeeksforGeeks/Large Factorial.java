public class LargeFac {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			if(n==1){
				System.out.println(1);
			}else{
				String ashik="1";
				String rashid="";
				String biplob="";
				String tiya="";
				for(int i=2;i<=n;i++){
					int c=0,d=0;
					for(int j=ashik.length()-1;j>=0;j--){
						int b=ashik.charAt(j)-48;
						b=b*i+c;
						c=b/10;
						d=b%10;
						rashid=rashid+d;
					}
					
					
					for(int k=rashid.length()-1;k>=0;k--){
						biplob=biplob+rashid.charAt(k);
					}
					//ashik=biplob;
					//System.out.println("m"+rashid);
					
					
					if(c!=0){
						tiya+=c;
						tiya+=biplob;
						ashik=tiya;
					}else{
						ashik=biplob;
					}
					
					rashid="";biplob="";tiya="";
					
				}
				System.out.println(ashik);
			}
		}
	}

}