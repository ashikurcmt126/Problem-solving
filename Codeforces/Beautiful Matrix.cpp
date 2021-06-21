#include<bits/stdc++.h>
using namespace std;
int main()
{
    int a[5][5];
    for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){
            cin>>a[i][j];
        }
    }
    int i,j,k=0;
    for(i=0;i<5;i++){
        for(j=0;j<5;j++){
            if(a[i][j]==1){
                k=1;
                break;
            }
        }
        if(k==1)break;
    }
    i++;j++;
    int result  = abs(3-i)+abs(3-j);
    cout<<result<<endl;
}
