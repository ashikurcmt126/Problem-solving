#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;cin>>t;
    while(t-->0){
        int n,k;cin>>n>>k;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    int s=0,e=0,sum=0,max=INT_MAX;
    for(int i=0;i<n-k+1;i++){
            sum=0;int j;
        for(j=i;j<i+k;j++){
            sum+=a[j];
        }
        if(max>sum){
            s=i+1;e=j;
            max=sum;
        }
    }
    cout<<s<< " "<<e<<endl;
    }
}