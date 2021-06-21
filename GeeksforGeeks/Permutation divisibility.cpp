#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t-->0){
        string s;cin>>s;
    int count=0;
    for(int g=0;g<s.length();g++){
        string si=s.substr(g,s.length());
        si+=s.substr(0,g);

        int i=0;
        int c=0;
        while(i<si.length()){
            while(c<4&&i<si.length()){
                c=c*10+si[i]-'0';
                i++;
            }
            c%=4;
        }
        if(c==0)count++;
    }



    if(count>0)cout<<"1"<<endl;
    else cout<<"0"<<endl;
    }
}
