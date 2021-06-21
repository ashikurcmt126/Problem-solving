/*You are required to complete this method*/
int maxLen(int a[],int n){
    int g=0;
		for(int i=0;i<n;i++){
			if(a[i]!=1)a[i]=-1;
		}
		int max=0,sum=0;
		for(int i=0;i<n-1;i++){
			sum=0;sum+=a[i];
			for(int j=i+1;j<n;j++){
			   
				sum+=a[j];
				if(sum==0){
				     g=1;
					if(max<j-i){
						max=j-i;
					}
				}
			}
		}
		if(g==1)return max+1;
		else return 0;
	}