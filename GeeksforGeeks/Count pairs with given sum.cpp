#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t-->0){
        int n;cin>>n;
        int data;cin>>data;
    int a[n];
    map<int,int> m;
    for(int i=0;i<n;i++){
        cin>>a[i];
        m[a[i]]++;
    }

    int count=0;
    for(int i=0;i<n;i++){
        int k=data-a[i];
        if(m.find(k)!=m.end()){
            m[a[i]]--;
            count+=m[k];
        }
    }
    cout<<count<<endl;
    }
    return 0;

}