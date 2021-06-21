#include<bits/stdc++.h>
using namespace std;
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
    for(int i=0;i<n;i++){
        for(int g=0;g<n;g++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(a[i][g]<a[j][k]){
                        swap(a[i][g],a[j][k]);
                    }
                }
            }
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            cout<<a[i][j]<<" ";
        }

    }
    cout<<endl;
    }
    return 0;
}