public class Multiple {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int k=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int b=0,c=1,i;
			if(n==1){
				if(a[0]%k==0){
					System.out.println(a[0]);
				}else{
					System.out.println(0);
				}
			}else{
				for(i=0;i<n;i++){
					if(a[i]%k==0){
						b=a[i];
						c=0;
						break;
					}
				}
				if(c==1){
					System.out.println(0);
				}else{
					for(int j=i+1;j<n;j++){
						if(a[j]%k==0){
							b=b|a[j];
						}
					}
					System.out.println(b);
				}
			}
			
			}
		}
	}