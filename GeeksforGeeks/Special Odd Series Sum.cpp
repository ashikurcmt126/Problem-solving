#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t-->0){
        int n;cin>>n;
        int sum=1,fs=0;
        int k=1;
        for(int i=1;i<=n;i++){
            fs=fs+sum;
            k=(k+2);
            sum=sum+k;

        }
        cout<<fs<<endl;
    }
}