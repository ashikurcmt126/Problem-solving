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
     //sort:
     sort(a,a+n);
     int med=0+((n-1)-0)/2;
     cout<<a[med]<<endl;  
    return 0;
}