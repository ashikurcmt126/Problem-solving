#include<bits/stdc++.h>
#define MAX 21
using namespace std;

void ashikur(char a[MAX][MAX],int i,int j,int N,int M,char pre,char next)
{
    if(i<0||i>=N||j<0||j>=M)return;

    if(a[i][j]!=pre)
        return;

    a[i][j]=next;
    ashikur(a,i+1,j,N,M,pre,next);
    ashikur(a,i-1,j,N,M,pre,next);
    ashikur(a,i,j+1,N,M,pre,next);
    ashikur(a,i,j-1,N,M,pre,next);
}
int main()
{
   int t;cin>>t;
   while(t-->0){
    char a[MAX][MAX];
   int N,M;
   cin>>N>>M;

    for(int i=0;i<N;i++){
        for(int j=0;j<M;j++){
            cin>>a[i][j];
        }
    }
    for(int i=0;i<N;i++){
        for(int j=0;j<M;j++){
            if(a[i][j]=='O'){
                a[i][j]='-';
            }
        }
    }
    for(int i=0;i<N;i++){
        if(a[i][0]=='-')
        ashikur(a,i,0,N,M,'-','O');
    }
    for(int i=0;i<N;i++){
        if(a[i][M-1]=='-'){
          ashikur(a,i,M-1,N,M,'-','O');
        }
    }
    for(int i=0;i<M;i++){
        if(a[0][i]=='-')
        ashikur(a,0,i,N,M,'-','O');

    }
    for(int i=0;i<M;i++){
        if(a[N-1][i]=='-')
            ashikur(a,N-1,i,N,M,'-','O');
    }

    for(int i=0;i<N;i++){
        for(int j=0;j<M;j++){
            if(a[i][j]=='-'){
                a[i][j]='X';
            }
        }
    }

    for(int i=0;i<N;i++){
        for(int j=0;j<M;j++){
            cout<<a[i][j]<<" ";
        }
    }
    cout<<endl;
   }
    return 0;
}