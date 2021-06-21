#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t-->0){
        int n,m;cin>>n>>m;
    int a[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            cin>>a[i][j];
        }
    }
    int totalsum=INT_MIN;
    for(int i=0;i<m;i++){
            int temp[n]={0};
        for(int j=i;j<m;j++){
            int sum=0;
            for(int k=0;k<n;k++){
                temp[k]+=a[k][j];
            }
            for(int g=0;g<n;g++){
                sum+=temp[g];
                if(sum<0){
                    sum=0;
                }
                if(totalsum<sum){
                    totalsum=sum;
                }
            }
        }
    }
    cout<<totalsum<<endl;
    }
return 0;
}