#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t--){
        string s;cin>>s;
        char ch1=s[s.length()-1];
        int k=ch1-48;
        int r=0;
        char ch;
        int ashik=0;
        for(int i=0;i<s.length()-1;i++){
            int c=s.at(i)-48;
            if(c%2==0){
                    ashik=1;
                r=i;
                ch=s.at(i);
            }
            if(c%2==0&&c<k){
                r=i;
                ch=s.at(i);break;
            }
        }
        if(ashik!=1){
            cout<<s<<endl;
        }
        else{
            s.at(r)=ch1;
        s.at(s.length()-1)=ch;
        cout<<s<<endl;
        }


    }
}