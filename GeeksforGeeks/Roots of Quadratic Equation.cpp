using namespace std;
int main()
 {
	//code
	int t;
	cin>>t;
	while(t--)
	{
	    int a,b,c;
	    cin>>a>>b>>c;
	    double d,r1,r2;
	    d=((b*b)-4*a*c);
	    if(d<0)
	    {
	        cout<<"Imaginary"<<'\n';
	        continue;
	    }
	    d=sqrt(d);
	    r1=((-b)+d)/(2*a);
	    r2=((-b)-d)/(2*a);
	    cout<<floor(r1)<<" "<<floor(r2)<<'\n';
	}
	return 0;
}