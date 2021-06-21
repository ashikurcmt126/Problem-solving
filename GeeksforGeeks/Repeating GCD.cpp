using namespace std;

long long int gcd(long long int a,long long int b)
{
    if(a==0)return b;
    else return gcd(b%a,a);
}
int main()
{
    int t;cin>>t;
    while(t-->0){
        long long int N,x,y;

        cin>>N>>x>>y;
        long long int ans=gcd(x,y);

        for(int i=0;i<ans;i++){
            cout<<N;
        }
        cout<<endl;
    }
}