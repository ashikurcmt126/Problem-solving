#include<bits/stdc++.h>
using namespace std;
int main()
{
    int T,count=0;
    cin>>T;
    while(T-->0){
        int a[3];
        int sum=0;
        for(int i=0;i<3;i++){
            cin>>a[i];
            sum+=a[i];
        }
        if(sum>=2){
            count++;
        }
    }
    cout<<count<<endl;
}
