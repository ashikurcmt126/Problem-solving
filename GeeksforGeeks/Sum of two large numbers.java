public class TwoLargeNumber {
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			String s1=sc.next();
			String Am=s;
			
				String s2="";
				
				int c=0,d=0,d1=0,sum=0,add=0,car=0;
				String s3="";
				if(s.length()<s1.length()){
					s3=s1;
					s1=s;
					s=s3;
				}
				
				int amar=s1.length()-1;
				for(int i=s.length()-1;i>=0;i--){
					
					d=s.charAt(i)-48;
					if(amar>=0){
						d1=s1.charAt(amar)-48;
						
						sum=d1+d+car;
						add=sum%10;
						car=sum/10;
						s2=s2+add;
					}else{
						sum=d+car;
						add=sum%10;
						s2=s2+add;
						car=sum/10;
					}
					amar--;
				}
				if(car!=0){
					s2=s2+car;
				}
			
					if(Am.length()<s2.length()){
						System.out.println(Am);
					}else{
						for(int i=s2.length()-1;i>=0;i--){
							System.out.print(s2.charAt(i));
						}
						System.out.println();
					}
					
				}
			}
		}