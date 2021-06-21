#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t-->0){
        int n;cin>>n;
        int m;cin>>m;
        vector<pair<char,char> >v;
        pair<char,char> p;
        for(int i=0;i<n;i++){
            cin>>p.first>>p.second;
            v.push_back(p);
        }
        string s;cin>>s;
        set<char> se;
        for(int i=0;i<s.length();i++){
            se.insert(s.at(i));
        }
        int c=0;
        for(int i=0;i<n;i++){
            p=v[i];
            if(se.find(p.first)!=se.end()&&se.find(p.second)!=se.end()){
                c++;
            }
        }
        cout<<c<<endl;

    }
}