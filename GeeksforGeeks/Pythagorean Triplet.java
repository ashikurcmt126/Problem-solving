public class Pythagoran {
	public static void main(String args[]){
		Scanner sc=new  Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int check=0;
			for(int i=0;i<n-2;i++){
				for(int j=i+1;j<n-1;j++){
					for(int k=j+1;k<n;k++){
						int x=a[i]*a[i];
						int y=a[j]*a[j];
						int z=a[k]*a[k];
						if(z+x==y||x+y==z||y+z==x){
							check=1;break;
						}
					}
					if(check==1)break;
				}
				if(check==1)break;
			}
			if(check==1)System.out.println("Yes");else{
				System.out.println("No");
			}
		}
	}

}