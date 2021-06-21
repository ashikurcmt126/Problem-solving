#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t-->0){
        long int n;cin>>n;
        long int sum=0,i=1,c=0;
        while(sum<=n){
           sum=sum+i;
           if(sum==n){
                c=1;
            cout<<i<<endl;
            break;
           }
           i++;
        }
        if(c==0){
            cout<<"-1"<<endl;
        }

    }
}