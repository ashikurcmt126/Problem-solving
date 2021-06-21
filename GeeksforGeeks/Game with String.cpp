#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t-->0){
        string s;cin>>s;
    int k;cin>>k;
    map<char,int> m;
    map<char,int> :: iterator it;
    for(int i=0;i<s.length();i++){
        m[s[i]]++;
    }

    while(k!=0){
            int max=0;char ch;
        for(it=m.begin();it!=m.end();it++){
            if(max<it->second){
                max=it->second;
                ch=it->first;
            }
        }
        m[ch]--;
        k--;
    }
    int sum=0;
    for(it=m.begin();it!=m.end();it++){
        sum+=pow(it->second,2);
    }
    cout<<sum<<endl;
    }
    return 0;
}