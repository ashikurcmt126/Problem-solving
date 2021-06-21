#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t-->0){
        int n;cin>>n;int k;cin>>k;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    int count=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i!=j&&a[i]%a[j]==k){
              count++;
            }
        }
    }
    cout<<count;
    cout<<endl;
    }


}