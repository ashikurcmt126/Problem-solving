#include<bits/stdc++.h>

using namespace std;

long long int gcd(long long int a,long long int b){
    if(b==0){
        return a;
    }
    gcd(b,a%b);
}

int main()
{
    long long int t,n;
    cin>>t;
    while(t-->0){
        cin>>n;
        long long int gc=1;
        for(int i=1;i<=n;i++){
            gc=(i * gc) /
                (gcd(i, gc));
        }

        cout<<gc<<endl;

    }
}