#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t--){
        int n,k;cin>>n>>k;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    int mood[n];
    int subSum=0;
    for(int i=0;i<n;i++){
            subSum+=a[i];
        mood[i]=((subSum%k)+k)%k;
    }
    //int subSum=0;
    unordered_map<int,int> m;
    int len=0;
    for(int i=0;i<n;i++){
        if(mood[i]==0){
            len=i+1;
        }
        else if(m.find(mood[i])==m.end()){
            m[mood[i]]=i;
        }
        else len=max(len,i-m[mood[i]]);
    }
    cout<<len<<endl;
    }
}