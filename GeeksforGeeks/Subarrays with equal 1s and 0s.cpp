#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t-->0){
        int n;cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
        if(a[i]==0)a[i]=-1;
    }
    unordered_map<int,int> m;
    int subSum=0,result=0;
    m[n]=1;
    for(int i=0;i<n;i++){
        subSum+=a[i];
        if(subSum==0){
            result+=m[subSum+n];
        }
        else if(m.find(subSum+n)!=m.end()){
           result+=m[subSum+n];
        }
        m[subSum+n]++;
    }
    cout<<result<<endl;
    }
}