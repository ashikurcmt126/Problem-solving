#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t-->0){
        int n;cin>>n;
        int a[n];
        for(int i=0;i<n;i++){
            cin>>a[i];
        }
        int di=INT_MAX;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(abs(a[i]-a[j])<di){
                    di=abs(a[i]-a[j]);
                }
            }
        }
        cout<<di<<endl;
    }
}