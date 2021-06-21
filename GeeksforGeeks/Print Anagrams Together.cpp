#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t-->0){
        int n;cin>>n;
    string s[n];
    for(int i=0;i<n;i++){
        cin>>s[i];
    }

    for(int i=0;i<n;i++){
        sort(s[i].begin(),s[i].end());
    }
    map<string,int> m;
    for(int i=0;i<n;i++){
        m[s[i]]++;
    }
    map<string,int> ::iterator it;
    vector<int> v;
    for(it=m.begin();it!=m.end();it++){
        v.push_back(it->second);
    }
    sort(v.begin(),v.end());
    for(int i=0;i<v.size();i++){
        cout<<v[i]<<" ";
    }
    cout<<endl;
    }
return 0;
}