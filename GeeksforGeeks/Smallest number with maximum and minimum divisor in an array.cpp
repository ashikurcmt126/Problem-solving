#include<bits/stdc++.h>
#include <algorithm>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t-->0){
        int n;cin>>n;
        int a[n];
        for(int i=0;i<n;i++){
            cin>>a[i];
        }
         for(int i=0;i<1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    swap(a[i],a[j]);
                }
            }
        }
        for(int i=n-1;i>=n-1;i--){
            for(int j=i-1;j>=2;j--){
                if(a[j]>a[i]){
                    swap(a[i],a[j]);
                }
            }
        }
        int ai=a[0],b=a[n-1];
        while(b!=0){
            int r=ai%b;
            ai=b;b=r;
        }

        cout<<(a[0]*a[n-1])/ai<<endl;
    }
}