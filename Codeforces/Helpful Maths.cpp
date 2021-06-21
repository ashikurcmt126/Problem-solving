#include<bits/stdc++.h>
using namespace std;
int main()
{
    string s;cin>>s;
    vector<char> g1;
    for(int i=0;i<s.length();i++){
        if(s[i]!='+'){
            g1.push_back(s[i]);
        }
    }
    sort(g1.begin(),g1.end());
    cout<<g1.front();
    for(int i=1;i<g1.size();i++){
        cout<<"+"<<g1[i];
    }
}

