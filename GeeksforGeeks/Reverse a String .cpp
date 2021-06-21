using namespace std;
#define ll long long 
int main()
{
    ll t;
    cin>>t;
    while(t--)
    {
        string s;
        cin>>s;
        for(ll i=s.size()-1;i>=0;i--)
        cout<<s[i];
        cout<<"\n";
    }
    return 0;
}