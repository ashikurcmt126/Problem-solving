using namespace std;

bool product(int a[],int n,long int pro){
    int i,j;
    long int p=0;
    for(i=0;i<n;i++)
    {
        for(j=i;j<n;j++){
            p=a[i]*a[j];
            if(p==pro)
            return true;
        }
    }
    return false;
    
}

int main() {
	int t,n,i;
	long int p;
	cin>>t;
	while(t--)
	{
	    cin>>n;
	    cin>>p;
	    int a[n];
	    for(i=0;i<n;i++)
	    cin>>a[i];
	    if(product(a,n,p))
	    cout<<"Yes"<<endl;
	    else
	    cout<<"No"<<endl;
	}
	return 0;
}