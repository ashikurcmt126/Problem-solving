#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    sort(a,a+n);
   long sum=0;

    for(int i=n-1,j=0;i>=0;i--,j++){
        sum+=a[i]*(long)pow(2,j);
    }

    cout<<sum<<endl;  
    return 0;
}