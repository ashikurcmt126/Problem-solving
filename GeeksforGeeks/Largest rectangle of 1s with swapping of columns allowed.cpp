#include<bits/stdc++.h>
#define MAX 15
using namespace std;
int main()
{
   int t;cin>>t;
   while(t--){
     int n,m;
    cin>>n>>m;
    int a[MAX][MAX];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            cin>>a[i][j];
        }
    }
    int ashik[n+1][m+1];
    for(int i=0;i<m;i++){
        ashik[0][i]=a[0][i];

        for(int j=1;j<n;j++){
            if(a[j][i]==1){
                ashik[j][i]=ashik[j-1][i]+1;
            }else
            ashik[j][i]=0;
        }
    }

    for(int i=0;i<n;i++){
        int count[n+1]={0};
        for(int l=0;l<m;l++){
            count[ashik[i][l]]++;
        }
        int b=0;
        for(int j=n;j>=0;j--){
            if(count[j]>0){
                for(int g=0;g<count[j];g++){
                    ashik[i][b]=j;
                    b++;
                }
            }

        }
    }
    int ma=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
           ma=max(ma,(j+1)*ashik[i][j]);
        }

    }
    cout<<ma<<endl;
   }
}
