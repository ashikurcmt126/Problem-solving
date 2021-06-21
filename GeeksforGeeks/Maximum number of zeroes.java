public class MaxTime0 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int max=0,max1=0,count=0;
			int ashikur=0;
			int rashid=0,rang=0;
			int fr=0;
			for(int i=0;i<n;i++){
				ashikur=a[i];
				rashid=a[i];
				count=0;
				while(ashikur!=0){
					int b=ashikur%10;
					if(b==0)count++;
					ashikur/=10;
				}
			//System.out.println(count);
				if(max<count){
					rang=1;
					fr=rashid;
					max1=rashid;
					max=count;
				}
				else if(max==count){
					if(max1<rashid){
						fr=rashid;
						max1=rashid;
					}
				}
			}
			if(rang!=1){
				System.out.println("-1");
			}else{
				System.out.println(fr);
			}
			
		}
	}

}