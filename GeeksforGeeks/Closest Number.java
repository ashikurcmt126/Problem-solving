
public class Closest {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int k=a%b;
			//System.out.println(k);
			int ashik=0,rashid=0;
			if(a<0&&b<0){
				ashik=(a-k);
				rashid=a-(k-b);
				if(Math.abs(a-ashik)==Math.abs(a-rashid)){
					System.out.println(rashid);
				}
				else if(Math.abs(a-ashik)<Math.abs(a-rashid)){
					System.out.println(ashik);
				}
				else{
					System.out.println(rashid);
				}
			}
			else if(a<0){
				ashik=(a-k);
				rashid=a-(k+b);
				if(Math.abs(a-ashik)==Math.abs(a-rashid)){
					System.out.println(rashid);
				}
				else if(Math.abs(a-ashik)<Math.abs(a-rashid)){
					System.out.println(ashik);
				}
				else{
					System.out.println(rashid);
				}
				//System.out.println(ashik+" "+rashid);
			}else{
				 ashik=(a-k);
				 rashid=a+(b-k);
				 if(Math.abs(a-ashik)==Math.abs(a-rashid)){
					 System.out.println(rashid);
				 }
				 else if(a-ashik<(rashid-a)){
						System.out.println(ashik);
					}else{
						System.out.println(rashid);
					}
			}
			
			
			
			
		}
	}

}