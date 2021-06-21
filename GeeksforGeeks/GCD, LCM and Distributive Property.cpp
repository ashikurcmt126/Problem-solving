GCD, LCM and Distributive Property
using namespace std;

long long int gcd(long long int x,long long int y)
{
    if(x==0)return y;
    return gcd(y%x,x);
}

long long int lcm(long long int x,long long int y)
{
    long long int temp=gcd(x,y);
    return (x*y)/temp;
}
int main()
{
    int t;
    long long int x,y,z;
    cin>>t;

    while(t-->0){
        cin>>x>>y>>z;
        long long int first=lcm(x,y);
        long long int last=lcm(x,z);

        long long int result=gcd(first,last);
        cout<<result<<endl;
    }
}