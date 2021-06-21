#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t-->0){
        string s;cin>>s;
    int a[s.length()];
    for(int i=0;i<s.length();i++){
        a[i]=s[i]-48;
    }
    map<pair<int,int>,int > m;
    m[make_pair(0,0)]=1;
    int zero=0,one=0,two=0;
    int result=0;
    for(int i=0;i<s.length();i++){
        if(a[i]==0){
            zero++;
        }
        else if(a[i]==1)one++;
        else if(a[i]==2)two++;

        pair<int,int> boltu=make_pair(zero-one,zero-two);
        if(m.find(boltu)!=m.end()){
            result+=m[boltu];
        }
        m[boltu]++;
    }
    cout<<result<<endl;
    }
}