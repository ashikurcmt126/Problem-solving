#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
   int n,i;
    cin>>n;
    int a[n];
    for(i=0;i<n;i++){
        cin>>a[i];
    }
    int k=n-1;
    int s=a[k];
    while(a[k-1]>s){
        a[k]=a[k-1];
        for(i=0;i<n;i++){
            cout<<a[i]<<" ";
        }
        cout<<endl;
        k--;
    }
    a[k]=s;
    for(i=0;i<n;i++){
        cout<<a[i]<<" ";
    }
    
      
    return 0;
}