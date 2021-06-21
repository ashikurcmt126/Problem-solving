#include<bits/stdc++.h>
using namespace std;

bool Ashikur(int i,int j,int n)
{
    if(i<0||i>=n||j<0||j>=n)return false;
    return true;
}
int main()
{
    int t;cin>>t;
    while(t-->0){
        int n;cin>>n;
    int a[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            cin>>a[i][j];
        }
    }
    vector<int> v;
    //vector<int> ::iterator it;
    for(int j=0;j<n;j++){
        //cout<<a[j][0]<<" ";
        v.push_back(a[j][0]);
        int k=j-1;
        int i=1;
        while(Ashikur(k,i,n)){
            //cout<<a[k][i]<<" ";
            v.push_back(a[k][i]);
            k--;i++;
        }
        for(int g=v.size()-1;g>=0;g--){
            cout<<v[g]<<" ";
        }
        //cout<<endl;
        v.clear();

    }
    int i=1;
    for(int j=0;j<n-1;j++){
        int k=n-1;
        int ashik=i;
        while(Ashikur(k,ashik,n)){
            //cout<<a[k][ashik]<<" ";
            v.push_back(a[k][ashik]);
            k--;ashik++;
        }
        for(int g=v.size()-1;g>=0;g--){
            cout<<v[g]<<" ";
        }
        //cout<<endl;
        i++;
        v.clear();
    }
    cout<<endl;
    }
    return 0;
}