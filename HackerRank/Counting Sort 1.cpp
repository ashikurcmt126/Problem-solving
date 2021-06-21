#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n;

    cin>>n;

    int coun[100]={0};


    int a[n];

    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    

    for(int i=0;i<n;i++){
        coun[a[i]]++;
    }
    for(int i=0;i<100;i++){
       if(i==n-1){
           cout<<coun[i]<<endl;
       }
        else{
            cout<<coun[i]<<" ";
            }

    } 
  
    return 0;
}