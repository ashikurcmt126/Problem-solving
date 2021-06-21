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
    int b[n][m];
     for(int i = 0; i < n; i++)
     b[i][0] = a[i][0];

  for(int j = 0; j < m; j++)
     b[0][j] = a[0][j];


  for(int i = 1; i < n; i++)
  {
    for(int j = 1; j < m; j++)
    {
      if(a[i][j] == 1)
        b[i][j] = min(b[i][j-1],min( b[i-1][j], b[i-1][j-1])) + 1;
      else
        b[i][j] = 0;
    }
  }

    int max_s=b[0][0],max_i=0,max_j=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(max_s<b[i][j]){
                    max_s=b[i][j];
                max_i=i;
                max_j=j;
            }
        }
    }
    cout<<max_s<<endl;

}
return 0;
}