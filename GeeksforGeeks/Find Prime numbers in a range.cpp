#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t-->0){
        int s,e;cin>>s>>e;
    for(int i=s;i<=e;i++){
            int check=0;
            if(i==1)continue;

        for(int j=2;j<=sqrt(i);j++){
            if(i%j==0){
               check=1;
    break;
            }
        }
        if(check==0){
            cout<<i<<" ";
        }
    }
    cout<<endl;
    }

    return 0;
}