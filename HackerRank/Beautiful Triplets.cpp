#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
   int n,m;

    cin>>n>>m;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    sort(a,a+n);
    int j;
    int c=0;
    for(int i=0;i<n-1;i++){

        for(j=i+1;j<n;j++){
            if((a[j]-a[i])==m){
               for(int k=j+1;k<n;k++){
                if(a[k]-a[j]==m){
                    c++;
                    break;

                }
               }
            }

        }

    }
cout<<c<<endl;
    return 0;
}