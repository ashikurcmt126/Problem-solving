#include<stdio.h>
#include<iostream>
#include<algorithm>
/*
6
5 4 4 2 2 8
*/
using namespace std;
int main()
{
    int n;cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    sort(a,a+n);
    int min=a[0],c=0,b=0,k;
    cout<<n<<endl;
    while(a[n-1]!=0){
        for(int i=c;i<n;i++){
            a[i]=a[i]-min;
            if(a[i]==0){
                c++;
                b++;
            }
        }
        min=a[b];
       k=n-b;
       if(k>0){
        cout<<n-b<<endl;
       }
    }

return 0;
}