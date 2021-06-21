#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t-->0){
        string s;cin>>s;

    map<char,int> m;
    int c=0;
    int max=0;
    for(int i=0;i<s.length();i++){
        m[s[i]]++;
        if(m[s[i]]>max){
            max=m[s[i]];
        }

    }
    if(s.length()%2==0){
        if(max>(s.length()/2)){
            cout<<"0"<<endl;
        }else
        cout<<"1"<<endl;
    }
    else{
       if(max>(s.length()/2)+1){
        cout<<"0"<<endl;
       }
       else cout<<"1"<<endl;
    }
    }
    return 0;
}