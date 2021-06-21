#include<bits/stdc++.h>
/*
1 2 3
2 3 1
3 1 2
*/
using namespace std;
int main()
{
    int t;cin>>t;
    while(t-->0){
        int n;cin>>n;
        int m;cin>>m;
        int k;cin>>k;
        int a[n][m];
        k=k%m;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                cin>>a[i][j];
            }
        }
        int c=0;
        for(int i=0;i<n;i++){

          for(int j=0;j<k;j++){
                c=0;
            for(int l=c+1;l<m;l++){
                swap(a[i][c],a[i][l]);c++;
            }
          }
        }

        for(int i=0;i<n;i++){

            for(int j=0;j<m;j++){
                cout<<a[i][j]<<" ";
            }

        }
        cout<<endl;
    }
}