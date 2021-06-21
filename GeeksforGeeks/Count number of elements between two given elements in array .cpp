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
        int p,q;cin>>p>>q;
        int i;
        for(i=0;i<n;i++){
            if(a[i]==p){
                break;
            }
        }
        //cout<<i<<endl;
        int temp=0;
        for(int j=i+1;j<n;j++){

            if(a[j]==q){
                temp=j;
            }
        }
        cout<<(temp-i)-1<<endl;
    }

}