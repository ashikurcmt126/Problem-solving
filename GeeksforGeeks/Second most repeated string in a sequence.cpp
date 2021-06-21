#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t--){
        int n;cin>>n;
    string s[n];
    map<string,int> m;
    map<string,int> ::iterator it;
    for(int i=0;i<n;i++){
        cin>>s[i];
        m[s[i]]++;
    }

    int first=INT_MIN,second=INT_MIN;
    for(it=m.begin();it!=m.end();it++){
        if(it->second>first){
            second=first;
            first=it->second;
        }
        else if(it->second>second&&it->second!=second){
            second=it->second;
        }
    }
    for(it=m.begin();it!=m.end();it++){
        if(it->second==second){
            cout<<it->first<<endl;
        }
    }
    }

}