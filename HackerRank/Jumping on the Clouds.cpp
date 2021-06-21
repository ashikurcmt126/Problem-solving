#include<stdio.h>
#include<iostream>
#include<vector>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int vec[n];
    for(int i=0;i<n;i++){
        cin>>vec[i];
    }
    int j=0,count=0;
    int k=j;
    while(j!=n-1){
            k=j;
        if(vec[k+2]==0)
        {
            j=j+2;
           count++;
        }
        else
        {
          j=j+1;
          count++;
        }

    }
    cout<<count<<endl;

    return 0;

}