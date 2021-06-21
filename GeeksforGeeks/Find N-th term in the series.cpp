#include<bits/stdc++.h>
using namespace std;
int main()
{
    long int t;cin>>t;
    while(t-->0){
        long int n;cin>>n;
       long int b=9,k=24;
        for(int i=1;i<=n-1;i++){

           b=b+k;
           k=k+16;
        }
        cout<<b<<endl;
    }
}