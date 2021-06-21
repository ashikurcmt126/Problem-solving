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
    int min=0;
    sort (a,a+n);

    int max=a[n-1];
    for(int i=0;i<n;i++){
        min=abs(a[i]-a[i+1]);

        if(max>min){
            max=min;
        }
    }
cout<<max<<endl;
    return 0;
}