#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n;
    cin>>n;
    int k;
    cin>>k;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    sort(a,a+n);
    int sum=0,c=0;

    for(int i=0;i<n;i++){
          if(sum+a[i]<=k){
            c++;
            sum=sum+a[i];
          }
          else
                break;

    }
    cout<<c<<endl;


    return 0;
}