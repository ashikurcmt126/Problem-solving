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
     int i,j,key,k=0,sum=0;
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    for(i=1;i<n;i++){
            k=0;
        j=i-1;
        key=a[i];
        while(j>=0&&a[j]>key){
            a[j+1]=a[j];
            j--;
            k++;
        }
        a[j+1]=key;
        sum=sum+k;
    }
    printf("%d\n",sum);
    return 0;
}