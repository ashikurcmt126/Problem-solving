#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t-->0){
        int n,m;cin>>n>>m;
    int a[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            cin>>a[i][j];
        }
    }
    int x;cin>>x;
    int i=0,j=m-1;
    int check=0;
    while(i<n&&j>=0){
        if(a[i][j]==x){
            cout<<"1"<<endl;
            check=1;break;
        }
        if(a[i][j]<x){
            i++;
        }else{
            j--;
        }
    }
    if(check==0)cout<<"0"<<endl;
    }
    return 0;
}