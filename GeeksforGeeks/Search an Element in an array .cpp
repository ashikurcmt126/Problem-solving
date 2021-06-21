using namespace std;
int main() 
{
	//code
	int n,t,a[100],i,x;
	cin>>t;
	while(t--)
	{
	    int flag=0;
	    cin>>n;
	    for(i=0;i<n;i++)
	    cin>>a[i];
	    cin>>x;
	    for(i=0;i<n;i++)
	    if(x==a[i])
	    {
	        flag=1;
	        cout<<i<<"\n";
	        break;
	    }
	    if(flag==0)
	    cout<<"-1\n";
	 }
	return 0;
}