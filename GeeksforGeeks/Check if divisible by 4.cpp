#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t-->0){
        string s;cin>>s;
        int c=0;
        int i=0;
       while(i<s.length()){
        while(c<4&&i<s.length()){
            c=c*10+s[i]-48;
            i++;
        }
        c=c%4;
       }


    if(c==0){
        cout<<"1"<<endl;
    }else
    cout<<"0"<<endl;
    }
    return 0;
}