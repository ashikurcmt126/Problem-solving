#include <iostream>

using namespace std;

int gcd(int a,int b){
    if(b==0){
        return a;
    }
    gcd(b,a%b);
}
int main()
{
    int t;
    cin>>t;
    while(t-->0){
        long int a,b;
        cin>>a>>b;
        cout<<(a*b)/gcd(a,b)<<" "<<gcd(a,b)<<endl;
    }

}