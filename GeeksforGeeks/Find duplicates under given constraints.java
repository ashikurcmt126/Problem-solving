public class FindDuplicate {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int a[]=new int[10];
			for(int i=0;i<10;i++)a[i]=sc.nextInt();
			int i=1;
			int Bangldesh=a[0];int count=1,f=0;
			for(i=1;i<10;i++){
				if(Bangldesh==a[i]){
					count++;
				}else{
					Bangldesh=a[i];
					
					if(count==5){
						f=1;
						System.out.println(a[i-1]);break;
					}
					count=1;
				}
			}
			if(count==5&&f==0){
				
				System.out.println(a[i-1]);
			}
		}
	}

}